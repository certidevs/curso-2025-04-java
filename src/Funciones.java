public class Funciones {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();

        Funciones.mostrarMensaje("¡Hola, clase!");

        int resultadoSuma = funciones.sumar(10,5);
        // System.out.println("La suma es: " + resultadoSuma);
        funciones.sumar(10,5);
        System.out.println(resultadoSuma);
        System.out.println(funciones.sumar(11,1));

        resultadoSuma++;
        System.out.println(resultadoSuma);

        String nombre = "María";

        funciones.saludar(nombre, resultadoSuma);
        funciones.saludar("María", 26);

        Funciones.mostrarFechaActual();

        System.out.println();

        funciones.imprimirNumeros(10);

        funciones.imprimirNumeros(1, 2, 3, 400, 5);

        // funciones.registrarUsuario("María", 26, "Avistamiento de aves", "Dibujar", "Videojuegos");

        funciones.multiplicacion(2); // 2 * 2 = 4
        funciones.multiplicacion(2, 5); // 2 * 5 = 10
        funciones.multiplicacion(2, 3, 5); // 2 * 3 * 5 = 30
    }

    public int sumar(int numero1, int numero2) {
        // return numero1 + numero2;
        int resultado = numero1 + numero2;
        // System.out.println("La suma es: " + resultado);
        Funciones.mostrarMensaje("Se ha hecho una suma");

        return resultado;
    }

    static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    static void mostrarDosMensaje(String mensaje1, String mensaje2) {
        System.out.println(mensaje1);
        System.out.println(mensaje2);
    }

    public void saludar(String nombre, int edad) {
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años.");
    }

    public static void mostrarFechaActual() {
        System.out.println(java.time.LocalTime.now());
        // return;
    }

    public void verificarEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
            return;
        }
        System.out.println("Edad: " + edad);
    }

    // varargs
    public void imprimirNumeros(int... numeros) {
        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
        // System.out.println();
    }
    // public void imprimirUnNumero(int numero);
    // public void imprimirDosNumeros(int numero1, int numero2);

    public void registrarUsuario(String nombre, int edad, String... intereses) {
        System.out.println("Usuario: " + nombre + ", Edad: " + edad);
        System.out.println("Intereses: " + String.join(", ", intereses));
    }

    // sobrecarga de métodos
    public int multiplicacion(int numero) {
        return numero * numero;
    }

    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int multiplicacion(int numero1, int numero2, int numero3) {
        return numero1 * numero2 * numero3;
    }

    Persona {
        String nombre;
        String apellido;
        int edad;

        actualizar(String nombre) {;
        actualizar(String nombre, int edad);
    }

}
