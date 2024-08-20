public class ElPaseo {

    public static int cantidadBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        //Vamos a calcular las sillas ocupadas por los estudiantes gordos y flacos
        int sillasOcupadas = (estudiantesGordos * 2) + estudiantesFlacos;

        //Se calcula la cantidad de buses que son necesarios 
        int busesNecesarios = (int) Math.ceil((double) sillasOcupadas / sillasPorBus);
        return busesNecesarios;

    }

    public static void main(String[] args) {
        // Valores ejemplos para realizar los calculos
        int sillasPorBus = 10;
        int estudiantesGordos = 30;
        int estudiantesFlacos = 50;
        
        int busesNecesarios = cantidadBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        System.out.println("Numero de buses necesarios: " + busesNecesarios);
    }


}