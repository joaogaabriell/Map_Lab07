public class VisitorCalcularArea implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        try {
            double area = Math.PI * c.getRaio() * c.getRaio();
            System.out.println("Área do Círculo: " + area);
        } catch (Exception e) {
            System.err.println("Erro ao calcular a área do círculo: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular a área do círculo", e);
        }
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        try {
            double area = r.getAltura() * r.getLargura();
            System.out.println("Área do Retângulo: " + area);
        } catch (Exception e) {
            System.err.println("Erro ao calcular a área do retângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular a área do retângulo", e);
        }
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        try {
            double area = (t.getBase() * t.getAltura()) / 2;
            System.out.println("Área do Triângulo: " + area);
        } catch (Exception e) {
            System.err.println("Erro ao calcular a área do triângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular a área do triângulo", e);
        }
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        try {
            double area = ((tr.getBaseMaior() + tr.getBaseMenor()) * tr.getAltura()) / 2;
            System.out.println("Área do Trapézio: " + area);
        } catch (Exception e) {
            System.err.println("Erro ao calcular a área do trapézio: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular a área do trapézio", e);
        }
    }
}
