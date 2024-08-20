import java.util.Scanner;

public class Dias {

    // Función para obtener el nombre del día 
    public static String obtenerDiaSiguiente(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "Día invalido"; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el nombre del dia
        System.out.println("Ingrese el nombre de un día de la semana (lunes, martes, miércoles, jueves, viernes, sábado, domingo):");
        String dia = scanner.nextLine();

        // Obtener y mostrar el nombre del dia 
        String diaSiguiente = obtenerDiaSiguiente(dia);
        if (diaSiguiente.equals("Día inválido")) {
            System.out.println(diaSiguiente);
        } else {
            System.out.println("El día de mañana sera: " + diaSiguiente);
        }
        scanner.close();
    }
}
