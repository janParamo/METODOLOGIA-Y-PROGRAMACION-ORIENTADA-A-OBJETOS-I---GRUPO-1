package model;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int numMatricula;
    private double promedio;

    public Estudiante(String nombre, int numMatricula, double promedio) {
        this.nombre = nombre;
        this.numMatricula = numMatricula;
        this.promedio = promedio;
    }

    public void getPromedio() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el nombre del estudiante: ");
        this.nombre = input.nextLine();
        System.out.println("Introduce el numero de matricula (5 digitos): ");
        this.numMatricula = input.nextInt();
        System.out.println("Introduce el promedio del estudiante: ");
        this.promedio = input.nextDouble();
        if (this.promedio >= 70 && this.promedio <= 100) {
            System.out.println("Felicidades pasaste!!!");
        } else {
            System.out.println("Reprobaste");
        }

    }
}

