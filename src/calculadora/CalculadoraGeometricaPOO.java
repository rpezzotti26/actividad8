package calculadora;

import java.util.Scanner;

public class CalculadoraGeometricaPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();

            FiguraGeometrica figura = null;

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = scanner.nextDouble();
                    figura = new circulo(radio);
                }
                case 2 -> {
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    figura = new cuadrado(lado);
                }
                case 3 -> {
                    System.out.println("Ingrese la base del triángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double altura = scanner.nextDouble();
                    System.out.println("Ingrese los tres lados del triángulo:");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    double lado3 = scanner.nextDouble();
                    figura = new triangulo(base, altura, lado1, lado2, lado3);
                }
                case 4 -> {
                    System.out.println("Ingrese la longitud del rectángulo:");
                    double longitud = scanner.nextDouble();
                    System.out.println("Ingrese el ancho del rectángulo:");
                    double ancho = scanner.nextDouble();
                    figura = new rectangulo(longitud, ancho);
                }
                case 5 -> {
                    System.out.println("Ingrese el lado del pentágono:");
                    double lado = scanner.nextDouble();
                    System.out.println("Ingrese el apotema del pentágono:");
                    double apotema = scanner.nextDouble();
                    figura = new pentagono(lado, apotema);
                }
                case 0 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }

            if (figura != null) {
                System.out.println("Seleccione la operación:");
                System.out.println("1. Calcular Área");
                System.out.println("2. Calcular Perímetro");
                int operacion = scanner.nextInt();

                if (operacion == 1) {
                    System.out.println("Área de " + figura.getNombre() + ": " + figura.calcularArea());
                } else if (operacion == 2) {
                    System.out.println("Perímetro de " + figura.getNombre() + ": " + figura.calcularPerimetro());
                } else {
                    System.out.println("Operación no válida.");
                }
            }
        }

        scanner.close();
    }
}
