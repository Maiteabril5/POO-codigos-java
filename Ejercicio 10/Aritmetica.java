import java.util.Scanner;

public class Aritmetica {

    // Funcion para aplicar una operacion aritmetica basada en el operador
    public static double realizarOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; 
                    // Retorna NaN en caso de división por cero
                }
            case "%":
                if (num2 != 0) {
                    return num1 % num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; 
                    // Retorna NaN en caso de división por cero
                }
            case "**":
                return Math.pow(num1, num2);
            default:
                System.out.println("Operador no reconocido.");
                return Double.NaN; 
                // Retorna NaN en caso de operador no reconocido
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos numeros enteros y el operador aritmetico
        System.out.println("Ingrese el primer nnmero entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero entero:");
        int num2 = scanner.nextInt();

        // Limpiar el buffer del scanner
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el operador aritmetico (+, -, *, /, %, **):");
        String operador = scanner.nextLine();

        // Realizar la operación y mostrar el resultado
        double resultado = realizarOperacion(num1, num2, operador);
        if (!Double.isNaN(resultado)) { // Mostrar el resultado solo si no es NaN
            System.out.println("El resultado de la operación es: " + resultado);
        }

        scanner.close();
    }
}
