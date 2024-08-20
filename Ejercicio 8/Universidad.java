import java.util.Scanner;

public class Universidad {
    
    //utilizamos la funcion para calcular el numero de salones 
    public static int calcularNumSalones(int numEstudiantes, int capacidadSalon) {
        // Calcula el número de salones dividiendo el número total de estudiantes entre la capacidad de cada salón y redondeando hacia arriba.
        int numSalones = (int) Math.ceil((double) numEstudiantes / capacidadSalon);
        return numSalones;
    }
    // estas lineas para calcular el numero de pisos
    public static int calcularNumPisos(int numSalones, int salonesPorPiso) {
        // Calcula el número de pisos dividiendo el número total de salones entre los salones por piso y redondeando hacia arriba.
        int numPisos = (int) Math.ceil((double) numSalones / salonesPorPiso);
        return numPisos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // se lee el numero de estudiantes, la capacidad de un salon y el numero de salones
        System.out.print("Ingrese el número total de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        System.out.print("Ingrese la capacidad de cada salón: ");
        int capacidadSalon = scanner.nextInt();
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        //numero de salones 
        int numSalonesTotales = calcularNumSalones(numEstudiantes, capacidadSalon);
        // numero de pisos
        int numPisosTotales = calcularNumPisos(numSalonesTotales, salonesPorPiso);

        System.out.println("El número total de salones necesarios es: " + numSalonesTotales);
        System.out.println("El número total de pisos necesarios es: " + numPisosTotales);
        scanner.close();
    }
}