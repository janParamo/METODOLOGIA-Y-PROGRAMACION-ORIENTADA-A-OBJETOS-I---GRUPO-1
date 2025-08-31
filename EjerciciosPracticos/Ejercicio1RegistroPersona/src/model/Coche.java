package model;

//Diseñar una clase Coche con atributos marca (String), modelo (String) y año (int).
// Añadir un método mostrarInfo() que muestre la información completa del coche.

public class Coche {

    private String marca;
    private String modelo;
    private int date;

    public Coche(String marca, String modelo, int date) {
        this.marca = marca;
        this.modelo = modelo;
        this.date = date;
    }

    public String showInfoCoche(){
        return "Marca: " + this.marca + ", Modelo: " + this.modelo + ", Date: " + this.date;
    }
}
