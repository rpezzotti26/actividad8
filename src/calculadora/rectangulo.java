package calculadora;

public class rectangulo extends FiguraGeometrica {
    private double longitud, ancho;

    public rectangulo(double longitud, double ancho) {
        super("Rectángulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}
