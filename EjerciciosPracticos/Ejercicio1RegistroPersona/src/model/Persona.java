package model;

public class Persona {

    private String name;
    private int age;

    // Se creara un metodo llamado mostrarDatos() que imprimira el nombre y la edad
    //Para ello se creara una clase que contendra a los atributos previamente declarados
    //De manera automatica, click secundario, generar, constructor, y se seleccionan los atributos


    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Opcion de mostrar datos
    public String showInfoPersona(){
        return "Persona " + this.name + ", " + this.age;
    }

}
