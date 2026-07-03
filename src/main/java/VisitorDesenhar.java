public class VisitorDesenhar implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        System.out.println("Desenhando Círculo");
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        System.out.println("Desenhando Retângulo");
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        System.out.println("Desenhando Triângulo");
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        System.out.println("Desenhando Trapézio");
    }
}
