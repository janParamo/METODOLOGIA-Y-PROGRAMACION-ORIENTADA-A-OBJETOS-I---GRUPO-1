import model.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Engels", 18);
        System.out.println(persona);

        //Mostrar informacion del coche
        // Cuando es String recordar que debe de ir encerrado en comillas
        Coche coche = new Coche("Toyota", "Turbo", 2025);
        System.out.println(coche);

        //libro
        Libro libro = new Libro("Juanito", "Juanito", 2025);
        System.out.println(libro);

        //crea objeto Scanner para obtener la entrada de la ventana de comandos
        CuentaBancaria cuenta = new CuentaBancaria("Inicial", 0.0);
        cuenta.setTitular();

        //Estudiante
        Estudiante estudiante = new Estudiante(",", 12345, 0);
        estudiante.getPromedio();
    }
}
