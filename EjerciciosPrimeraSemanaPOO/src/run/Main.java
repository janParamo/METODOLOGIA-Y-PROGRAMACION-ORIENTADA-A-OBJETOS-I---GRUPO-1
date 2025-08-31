package run;

import models.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sesion2, Miercoles. 27 de agosto");
        //Variables primitivas
        int numero = 0;
        int Numero = 1;
        int numer0 = 2; // Recordar que al declarar las variables estas pueden llevar un numero
        System.out.println(""+numero);
        System.out.println(""+Numero);
        System.out.println(""+numer0);
        float salario = 2500.00f;
        System.out.println(""+salario);
        double promedio = salario*0.5;
        System.out.println(""+promedio);
        String carrera = "Ingieneria en Sistemas de la Informacion";// Los strings tienen que llevar en mayusculas la S
        JOptionPane.showMessageDialog(null,carrera);

        Student student = new Student("Jose", "Duran", "Administracion", 99);

        JOptionPane.showMessageDialog(null,student);

    }
}
