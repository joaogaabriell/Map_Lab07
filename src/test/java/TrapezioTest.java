import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrapezioTest {

    @Test
    void testGetSetBasesAltura() {
        Trapezio trapezio = new Trapezio(10.0, 5.0, 7.0);

        assertEquals(10.0, trapezio.getBaseMaior(), "Base maior deve ser 10.0");
        assertEquals(5.0, trapezio.getBaseMenor(), "Base menor deve ser 5.0");
        assertEquals(7.0, trapezio.getAltura(), "Altura deve ser 7.0");

        trapezio.setBaseMaior(12.0);
        trapezio.setBaseMenor(6.0);
        trapezio.setAltura(8.0);

        assertEquals(12.0, trapezio.getBaseMaior(), "Base maior deve ser 12.0");
        assertEquals(6.0, trapezio.getBaseMenor(), "Base menor deve ser 6.0");
        assertEquals(8.0, trapezio.getAltura(), "Altura deve ser 8.0");
    }

    @Test
    void testAceitaVisita() {
        Trapezio trapezio = new Trapezio(10.0, 5.0, 7.0);
        VisitorCalcularArea visitor = new VisitorCalcularArea();

        assertDoesNotThrow(() -> trapezio.aceitaVisita(visitor), "Deve aceitar a visita sem lançar exceção");
    }
}
