package com.mkdika.learnjava8.concurrency.waitnotify;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * This class is to demonstrate the thread-safe Producer & Consumer problem. -
 * While buffer stock > 0, the consumer can consume it. - While buffer stock <
 * 1, the producer need to produce until buffer stock.
 *
 */
public class ProducerConsumerProblem {

    private static final int TOTAL_CONSUMER_THREAD = 4;
    private static final int TOTAL_GOODS_TO_PRODUCE = 1_000_000;
    private static final int BUFFER_STOCK = 10_000;

    public static void main(String[] args) throws InterruptedException {
        long t1 = System.currentTimeMillis();
        System.out.println("Total consumer thread: " + TOTAL_CONSUMER_THREAD);
        System.out.println("Total to produce & consume: " + TOTAL_GOODS_TO_PRODUCE);
        System.out.println("Buffer Stock: " + BUFFER_STOCK);
        Goods goods = new Goods();
        goods.stockBuffer = BUFFER_STOCK;
        goods.toProduce = TOTAL_GOODS_TO_PRODUCE;
        Thread producer = new Thread(new Producer(goods), "Thread-producer");
        producer.start();

        Thread[] consumers = new Thread[TOTAL_CONSUMER_THREAD];
        for (int i = 0; i < consumers.length; i++) {
            consumers[i] = new Thread(new Consumer(goods, randInt(3, 10) * 10), "Thread-consumer-" + (i + 1));
            consumers[i].start();
        }

        producer.join();
        for (int i = 0; i < consumers.length; i++) {
            consumers[i].join();
        }

        System.out.println("Done!");
        System.out.println("Goods produce: " + goods.goodsProduce);
        System.out.println("Goods consume:" + goods.goodsConsume);
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - t1) + " msecs.");
    }

    private static int randInt(int min, int max) {
        return ((int) (Math.random() * ((max - min) + 1)) + min);
    }
}

class Producer implements Runnable {

    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        try {
            while (goods.goodsProduce < goods.toProduce) {
                produce();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    void produce() throws InterruptedException {
        synchronized (goods) {
            if (goods.goodsProduce < goods.toProduce) {
                if (goods.stockBallance == 0) {
//                    System.out.println("stock ballance is " + goods.stockBallance + ", " + Thread.currentThread().getName() + " start producing...");
                    do {
                        goods.stockBallance++;
                        goods.goodsProduce++;
                    } while (goods.stockBallance < goods.stockBuffer);
//                    System.out.println(Thread.currentThread().getName() + " done produce. stock ballance: " + goods.stockBallance);
                    goods.notifyAll();
                }else {
                    goods.wait();
                }
            }else {
                goods.notifyAll();
            }          
        }
    }
}

class Consumer implements Runnable {

    private Goods goods;
    private long consumingTime;

    public Consumer(Goods goods, long consumingTime) {
        this.goods = goods;
        this.consumingTime = consumingTime;
    }

    @Override
    public void run() {
        try {
            while (goods.goodsConsume < goods.toProduce) {
                consume();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    void consume() throws InterruptedException {
        synchronized (goods) {
            if (goods.goodsConsume < goods.toProduce) {
                if (goods.stockBallance > 0) {
                    goods.stockBallance--;
                    goods.goodsConsume++;
//                    System.out.println(Thread.currentThread().getName() + " consume! stock ballance: " + goods.stockBallance + ", total consume: " + goods.goodsConsume);
                    goods.notifyAll();
                } else {
//                    System.out.println(Thread.currentThread().getName() + " is waiting stock to produce.");
                    goods.wait();
                }
            }
        }
    }
}

class Goods {

    int goodsProduce = 0;
    int goodsConsume = 0;
    int stockBuffer = 0;
    int stockBallance = 0;
    int toProduce = 0;
}
