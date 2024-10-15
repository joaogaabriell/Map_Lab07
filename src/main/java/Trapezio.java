public class Trapezio implements ElementoConcretoIF {
    private double baseMaior, baseMenor, altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
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
            v.visitaTrapezio(this);
        } catch (Exception e) {
            System.err.println("Erro ao aceitar visita no Trapezio: " + e.getMessage());
            throw new RuntimeException("Falha ao aceitar visita no Trapezio", e);
        }
    }
}
