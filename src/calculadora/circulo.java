package calculadora;

public class circulo extends FiguraGeometrica {
    private double radio;

    public circulo() {
        super("Círculo");
        this.radio = radio;
    }

    public circulo(double nombre) {
        super(nombre);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
