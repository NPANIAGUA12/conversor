
import java.util.Scanner;

public class Principal {

    private static final HistorialConversiones historial = new HistorialConversiones();

    public static void main(String[] args) {
        int opcion = 0;

        System.out.println("\n-------------------------------------------------");
        String menu = """
              Bienvenido al conversor de divisa LatinExchange
              --- Porfavor seleccione una opción del menú ---
              -------------------------------------------------
              
              1 - Dollar a Peso Argentino
              2 - Dollar a Boliviano
              3 - Dollar a Real Brasileño
              4 - Dollar a Peso Chileno
              5 - Dollar a Peso Colombiano
              6 - Euro a Peso Argentino
              7 - Euro a Boliviano
              8 - Euro a Real Brasileño
              9 - Euro a Peso Chileno
              10 - Euro a Peso Colombiano
              11 - Mostrar el historial de conversiones
              12 - Salir
              -------------------------------------------------
              """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 12) {
            System.out.println(menu);
            System.out.println("Ingrese la opción:");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ConvertidorDivisa.convertirDivisa("ARS","USD");
                    break;
                case 2:
                    ConvertidorDivisa.convertirDivisa("BOB","USD");
                    break;
                case 3:
                    ConvertidorDivisa.convertirDivisa("BRL","USD");
                    break;
                case 4:
                    ConvertidorDivisa.convertirDivisa("CLP","USD");
                    break;
                case 5:
                    ConvertidorDivisa.convertirDivisa("COP","USD");
                    break;
                case 6:
                    ConvertidorDivisa.convertirDivisa("ARS","EUR");
                    break;
                case 7:
                    ConvertidorDivisa.convertirDivisa("BOB","EUR");
                    break;
                case 8:
                    ConvertidorDivisa.convertirDivisa("BRL","EUR");
                    break;
                case 9:
                    ConvertidorDivisa.convertirDivisa("CLP","EUR");
                    break;
                case 10:
                    ConvertidorDivisa.convertirDivisa("COP","EUR");
                    break;
                case 11:
                    historial.mostrarHistorial();
                    break;
                case 12:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Porfavor, ingrese una opción válida");
            }
        }
    }


}


