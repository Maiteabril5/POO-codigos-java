public class Terrenos {

    // Hallar el área de un rectángulo
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Hallar la hipotenusa de un triángulo rectángulo
    public static double hallarHipotenusa(double catetoA, double catetoB) {
        return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }

    // Hallar el área de un triángulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Hallar el perímetro del terreno
    public static double perimetroTerreno(double ladoA, double ladoB, double ladoC) {
        // C se considera la hipotenusa en el caso de un triángulo rectángulo
        double hipotenusa = hallarHipotenusa(ladoA, ladoB);
        return ladoA + ladoB + hipotenusa;
    }

    // Aqui se realiza el codigo principal de las operaciones 
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Ingrese la longitud del lado A del terreno:");
        double ladoA = sc.nextDouble();

        System.out.println("Ingrese la longitud del lado B del terreno:");
        double ladoB = sc.nextDouble();

        System.out.println("Ingrese la longitud del lado C del terreno:");
        double ladoC = sc.nextDouble();

        // Área del rectángulo
        double areaRect = areaRectangulo(ladoA, ladoB);
        System.out.println("El área del rectángulo es: " + areaRect);

        // Hipotenusa
        double hipotenusa = hallarHipotenusa(ladoA, ladoB);
        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);

        // Área del triángulo
        double areaTriang = areaTriangulo(ladoA, ladoB);
        System.out.println("El área del triángulo es: " + areaTriang);

        // Perímetro del terreno
        double perimetro = perimetroTerreno(ladoA, ladoB, ladoC);
        System.out.println("El perímetro del terreno es: " + perimetro);

        sc.close();
    }
}
