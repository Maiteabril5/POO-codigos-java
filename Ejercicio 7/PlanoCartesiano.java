import java.util.Scanner;

public class PlanoCartesiano {
 
    //hallar la distancia entre los puntos 
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

    //hallar la pendiente de la recta que uno los puntos 
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        double pendiente = (y2 - y1) / (x2 - x1);
        return pendiente;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        //se calcula la distancoia entre los dos puntos 
        double distancia = calcularDistancia(x1, y1, x2, y2);
        // se calcula la pendiente de la recta que une los puntos 
        double pendiente = calcularPendiente(x1, y1, x2, y2);

        System.out.println("La distancia entre los dos puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los dos puntos es: " + pendiente);

        scanner.close();
    }
}