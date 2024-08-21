package calculadora;

public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public FiguraGeometrica(double nombre) {
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
