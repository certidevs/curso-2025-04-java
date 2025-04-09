public class EstructurasDeControl {
    public static void main(String[] args) {

        // Control condicional con if, else if y else

        // if
        int edadIf = 18;

        if (edadIf >= 18) {
            System.out.println("Eres mayor de edad");
        }

        // else
        int horaElse = 8;

        if (horaElse < 12) {
            System.out.println("Buenos días");
        } else {
            System.out.println("Buenas tardes/noches");
        }

        // else if
        int horaElseIf = 14;

        if (horaElseIf < 12) {
            System.out.println("Buenos días");
        } else if (horaElseIf < 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        // condiciones anidadas
        int edadAnidada = 17;
        boolean tieneCarnet = false;

        if (edadAnidada >= 18) {
            if (tieneCarnet) {
                System.out.println("Puede conducir");
            } else {
                System.out.println("No puede conducir porque no tiene carnet");
            }
        } else {
            System.out.println("No puede conducir porque es menor de edad");
        }

        // operadores lógicos en condiciones
        int edadLog = 15;
        double salarioLog = 1500.0;

        if (edadLog >= 18 && salarioLog >= 1000.0) {
            System.out.println("Cumples los requisitos para el préstamo");
        }

        if (edadLog < 18 || salarioLog < 1000.0) {
            System.out.println("No cumple los requisitos para el préstamo");
        }

        if (!(edadLog < 18)) { // if (edadLog >= 18)
            System.out.println("No es menor de edad");
        }

        // if con una instrucción
        int edadUna = 18;

        if (edadUna >= 18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor de edad");

        // operador ternario
        String mensajeTer;
        int edadTer = 18;

        mensajeTer = (edadTer >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensajeTer);

    }
}
