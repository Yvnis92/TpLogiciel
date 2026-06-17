package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture() {
        Voiture v = new Voiture("Ferrari", 2000);

        assertEquals("Ferrari", v.getMarque());
        assertEquals(2000, v.getPrix());
    }

    @Test
    void modifierPrixVoiture() {
        Voiture v = new Voiture("Ferrari", 2000);

        v.setPrix(3000);

        assertEquals(3000, v.getPrix());
    }

    @Test
    void modifierMarqueVoiture() {
        Voiture v = new Voiture("Ferrari", 2000);

        v.setMarque("Renault");

        assertEquals("Renault", v.getMarque());
    }

    @Test
    void modifierIdVoiture() {
        Voiture v = new Voiture("Ferrari", 2000);

        v.setId(1);
        assertEquals(1, v.getId());
    }

    @Test
    void afficherVoiture() {
        Voiture v = new Voiture("Ferrari", 2000);

        assertEquals(v.toString(), v.toString());
    }
}