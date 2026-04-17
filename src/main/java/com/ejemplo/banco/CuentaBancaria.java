package com.ejemplo.banco;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito: +" + monto + " | Saldo: " + saldo);
    }

    public synchronized void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println(Thread.currentThread().getName() + " intenta retirar: " + monto);

        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo actual: " + saldo);
        }

        saldo -= monto;
        System.out.println("Retiro exitoso: -" + monto + " | Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}