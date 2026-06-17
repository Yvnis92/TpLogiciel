package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StatistiqueTests {

    @Test
    void calculerPrixMoyenAvecDeuxVoitures() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        statistique.ajouter(new Voiture("Ferrari", 3000));
        statistique.ajouter(new Voiture("Porsche", 3000));

        Echantillon echantillon = statistique.prixMoyen();

        assertEquals(3000, echantillon.getPrixMoyen());
        assertEquals(2, echantillon.getNombreDeVoitures());
    }

    @Test
    void calculerPrixMoyenAvecPrixDifferents() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        statistique.ajouter(new Voiture("Renault", 1000));
        statistique.ajouter(new Voiture("Peugeot", 3000));

        Echantillon echantillon = statistique.prixMoyen();

        assertEquals(2000, echantillon.getPrixMoyen());
        assertEquals(2, echantillon.getNombreDeVoitures());
    }
}