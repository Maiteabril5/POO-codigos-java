import java.util.Scanner;

public class NumerosRomanos {

    // Función para obtener la cifra de las decenas de un número entero 
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para obtener la cifra de las unidades de un número 
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función para convertir un número entero de un dígito a su equivalente en romano
    public static String convertirUnidadesARomano(int unidad) {
        switch (unidad) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }
    // convertir un número entero de un dígito a su equivalente romano en decenas
    public static String convertirDecenasARomano(int decena) {
        switch (decena) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero entre 1 y 99:");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        } else {
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            String romanoDecenas = convertirDecenasARomano(decenas);
            String romanoUnidades = convertirUnidadesARomano(unidades);

            String resultado = romanoDecenas + romanoUnidades;
            System.out.println("El número en romano es: " + resultado);
        }

        scanner.close();
    }
}
