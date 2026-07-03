public class VisitorCalcularPerimetro implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        double perimetro = 2 * Math.PI * c.getRaio();
        System.out.println("Perímetro do Círculo: " + perimetro);
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        double perimetro = 2 * (r.getAltura() + r.getLargura());
        System.out.println("Perímetro do Retângulo: " + perimetro);
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        double perimetro = 3 * t.getBase();
        System.out.println("Perímetro do Triângulo: " + perimetro);
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        double perimetro = tr.getBaseMaior() + tr.getBaseMenor() + 2 * tr.getAltura();
        System.out.println("Perímetro do Trapézio: " + perimetro);
    }
}
