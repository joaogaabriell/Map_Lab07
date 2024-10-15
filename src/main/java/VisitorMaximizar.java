public class VisitorMaximizar implements VisitorIF {
    @Override
    public void visitaCirculo(Circulo c) {
        try {
            c.setRaio(c.getRaio() * 2);
            System.out.println("Raio do Círculo maximizado para: " + c.getRaio());
        } catch (Exception e) {
            System.err.println("Erro ao maximizar o raio do círculo: " + e.getMessage());
            throw new RuntimeException("Falha ao maximizar o raio do círculo", e);
        }
    }

    @Override
    public void visitaRetangulo(Retangulo r) {
        try {
            r.setAltura(r.getAltura() * 2);
            r.setLargura(r.getLargura() * 2);
            System.out.println("Dimensões do Retângulo maximizadas.");
        } catch (Exception e) {
            System.err.println("Erro ao maximizar as dimensões do retângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao maximizar as dimensões do retângulo", e);
        }
    }

    @Override
    public void visitaTriangulo(Triangulo t) {
        try {
            t.setBase(t.getBase() * 2);
            t.setAltura(t.getAltura() * 2);
            System.out.println("Dimensões do Triângulo maximizadas.");
        } catch (Exception e) {
            System.err.println("Erro ao maximizar as dimensões do triângulo: " + e.getMessage());
            throw new RuntimeException("Falha ao maximizar as dimensões do triângulo", e);
        }
    }

    @Override
    public void visitaTrapezio(Trapezio tr) {
        try {
            tr.setBaseMaior(tr.getBaseMaior() * 2);
            tr.setBaseMenor(tr.getBaseMenor() * 2);
            tr.setAltura(tr.getAltura() * 2);
            System.out.println("Dimensões do Trapézio maximizadas.");
        } catch (Exception e) {
            System.err.println("Erro ao maximizar as dimensões do trapézio: " + e.getMessage());
            throw new RuntimeException("Falha ao maximizar as dimensões do trapézio", e);
        }
    }
}
