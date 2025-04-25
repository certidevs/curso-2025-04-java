package sintaxis;

import java.util.ArrayList;
import java.util.Date;

public class TiposDeDatos {

    public static void main(String[] args) {

        // Comentario

        // Crear una variable edad:

        int edad = 25;
        System.out.println(edad);

        double altura = 1.60;

        String nombre = "Alan";

        // Tipos enteros

        byte planta = 2;

        short salario = 2000;

        int numero = 12345689;

        long numeroGrande = 1000L;

        // Tipos de punto flotante (decimales)

        float decimal = 1.5f;

        double decimalPreciso = 1.55555;

        // Tipo carácter

        char caracter = 'a';
        char cifra = '2';

        // Tipo booleano

        boolean premium = true;

        // Se pueden añadir guiones bajos para facilitar la lectura

        long numeroMuyGrande = 1_234_567_890_123L;

        // Tipos de referencia

        Date fecha = new Date();

        ArrayList<String> lista = new ArrayList<>();

        // Tipo String

        String nombreString = "Ana";
        String apellido = new String("García");

        // Concatenación
        String nombreCompleto = nombreString + " " + apellido;

        System.out.println(nombreCompleto);

        // Arrays

        // Array de enteros de tamaño 5
        int[] numeros = new int[5];

        int[] primos = {2, 3, 5, 7, 11};

        // Acceder a la posición del array (empieza por 0 siempre)
        numeros[0] = 10;

        // Conversión de tipos (casting)

        // Conversión implícita (automática)
        byte numeroByte = 25;
        int numeroEntero = numeroByte; // conversión implícita

        // Conversión explícita
        double numeroDoble = 9.78;
        System.out.println(numeroDoble);

        int numeroEnteroNuevo = (int) numeroDoble;
        System.out.println(numeroEnteroNuevo);

        // Autoboxing
        int primitivo = 42;
        Integer objeto = primitivo;

        // Unboxing
        Double valorObjeto = 3.14;
        double valorPrimitivo = valorObjeto;

        // Conversiones entre String

        String textoNumero = "123";
        int number = Integer.parseInt(textoNumero);

        String desdeEntero = String.valueOf(42); // "42"

        // Conversiones entre caracteres y números

        char letraA = 'A';
        int valorNumericoA = letraA;

        System.out.println(valorNumericoA);
    }

}
