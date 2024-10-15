import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void testGetSetRaio() {
        Circulo circulo = new Circulo(5.0);
        assertEquals(5.0, circulo.getRaio(), "O raio deve ser 5.0");

        circulo.setRaio(10.0);
        assertEquals(10.0, circulo.getRaio(), "O raio deve ser 10.0");
    }

    @Test
    void testAceitaVisita() {
        Circulo circulo = new Circulo(5.0);
        VisitorCalcularArea visitor = new VisitorCalcularArea();

        assertDoesNotThrow(() -> circulo.aceitaVisita(visitor), "Deve aceitar a visita sem lançar exceção");
    }
}
