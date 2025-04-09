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

        System.out.println("\n");

        // switch

        int diaSwitch = 14;
        String nombreDiaSwitch;

        switch (diaSwitch) {
            case 1:
                nombreDiaSwitch = "Lunes";
                break;
            case 2:
                nombreDiaSwitch = "Martes";
                break;
            case 3:
                nombreDiaSwitch = "Miércoles";
                break;
            case 4:
                nombreDiaSwitch = "Jueves";
                break;
            case 5:
                nombreDiaSwitch = "Viernes";
                break;
            case 6:
                nombreDiaSwitch = "Sábado";
                break;
            case 7:
                nombreDiaSwitch = "Domingo";
                break;
            default:
                nombreDiaSwitch = "día inválido";
        }
        System.out.println("El día " + diaSwitch + " es " + nombreDiaSwitch);

        // switch con String
        String fruta = "MANZANA";

        switch (fruta.toLowerCase()) {
            case "manzana":
                System.out.println("Las manzanas son rojas o verdes");
                break;
            case "platano":
                System.out.println("Los plátanos son amarillos");
                break;
            default:
                System.out.println("No conozco este tipo de fruta");
        }

        // switch con enumeraciones

        enum DiaSemana { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO }

        DiaSemana hoy = DiaSemana.MIERCOLES;

        switch (hoy) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("Es un día laboral");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("Es fin de semana");
                break;
        }

        int diaMej = 3;
        String nombreDiaMej = switch (diaMej) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "día inválido";
        };

        System.out.println(diaMej + ": " + nombreDiaMej);

        // multiple casos
        DiaSemana hoyMej = DiaSemana.MIERCOLES;

        String tipoDeJornada = switch (hoyMej) {
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> "Día laborable";
            case SABADO, DOMINGO -> "Fin de semana";
        };

        System.out.println(hoy + " es " + tipoDeJornada);

        // bloques de código con switch mejorado
        int mesMej = 7;
        String estacion = switch (mesMej) {
            case 12, 1, 2 -> {
                System.out.println("Hace frío");
                yield "Invierno";
            }
            case 3, 4, 5 -> {
                System.out.println("Las flores florecen");
                yield "Primavera";
            }

            case 6, 7, 8 -> {
                System.out.println("Hace calor");
                yield "Verano";
            }
            case 9, 10, 11 -> {
                System.out.println("Las hojas caen");
                yield "Otoño";
            }
            default -> {
                System.out.println("Mes inválido");
                yield "Desconocido";
            }
        };

        // bucle for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración número: " + i);
        }

        // varias variables de control
        for (int i = 1, j = 10; i <= 10 && j >= 1; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // for-each
        String[] frutas = {"Manzana", "Plátano", "Naranja", "Fresa"};

        for (String piezaDeFruta : frutas) {
            System.out.println("Fruta de temporada: " + piezaDeFruta);
        }


    }
}
