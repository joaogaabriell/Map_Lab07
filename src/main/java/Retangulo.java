public class Retangulo implements ElementoConcretoIF {
    private double altura, largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        try {
            v.visitaRetangulo(this);
        } catch (Exception e) {
            System.err.println("Erro ao aceitar visita no Retangulo: " + e.getMessage());
            throw new RuntimeException("Falha ao aceitar visita no Retangulo", e);
        }
    }
}
