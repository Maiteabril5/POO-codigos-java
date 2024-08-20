public class FuncionAlgebraica {

    // Se realiza método estático que calcula el valor de f(x, y)
    public static int calcularFuncion(int x, int y) {
        return (x * x) + (2 * x * y) + (y * y);
    } 

    // Ponemos a prueba la función con el método principal
    public static void main(String[] args) {
        // Valores de ejemplo
        int x = 4;
        int y = 6;
        // Estos valores se pueden cambiar para probar otros resultados

        // Calcular el valor de f(x, y)
        int resultado = calcularFuncion(x, y);
        System.out.println("El valor de f(" + x + ", " + y + ") es: " + resultado);
    }
}
