import java.util.Scanner;

public class Hermanos {

    // obtener el nombre del hermano mayor
    public static String obtenerHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        if (edad1 >= edad2 && edad1 >= edad3) {
            return nombre1;
        } else if (edad2 >= edad1 && edad2 >= edad3) {
            return nombre2;
        } else {
            return nombre3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer nombres y edades de los tres hermanos
        System.out.println("Ingrese el nombre del primer hermano:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la edad del primer hermano:");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el nombre del segundo hermano:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la edad del segundo hermano:");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el nombre del tercer hermano:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese la edad del tercer hermano:");
        int edad3 = scanner.nextInt();

        String hermanoMayor = obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);
        System.out.println("El hermano mayor es: " + hermanoMayor);

        scanner.close();
    }
}
