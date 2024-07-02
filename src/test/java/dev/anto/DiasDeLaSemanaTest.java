package dev.anto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiasDeLaSemanaTest {
    private DiasDeLaSemana diasSemana;

    @BeforeEach
    public void setUp() {
        diasSemana = new DiasDeLaSemana();
    }

    @Test
    public void testCrearListaDeDias() {
        diasSemana.crearListaDeDias();
        List<String> dias = diasSemana.getDias();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("lunes"));
        assertTrue(dias.contains("martes"));
        assertTrue(dias.contains("miercoles"));
        assertTrue(dias.contains("jueves"));
        assertTrue(dias.contains("viernes"));
        assertTrue(dias.contains("sabado"));
        assertTrue(dias.contains("domingo"));
    }

    @Test
    public void testGetLargoDeLista() {
        diasSemana.crearListaDeDias();
        assertEquals(7, diasSemana.getLargoDeLista());
    }

    @Test
    public void testEliminarDia() {
        diasSemana.crearListaDeDias();
        boolean eliminado = diasSemana.eliminarDia("martes");
        assertTrue(eliminado);
        assertEquals(6, diasSemana.getLargoDeLista());
        assertFalse(diasSemana.getDias().contains("martes"));
    }

    @Test
    public void testGetDia() {
        diasSemana.crearListaDeDias();
        assertEquals("miercoles", diasSemana.getDia(2));
    }

    @Test
    public void testExisteDia() {
        diasSemana.crearListaDeDias();
        assertTrue(diasSemana.existeDia("viernes"));
        assertFalse(diasSemana.existeDia("lunesX"));
    }

    @Test
    public void testOrdenarDias() {
        diasSemana.crearListaDeDias();
        diasSemana.ordenarDias();
        List<String> diasOrdenados = diasSemana.getDias();
        assertEquals("domingo", diasOrdenados.get(0));
        assertEquals("jueves", diasOrdenados.get(1));
        assertEquals("sabado", diasOrdenados.get(5));
        assertEquals("viernes", diasOrdenados.get(6));
    }

    @Test
    public void testVaciarLista() {
        diasSemana.crearListaDeDias();
        diasSemana.vaciarLista();
        assertEquals(0, diasSemana.getLargoDeLista());
        assertTrue(diasSemana.getDias().isEmpty());
    }
}
