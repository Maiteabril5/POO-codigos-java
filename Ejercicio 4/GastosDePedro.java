import java.util.Scanner;

public class GastosDePedro {

    //Utilizamos una funcion para calcular el gasto del arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.4;
    }
    //Utilizamos una funcion para calcular el gasto de comida 
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Aqui vamos a leer el sueldo de Pedro utilizando scanner para que el usuario ponga sus datos
        System.out.print("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();

        //Gasto arriendo
        double gastoArriendo = calcularGastoArriendo(sueldo);

        //Gasto comida
        double gastoComida = calcularGastoComida(sueldo);

        //Dinero restante
        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        System.out.println("Gasto en arriendo: $" + gastoArriendo);
        System.out.println("Gasto en comida: $" + gastoComida);
        System.out.println("Dinero restante: $" + dineroRestante);

        scanner.close();
    }
}