public class VisitorDesenhar implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        try {
            System.out.println("Desenhando Círculo");
        } catch (Exception e) {
            System.err.println("Erro ao desenhar o círculo: " + e.getMessage());
            throw new RuntimeException("Falha ao desenhar o círculo", e);
        }
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        try {
            System.out.println("Desenhando Retângulo");
        } catch (Exception e) {
            System.err.println("Erro ao desenhar o retângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao desenhar o retângulo", e);
        }
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        try {
            System.out.println("Desenhando Triângulo");
        } catch (Exception e) {
            System.err.println("Erro ao desenhar o triângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao desenhar o triângulo", e);
        }
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        try {
            System.out.println("Desenhando Trapézio");
        } catch (Exception e) {
            System.err.println("Erro ao desenhar o trapézio: " + e.getMessage());
            throw new RuntimeException("Falha ao desenhar o trapézio", e);
        }
    }
}
