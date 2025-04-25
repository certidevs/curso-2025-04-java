package oop.animales;

public class PracticaClasesYObjetos {
    public static void main(String[] args) {

        // crear objetos
        //  mascotas
        Dog dog1 = new Dog("Guinea", "Méndez", 3, true, "Pomerania");
        Dog dog2 = new Dog("Akira", "Roldan",3 ,true , "Chiguagua");
        Dog dog3 = new Dog("Gilda", "nada",9, false, "speed aleman");
        Dog dog4 = new Dog("Thor", "nada",12, false, "Pastor aleman y boxer");
        Dog dog5 = new Dog("Chiky", "Israel",8 ,false , "Mestizo");

        Cat cat1 = new Cat("Nara", "David",3, "Común");
        Cat cat2 = new Cat("Luna", "Méndez", 2, "Persa");
        Cat cat3 = new Cat("txispin", "Antonio", 10, "callejero");
        Cat cat4 = new Cat("Kozka", "Iñigo", 6, "Común europeo");
        Cat cat5 = new Cat("Beltza", "Sophia", 5, "Común europeo");
        Cat cat6 = new Cat("Txuri", "Luna", 6, "Común europeo");
        Cat cat7 = new Cat("tanya","Manuel",3,"Mestizo");

        // animal salvaje
        Wolf wolf1 = new Wolf("Bosque", 7, true);

        // probar métodos de oop.Dog
        System.out.println(dog1.toString());
        dog2.eat();
        dog3.sleep();
        dog4.playWithOwner();
        dog5.bark();

        System.out.println();

        System.out.println(cat1.toString());
        cat2.eat();
        cat3.sleep();
        cat4.meow();
        cat5.eat();
        cat6.sleep();
        cat7.meow();

        System.out.println();

        // probar métodos de Lobo
        System.out.println(wolf1.toString());
        wolf1.eat();
        wolf1.sleep();
        wolf1.hunt();
        wolf1.howl();

        System.out.println();

        wolf1.changeAge(-4);
        wolf1.changeAge(7);
        wolf1.changeAge(6);
        wolf1.changeAge(8);
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

// clase Mascota (oop.Pet) que hereda de oop.Animal
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

// clase AnimalSalvaje (oop.WildAnimal) que hereda de oop.Animal
abstract class WildAnimal extends Animal {
    // atributos específicos
    protected String habitat; // hábitat
    protected boolean endangeredSpecies; // especie amenazada

    // constructor
    public WildAnimal(String habitat, int age, boolean endangeredSpecies) {
        super(age); // llamamos al constructor de oop.Animal
        this.habitat = habitat;
        this.endangeredSpecies = endangeredSpecies;
    }

    // método concreto de animales salvajes
    public void hunt() {
        System.out.println("El animal salvaje está cazando en el hábitat " + habitat);
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
        return "oop.Animal salvaje del hábitat: " + habitat +
                ", Edad: " + age +
                ", En peligro de extinción: " + (endangeredSpecies ? "Sí" : "No");
    }
}

// clase Perro (oop.Dog) que hereda de oop.Pet (Mascota)
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
        System.out.println(name + " dice: ¡Guau, guau!");
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
        return "oop.Dog{" +
                "pedigree=" + pedigree +
                ", breed='" + breed + '\'' +
                '}';
    }*/
}

// clase Gato (oop.Cat)
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
        System.out.println(name + " come sardinas.");
    }

    @Override
    public void sleep(){
        System.out.println(name + " está durmiendo en el sofá.");
    }

    // métodos específicos
    public void meow() {
        System.out.println(name + " dice: ¡Miau!");
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

// clase Lobo (oop.Wolf) que hereda de AnimalSalvaje (oop.WildAnimal)
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
        System.out.println("El lobo duerme en el hábitat " + habitat);
    }

    // método específico de lobo
    public void howl() {
        System.out.println("El lobo aulla: ¡AUUUUUUU~!");
    }
}