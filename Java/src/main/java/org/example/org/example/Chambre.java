package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Chambre {
    private int num;
    private TypeChambre type;
    private double prixParNuit;
    private int nbrePersonnes;
    private StatutChambre statut;

    public void marquerCommeReservee() {

        this.statut = StatutChambre.RESERVEE;
    }

    public void marquerCommeLibre() {

        this.statut = StatutChambre.LIBRE;
    }

    public boolean estDisponible() {

        return this.statut == StatutChambre.LIBRE;
    }

    public double calculTarif(int nbNuits) {

        return this.prixParNuit * nbNuits;
    }
}
