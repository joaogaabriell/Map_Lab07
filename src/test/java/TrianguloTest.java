import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void testGetSetBaseAltura() {
        Triangulo triangulo = new Triangulo(5.0, 10.0);

        assertEquals(5.0, triangulo.getBase(), "Base deve ser 5.0");
        assertEquals(10.0, triangulo.getAltura(), "Altura deve ser 10.0");

        triangulo.setBase(6.0);
        triangulo.setAltura(12.0);

        assertEquals(6.0, triangulo.getBase(), "Base deve ser 6.0");
        assertEquals(12.0, triangulo.getAltura(), "Altura deve ser 12.0");
    }

    @Test
    void testAceitaVisita() {
        Triangulo triangulo = new Triangulo(5.0, 10.0);
        VisitorCalcularArea visitor = new VisitorCalcularArea();

        assertDoesNotThrow(() -> triangulo.aceitaVisita(visitor), "Deve aceitar a visita sem lançar exceção");
    }
}
