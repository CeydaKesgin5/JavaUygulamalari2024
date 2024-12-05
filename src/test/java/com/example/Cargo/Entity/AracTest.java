package com.example.Cargo.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AracTest {

    @Test
    void testAracEntity() {
        Arac arac = new Arac();
        arac.setPlaka("34ABC123");
        arac.setModel("Ford Focus");
        arac.setYukKapasitesi(1500.0);

        // Assertions
        assertEquals("34ABC123", arac.getPlaka());
        assertEquals("Ford Focus", arac.getModel());
        assertEquals(1500.0, arac.getYukKapasitesi());
        assertNotNull(arac);
    }
}
