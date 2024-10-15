import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void testGetSetAlturaLargura() {
        Retangulo retangulo = new Retangulo(4.0, 6.0);

        assertEquals(4.0, retangulo.getAltura(), "Altura deve ser 4.0");
        assertEquals(6.0, retangulo.getLargura(), "Largura deve ser 6.0");

        retangulo.setAltura(5.0);
        retangulo.setLargura(7.0);

        assertEquals(5.0, retangulo.getAltura(), "Altura deve ser 5.0");
        assertEquals(7.0, retangulo.getLargura(), "Largura deve ser 7.0");
    }

    @Test
    void testAceitaVisita() {
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        VisitorCalcularArea visitor = new VisitorCalcularArea();

        assertDoesNotThrow(() -> retangulo.aceitaVisita(visitor), "Deve aceitar a visita sem lançar exceção");
    }
}
