public class VisitorCalcularArea implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        double area = Math.PI * c.getRaio() * c.getRaio();
        System.out.println("Área do Círculo: " + area);
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        double area = r.getAltura() * r.getLargura();
        System.out.println("Área do Retângulo: " + area);
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        double area = (t.getBase() * t.getAltura()) / 2;
        System.out.println("Área do Triângulo: " + area);
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        double area = ((tr.getBaseMaior() + tr.getBaseMenor()) * tr.getAltura()) / 2;
        System.out.println("Área do Trapézio: " + area);
    }
}
