import java.util.Scanner;

public class Sueldo {

    // calcular el valor del aumento segun el sueldo actual
    public static double calcularAumento(double sueldoActual) {
        double aumento;
        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10; 
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08;
        } else {
            aumento = sueldoActual * 0.05; 
        }
        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el sueldo actual del empleado
        System.out.println("Ingrese el sueldo actual del empleado:");
        double sueldoActual = scanner.nextDouble();

        // Calcular el valor del aumento
        double aumento = calcularAumento(sueldoActual);

        // Calcular el nuevo sueldo
        double nuevoSueldo = sueldoActual + aumento;

        System.out.println("El valor del aumento es: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSueldo);

        scanner.close();
    }
}
