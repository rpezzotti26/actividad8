package calculadora;

public class pentagono extends FiguraGeometrica {
    private double lado, apotema;

    public pentagono(double lado, double apotema) {
        super("Pentágono");
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}
