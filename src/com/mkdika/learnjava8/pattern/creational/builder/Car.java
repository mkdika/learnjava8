package com.mkdika.learnjava8.pattern.creational.builder;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 *
 * This class is to demo tightly couple Builder pattern with Car Builder as
 * example, using static class as the Builer class helper, and support for
 * immutable object creation.
 *
 * This is also demonstrate how to solve the Telescophic Constructor
 * Anti-pattern problem yet elegant human readable object construction.
 *
 */
public class Car {

    // Mandatory field
    private final String brand;
    private final int capacity;

    // optional field
    private final CarColor color;
    private final CarTransmission transmission;
    private final boolean parkingCamera;
    private final boolean gps;
    private final boolean racingKit;

    public void printCarStatus() {
        System.out.println("Brand              : " + brand);
        System.out.println("Capacity           : " + capacity);
        System.out.println("Color              : " + color);
        System.out.println("Transmission       : " + transmission);
        System.out.println("Have Parking Camera: " + parkingCamera);
        System.out.println("Have GPS           : " + gps);
        System.out.println("With Racing Kit    : " + racingKit);
    }
    
    public static Builder builder(String brand, int capacity) {
        return new Builder(brand, capacity);
    }

    public static class Builder {

        private final String brand;
        private final int capacity;

        private CarColor color;
        private CarTransmission transmission;
        private boolean parkingCamera;
        private boolean gps;
        private boolean racingKit;

        {
            color = CarColor.SILVER;
            transmission = transmission.MANUAL;
            parkingCamera = true;
            gps = false;
            racingKit = false;
        }

        public Builder(String brand, int capacity) {
            this.brand = brand;
            this.capacity = capacity;
        }

        public Builder color(CarColor color) {
            this.color = color;
            return this;
        }
        
        public Builder transmission(CarTransmission transmission) { 
            this.transmission = transmission;
            return this;
        }
        
        public Builder parkingCamera(boolean parkingCamera) {
            this.parkingCamera = parkingCamera;
            return this;
        }
        
        public Builder gps(boolean gps) {
            this.gps = gps;
            return this;
        }
        
        public Builder racingKit(boolean racingKit) {
            this.racingKit = racingKit;
            return this;
        }
        
        public Car Build() {
            return new Car(this);
        }
    }
    
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.capacity = builder.capacity;
        this.color = builder.color;
        this.transmission = builder.transmission;
        this.parkingCamera = builder.parkingCamera;
        this.gps = builder.gps;
        this.racingKit = builder.racingKit;
    }

}

enum CarColor {
    BLUE, RED, GREEN, BLACK, SILVER;
}

enum CarTransmission {
    AUTO, MANUAL;
}

class CarDemo {

    public static void main(String[] args) {
        System.out.println("Standard Car:");
        Car standardCar = Car.builder("Nissan March", 300).Build();
        
        standardCar.printCarStatus();
        
        System.out.println();
        
        System.out.println("Racing Car:");
        Car racingCar = Car.builder("Nissan Skyline", 3000)
                .color(CarColor.BLUE)
                .transmission(CarTransmission.AUTO)
                .parkingCamera(true)
                .gps(true)
                .racingKit(true)
                .Build();
        racingCar.printCarStatus();                
    }
}