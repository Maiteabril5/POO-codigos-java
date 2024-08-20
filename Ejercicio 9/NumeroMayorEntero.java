import java.util.Scanner;

public class NumeroMayorEntero {

    //esta funcion es para hallar el mayor de dos numeros enteros 
    public static int obtenerMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //leer los numeros enteros que el usuario ponga 
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mayor = obtenerMayor(numero1, numero2);

        System.out.println("El número mayor es: " + mayor);
        scanner.close(); {
        
            
        }
    }
}