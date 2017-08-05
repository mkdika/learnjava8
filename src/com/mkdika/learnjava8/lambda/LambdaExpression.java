package com.mkdika.learnjava8.lambda;

/**
 *
 * @author maikel
 *
 * Salah satu fitur baru terbesar dalam Java 8 Language Level adalah 'Lambda
 * Expression'.
 *
 * Sintaks utama dari 'Lambda Expression' adalah:
 *      
 *      Parameter -> Expression Body
 *
 * Terdapat 4 aturan penting dalam mengunakan Lamdba Expression: - Deklarasi
 * type data parameter adalah opsional. - Mengunakan tanda kurung pada parameter
 * adalah opsional apabila kita hanya memiliki satu parameter. - Mengunakan
 * tanda kurung kurawal (curly braces) adalah opsional, kecuali kita memiliki
 * lebih dari 1 statement java. - Keyword 'return' adalah opsional jika kita
 * hanya memiliki expresi tunggal yang mengembalikan nilai.
 */
public class LambdaExpression {

    public static void main(String[] args) {
        /*
        CONTOH - 1
        Mengunakan Runnable yang mengimplementasikan LambdaExpression
        - Object r1 mengunakan pendekatan Anonymous Class
        - Object r2 mengunakan Lambda Expression
        Keduanya menghasilkan hal yang sama, namun sintaks dengan Lambda
        Expression lebih singkat.
         */
        System.out.println("===== CONTOH  1 =====");
        // Dengan Anonymous Class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };        
        // Dengan Lambda Expression
        Runnable r2 = () -> System.out.println("Hello world two!");
        
        // run
        r1.run();
        r2.run();
        System.out.println("=====================");  
        
        
        /*
        CONTOH - 2
        Mengunakan Lambda Expression untuk mengimplementasikan
        class interface secara langsung.
        */
        System.out.println("===== CONTOH  2 =====");
        OperasiMatematik tambah = (int a, int b) -> a+b;
        OperasiMatematik kurang = (a,b) -> a-b;
        
        System.out.println("7 + 3 = " + tambah.kalkulasi(7, 3));
        System.out.println("7 - 3 = " + kurang.kalkulasi(7, 3));
        System.out.println("====================="); 
        
        /*
        CONTOH - 3        
        */
        Printer epson = type -> { 
            System.out.println("this is epson printer,");
            System.out.println("a dot matrix printer.");
            System.out.println("Type: " + type);
        };
        epson.print("LX501");
        
    }

    /**
     * The use of tag @FunctionalInterface to strictly tell compiler
     * the interface class only have a single abstract method.
    */
    @FunctionalInterface
    interface OperasiMatematik {
        int kalkulasi(int a,int b);           
    }  
    
    @FunctionalInterface
    interface Printer {
        void print(String type);          
    }        
}
