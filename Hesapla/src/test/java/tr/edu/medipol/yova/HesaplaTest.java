package tr.edu.medipol.yova;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class HesaplaTest {

    @Test
    void testTopla() {
        assertEquals(5, Hesapla.topla(2, 3));
        assertEquals(-1, Hesapla.topla(-2, 1));
        assertEquals(0, Hesapla.topla(0, 0));
    }

    @Test
    void testCikart() {
        assertEquals(3, Hesapla.cikart(5, 2));
        assertEquals(-5, Hesapla.cikart(0, 5));
        assertEquals(0, Hesapla.cikart(5, 5));
    }

    @Test
    void testCarpma() {
        assertEquals(6, Hesapla.carpma(2, 3));
        assertEquals(-6, Hesapla.carpma(2, -3));
        assertEquals(0, Hesapla.carpma(0, 5));
    }

    @Test
    void testBol() {
        assertEquals(2, Hesapla.bol(6, 3));
        assertEquals(-2, Hesapla.bol(-6, 3));
        assertThrows(IllegalArgumentException.class, () -> Hesapla.bol(6, 0));
    }
}
