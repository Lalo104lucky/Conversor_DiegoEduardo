import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Conversor de unidades de medida\n");
            System.out.println("1. Kilometros a Millas");
            System.out.println("2. Litros a galones");
            System.out.println("3. Gramos a onzas");
            System.out.println("4. Centímetros a pulgadas");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción:");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad en kilómetros:");
                    double km = leer.nextDouble();
                    double millas = km * 0.621371;
                    System.out.println("");
                    System.out.println(km + " kilómetros son " + millas + " millas.");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en litros:");
                    double litros = leer.nextDouble();
                    double galones = litros * 0.264172;
                    System.out.println("");
                    System.out.println(litros + " litros son " + galones + " galones.");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en gramos:");
                    double gramos = leer.nextDouble();
                    double onzas = gramos * 0.03527396;
                    System.out.println("");
                    System.out.println(gramos + " gramos son " + onzas + " onzas.");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en centímetros:");
                    double centimetros = leer.nextDouble();
                    double pulgadas = centimetros * 0.393701;
                    System.out.println("");
                    System.out.println(centimetros + " centímetros son " + pulgadas + " pulgadas.");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Cerrando Sesión...");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
}