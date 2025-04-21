public class ClasesYObjetos {
    // método main
    public static void main(String[] args) {

        Persona persona1 = new Persona("Ana", 25);
        persona1.saludar();

    }

    // clases
    static class Persona {
        private String nombre;
        private int edad;

        // constructor
        public Persona(String nombreDado, int edadDada) {
            this.nombre = nombreDado;
            this.edad = edadDada;
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
}