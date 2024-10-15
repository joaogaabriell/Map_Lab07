public class Circulo implements ElementoConcretoIF {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        try {
            v.visitaCirculo(this);
        } catch (Exception e) {
            System.err.println("Erro ao aceitar visita no Circulo: " + e.getMessage());
            throw new RuntimeException("Falha ao aceitar visita no Circulo", e);
        }
    }
}
