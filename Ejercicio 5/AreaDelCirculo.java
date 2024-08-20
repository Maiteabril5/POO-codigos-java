import java.util.Scanner;

public class AreaDelCirculo {

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    // Función para calcular el área de la corona circular
    public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeno) {

        // Usamos la función calcularAreaCirculo para calcular las áreas de los círculos grande y pequeño
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);
        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);
        
        // El area de la corona circular es la diferencia entre las áreas de los dos círculos
        return areaCirculoGrande - areaCirculoPequeno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los valores de los radios
        System.out.print("Introduce el radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

        System.out.print("Introduce el radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        // Calcular el área de la corona circular
        double areaCorona = calcularAreaCoronaCircular(radioGrande, radioPequeno);

        System.out.println("El área de la corona circular es: " + areaCorona);
        
        scanner.close();
    }
}
