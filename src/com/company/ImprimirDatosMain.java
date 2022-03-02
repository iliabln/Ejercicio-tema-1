package com.company;

public class ImprimirDatosMain {

    public static void main(String[] args) {

        // 1. Numéricos enteros

        byte numero1 = 4;
        short numero2 = 60;
        int numero3 = 450;
        long numero4 = 999;

        System.out.println("byte: " + numero1);
        System.out.println("short: " + numero2);
        System.out.println("int: " + numero3);
        System.out.println("long: " + numero4);

        // 2. Numéricos decimales

        float numero5 = 3.14f;
        double numero6 = 36.6d;

        System.out.println("float: " + numero5);
        System.out.println("double: " + numero6);

        // 3. Booleano

        boolean variable1 = true;

        System.out.println("boolean: " + variable1);

        // 4. Texto

        char character = 'Y';
        String texto = "Hello Beautiful World!";

        System.out.println("char: " + character);
        System.out.println("String: " + texto);

    }

}
