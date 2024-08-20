//Vamos a importar un comando para que el usuario ponga los valores de altura y angulo 
import java.util.Scanner;

public class Escalera {
    //Realizo la funcion que calcula la longitud de la escalera 
    public static double calcularLongitudEscalera(double x, double anguloEnGrados) {
        //  se convierte los angulos de grados a radianes 
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        // Para calcular la longitud de la escalera tenemos que usar la funcion Seno
        double y = x / Math.sin(anguloEnRadianes);

        return y;
    }
//Aqui vamos a usar Scanner para que el codigo lea la entrada que el usuario desea
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//Altura
    System.out.print("Ingrese la altura de la escalera (en metros): ");
    double altura = scanner.nextDouble();

//Angulo inclinacion
    System.out.print("Ingresa el angulo de inclinacion de la escalera (en grados): ");
    double angulo = scanner.nextDouble();

//Clacular la longitud de la escalera 
    double longitudEscalera = calcularLongitudEscalera(altura, angulo);

    System.out.printf("La longitud de la escalera es: %.2f metros%n", longitudEscalera);

    scanner.close();
    

}
}
