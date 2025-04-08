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

        

    }
}
