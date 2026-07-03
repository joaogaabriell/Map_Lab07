public class VisitorMaximizar implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        c.setRaio(c.getRaio() * 2);
        System.out.println("Raio do Círculo maximizado para: " + c.getRaio());
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        r.setAltura(r.getAltura() * 2);
        r.setLargura(r.getLargura() * 2);
        System.out.println("Dimensões do Retângulo maximizadas.");
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        t.setBase(t.getBase() * 2);
        t.setAltura(t.getAltura() * 2);
        System.out.println("Dimensões do Triângulo maximizadas.");
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        tr.setBaseMaior(tr.getBaseMaior() * 2);
        tr.setBaseMenor(tr.getBaseMenor() * 2);
        tr.setAltura(tr.getAltura() * 2);
        System.out.println("Dimensões do Trapézio maximizadas.");
    }
}
