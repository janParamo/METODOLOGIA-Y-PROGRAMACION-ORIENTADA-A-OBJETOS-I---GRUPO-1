package models;

public class Student {
    //Atributos de la clase Student
    private String firstname;
    private String lastname;
    private String major;
    private float average;

    //Metodo - Contructor

    public Student(String firstname, String lastname, String major, float average) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
        this.average = average;
    }

    // getter and setter; se da click derecho, generate, getter and setter, se seleccionan todos los atributos


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    // El override, click derecho, generar, toString, se seleccionan los atributos

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", major='" + major + '\'' +
                ", average=" + average +
                '}';
    }
}
