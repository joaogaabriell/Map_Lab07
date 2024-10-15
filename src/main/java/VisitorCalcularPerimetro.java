public class VisitorCalcularPerimetro implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        try {
            double perimetro = 2 * Math.PI * c.getRaio();
            System.out.println("Perímetro do Círculo: " + perimetro);
        } catch (Exception e) {
            System.err.println("Erro ao calcular o perímetro do círculo: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular o perímetro do círculo", e);
        }
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        try {
            double perimetro = 2 * (r.getAltura() + r.getLargura());
            System.out.println("Perímetro do Retângulo: " + perimetro);
        } catch (Exception e) {
            System.err.println("Erro ao calcular o perímetro do retângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular o perímetro do retângulo", e);
        }
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        try {
            double perimetro = 3 * t.getBase();
            System.out.println("Perímetro do Triângulo: " + perimetro);
        } catch (Exception e) {
            System.err.println("Erro ao calcular o perímetro do triângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular o perímetro do triângulo", e);
        }
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        try {
            double perimetro = tr.getBaseMaior() + tr.getBaseMenor() + 2 * tr.getAltura();
            System.out.println("Perímetro do Trapézio: " + perimetro);
        } catch (Exception e) {
            System.err.println("Erro ao calcular o perímetro do trapézio: " + e.getMessage());
            throw new RuntimeException("Falha ao calcular o perímetro do trapézio", e);
        }
    }
}
