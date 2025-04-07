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


        
    }

}
