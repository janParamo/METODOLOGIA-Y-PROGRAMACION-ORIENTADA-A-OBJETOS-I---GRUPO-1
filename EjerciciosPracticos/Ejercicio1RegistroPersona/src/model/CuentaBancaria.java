package model;

import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el titular de la cuenta bancaria: ");
        this.titular = input.nextLine();

        System.out.println("Introduce el saldo de la cuenta bancaria: ");
        this.saldo = input.nextDouble();

        System.out.println("El nombre de la cuenta bancaria es: " + this.titular);
        System.out.print("El saldo es: " + this.saldo);
    }
}
