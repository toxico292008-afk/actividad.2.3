package com.ejemplo.banco;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(500);

        Thread c1 = new Thread(new Cajero(cuenta, 300), "Cajero 1");
        Thread c2 = new Thread(new Cajero(cuenta, 300), "Cajero 2");
        Thread c3 = new Thread(new Cajero(cuenta, 300), "Cajero 3");

        c1.start();
        c2.start();
        c3.start();

        try {
            c1.join();
            c2.join();
            c3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}