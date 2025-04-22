public class PracticaClasesYObjetos {
    public static void main(String[] args) {

    }
}

// clase abstracta para todos los animales
abstract class Animal {
    // atributos comunes a todos los animales
    protected int age; // edad

    // constructor
    public Animal(int age) {
        this.age = age;
    }

    // métodos abstractos que deberían implementar las clases hijas
    public abstract void eat(); // comer()
    public abstract void sleep(); // dormir

    // getter y setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}