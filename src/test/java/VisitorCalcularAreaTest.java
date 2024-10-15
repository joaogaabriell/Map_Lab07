import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VisitorCalcularAreaTest {

    @Test
    void testVisitaCirculo() {
        Circulo circulo = new Circulo(5.0);
        VisitorCalcularArea visitor = new VisitorCalcularArea();

        assertDoesNotThrow(() -> visitor.visitaCirculo(circulo), "Não deve lançar exceção");
    }

    @Test
    void testVisitaTrapezio() {
        Trapezio trapezio = new Trapezio(10.0, 5.0, 7.0);
        VisitorCalcularArea visitor = new VisitorCalcularArea();

        assertDoesNotThrow(() -> visitor.visitaTrapezio(trapezio), "Não deve lançar exceção");
    }

    @Test
    void testVisitaTriangulo() {
        Triangulo triangulo = new Triangulo(5.0, 10.0);
        VisitorCalcularArea visitor = new VisitorCalcularArea();

        assertDoesNotThrow(() -> visitor.visitaTriangulo(triangulo), "Não deve lançar exceção");
    }
}
