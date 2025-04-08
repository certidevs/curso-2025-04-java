public class Operadores {
    public static void main(String[] args) {

        // Suma
        int a = 10;
        int b = 20;
        int suma = a + b;
        System.out.println("Suma entera: " + a + " + " + b + " = " + suma);

        double x = 15.5;
        double y = 4.5;
        double resultadoDouble = x + y;
        System.out.println("Suma decimal: " + x + " + " + y + " = " + resultadoDouble);


        // Concatenación
        String nombre = "Java";
        String version = "24";
        String completo = nombre + " " + version;
        System.out.println(completo);

        // Resta

        int aResta = 30;
        int bResta = 12;
        int resta = aResta - bResta;
        System.out.println("\nResta: " + aResta + " - " + bResta + " = " + resta);

        // Multiplicación
        int aMultiplicacion = 5;
        int bMultiplicacion = 6;
        int multiplicacion = aMultiplicacion * bMultiplicacion;
        System.out.println("\nMultiplicación: " + aMultiplicacion + " * " + bMultiplicacion + " = " + multiplicacion);

        // División
        int intADivision = 20;
        int intBDivision = 3;
        int divisionEntera = intADivision / intBDivision;
        System.out.println("\nDivisión entera: " + intADivision + " / " + intBDivision + " = " + divisionEntera);

        double xDivision = 20.0;
        double yDivision = 3.0;
        double divisionReal = xDivision / yDivision;
        System.out.println("División real: " + xDivision + " / " + yDivision + " = " + divisionReal);

        // Módulo (resto de la división)
        int aModulo = 17;
        int bModulo = 5;
        int modulo = aModulo % bModulo;

        // Incremento y decremento
        int contador = 10;
        System.out.println("\nContador: " + contador);
        contador++;
        System.out.println("++: " + contador);

        contador--;
        System.out.println("--: " + contador);

        // prefijo
        ++contador;

        // sufijo
        contador++;

        // Operadores aritméticos compuestos
        int numero10 = 10;

        // yo quiero sumar 5 a numero10
        // numero10 = numero10 + 5; // forma larga
        numero10 += 5;

        // Orden de precedencia

        int resultadoSinParentesis = 10 + 20 * 3; // 70
        int resultadoConParentesis = (10 + 20) * 3; // 90

        // Ejemplo
        int nota1 = 85;
        int nota2 = 90;
        int nota3 = 78;
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("\nPromedio: " + promedio);

        // Operadores de asignación
        int edad = 25;
        int aVar, bVar, cVar;
        aVar = bVar = cVar = 10; // a, b y c tienen valor 10

        // Operadores de bits
        int flags = 0b1010;
        flags &= 0b1100;

        // Operador de igual

        int aComparar = 5;
        int bComparar = 5;
        boolean sonIguales = (aComparar == bComparar);

        // Comparación de String
        String str1 = "hola";
        String str2 = "hola";
        boolean mismaReferencia = (str1 == str2);

        boolean comparacionString = str1.equals(str2);

        // Operador de desigualdad
        int xDesigualdad = 8;
        int yDesigualdad = 12;
        boolean sonDiferentes = (xDesigualdad != yDesigualdad);

        // Mayor que
        int edadPersona = 25;
        boolean esMayorDeEdad = (edad > 17);

        // Menor que
        int puntuacion = 65;
        boolean suspenso = (puntuacion < 70);

        // Comparación de tipos diferentes

        int entero = 100;
        long numeroLargo = 100L;
        boolean comparacionDiferentesTipos = (entero == numeroLargo);

        double decimal = 100.0;
        boolean otraComparacion = (entero == decimal);

        // Comparación de caracteres
        char c1 = 'A';
        char c2 = 'B';

        boolean menorQue = (c1 < c2); // true
        boolean mayorQue = ('z' > 'a'); // true

        // Comparación de objetos

        String cadena1 = "abc";
        String cadena2 = "def";

        boolean esMenor = cadena1.compareTo(cadena2) < 0;

        // Operador instanceof
        String texto = "Hola mundo";
        boolean esString = texto instanceof String;
        boolean esObject = texto instanceof Object;


    }
}
