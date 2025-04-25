package oop.personas;// import java.util.ArrayList;

public class ClasesYObjetos {
    // método main
    public static void main(String[] args) {

        Persona persona1 = new Persona("Ana", 25);
        persona1.saludar();

        System.out.println("Área del círculo: " + Matematicas.calcularAreaCirculo(5.0));


    }

    // clases
    static class Persona {
        private String nombre;
        private int edad;

        // constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void saludar() {
            System.out.println("Hola, me llamo " + nombre);
        }

        public int obtenerEdad() {
            return edad;
        }
    }

    static class CuentaBancaria {
        private double saldo;

        // getter
        public double getSaldo() {
            return saldo;
        }

        // setter
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void depositar(double monto) {
            if (monto > 0) {
                saldo += monto;
            }
        }

        public boolean retirar(double monto) {
            if (monto > 0 && saldo >= monto) {
                saldo -= monto;
                return true;
            }
            return false;
        }
    }

    static class Matematicas {
        public static double calcularAreaCirculo(double radio) {
            return Math.PI * radio * radio;
        }
    }

    public class Externa {
        private int valor = 10;

        public class Interna {
            public void mostrar() {
                System.out.println("Valor desde clase interna: " + valor);
            }
        }

        public void crearInterna() {
            Interna interna = new Interna();
            interna.mostrar();
        }
    }

    Externa externa = new Externa();
    Externa.Interna interna = externa.new Interna();

    // clases abstractas
    static abstract class Figura {
        protected String color;

        public Figura(String color) {
            this.color = color;
        }

        public abstract double calcularArea();

        // getter (método concreto)
        public String getColor() {
            return color;
        }
    }

    static class Circulo extends Figura {
        private  double radio;

        public Circulo(String color, double radio) {
            super(color);
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    public class Empleado {
        private int id;
        private String nombre;

        public Empleado(int id, String nombre) {
            this.id = id;
            this. nombre = nombre;
        }

        @Override
        public String toString() {
            return "Empleado{id=" + id + ", nombre='" + nombre + "'}";
        }

    }

    Empleado empleado1 = new Empleado(1, "Pedro");
}













