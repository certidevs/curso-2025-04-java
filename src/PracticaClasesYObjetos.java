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

    // método concreto
    /*public void eat() {
        System.out.println("El animal come.");
    }*/

    // método similar al setter pero con validaciones
    public void changeAge(int newAge) {
        if (newAge < 0) {
            System.out.println("La edad no puede ser negativa.");
        } else if (this.age == newAge) {
            System.out.println("La nueva edad es igual a la edad actual.");
        } else {
            this.age = newAge;
            System.out.println("La edad se ha cambiado a " + this.age);
        }
    }

    // getter y setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// clase Mascota (Pet) que hereda de Animal
abstract class Pet extends Animal {
    // atributos específicos de Mascota
    protected String name; // nombre
    protected String owner; // dueño

    // constructor
    public Pet(String name, String owner, int age) {
        super(age); // llamada al constructor de la clase padre
        this.name = name;
        this.owner = owner;
    }

    // método concreto de mascotas
    public void playWithOwner() {
        System.out.println(name + " está jugando con " + owner);
    }

    // getters y setter
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner() {
        this.owner = owner;
    }

    // toString para mostrar información
    @Override
    public String toString() {
        return "Mascota: " + name + ", Dueño: " + owner + ", Edad: " + age;
    }
}

// clase AnimalSalvaje (WildAnimal) que hereda de Animal
abstract class WildAnimal extends Animal {
    // atributos específicos
    protected String habitat; // hábitat
    protected boolean endangeredSpecies; // especie amenazada

    // constructor
    public WildAnimal(String habitat, int age, boolean endangeredSpecies) {
        super(age); // llamamos al constructor de Animal
        this.habitat = habitat;
        this.endangeredSpecies = endangeredSpecies;
    }

    // método concreto de animales salvajes
    public void hunt() {
        System.out.println("El animal salvaje está cazando en " + habitat);
    }

    // getters y setter
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangeredSpecies() {
        return endangeredSpecies;
    }

    public void setEndangeredSpecies(boolean endangeredSpecies) {
        this.endangeredSpecies = endangeredSpecies;
    }

    // toString para mostrar información
    @Override
    public String toString() {
        return "Animal salvaje del hábitat: " + habitat +
                ", Edad: " + age +
                ", En peligro de extinción: " + (endangeredSpecies ? "Sí" : "No");
    }
}

// clase Perro (Dog) que hereda de Pet (Mascota)
class Dog extends Pet {
    // atributos específicos de Perro
    private boolean pedigree;
    private String breed; // raza

    // constructor
    public Dog(String name, String owner, int age, boolean pedigree, String breed) {
        super(name, owner, age);
        this.pedigree = pedigree;
        this.breed = breed;
    }

    // implementar los métodos abstractos
    @Override
    public void eat() {
        System.out.println(name + " está comiendo huesos.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " está durmiendo en su camita.");
    }

    // métodos específico
    public void bark() {
        System.out.println(name + "dice: ¡Guau, guau!");
    }

    // getters y setter
    public boolean hasPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString personalizado
    @Override
    public String toString() {
        return super.toString() +
                ", Raza: " + breed +
                ", Pedigree: " + (pedigree ? "Sí" : "No");
    }

    // toString generado
    /*@Override
    public String toString() {
        return "Dog{" +
                "pedigree=" + pedigree +
                ", breed='" + breed + '\'' +
                '}';
    }*/
}

// clase Gato (Cat)
class Cat extends Pet {
    private String breed; // raza

    // constructor
    public Cat(String name, String owner, int age, String breed) {
        super(name, owner, age);
        this.breed = breed;
    }

    // implementar métodos abstractos
    @Override
    public void eat() {
        System.out.println(name + "come sardinas.");
    }

    @Override
    public void sleep(){
        System.out.println(name + "está durmiendo en el sofá.");
    }

    // métodos específicos
    public void meow() {
        System.out.println(name + "dice: ¡Miau!");
    }

    // getters y setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", Raza: " + breed;
    }
}

// clase Lobo (Wolf) que hereda de AnimalSalvaje (WildAnimal)
class Wolf extends WildAnimal {
    // constructor
    public Wolf(String habitat, int age, boolean endangeredSpecies) {
        super(habitat, age, endangeredSpecies);
    }

    // implementas los métodos abstractos
    @Override
    public void eat() {
        System.out.println("El lobo come carne.");
    }

    @Override
    public void sleep() {
        System.out.println("El lobo duerme en " + habitat);
    }

    // método específico de lobo
    public void howl() {
        System.out.println("El lobo aulla: ¡AUUUUUUU~!");
    }
}