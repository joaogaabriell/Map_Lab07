public class Triangulo implements ElementoConcretoIF {
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        try {
            v.visitaTriangulo(this);
        } catch (Exception e) {
            System.err.println("Erro ao aceitar visita no Triangulo: " + e.getMessage());
            throw new RuntimeException("Falha ao aceitar visita no Triangulo", e);
        }
    }
}
