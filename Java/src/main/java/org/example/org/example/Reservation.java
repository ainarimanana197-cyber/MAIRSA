package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.time.LocalDate;
import java.util.List;
@Data@AllArgsConstructor

public class Reservation {
    private int id;
    private Client client;
    private Employe employe;
    private List<Chambre> listChambres;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private ModePaiement modePayment;
    private double montantTotal;
    private StatutReservation statut;

    public long dureeSejour() {

        return dateDebut.until(dateFin).getDays();
    }

    public double calculMontantTotal() {
        long nbNuits = dureeSejour();
        double total = 0;
        for (Chambre c : listChambres) {
            total += c.calculTarif((int) nbNuits);
        }
        return total;
    }

    public void confirmerReservation() {
        this.statut = StatutReservation.CONFIRME;
        for (Chambre c : listChambres) {
            c.marquerCommeReservee();
        }
    }

    public void annulerReservation() {
        this.statut = StatutReservation.ANNULE;
        for (Chambre c : listChambres) {
            c.marquerCommeLibre();
        }
    }
}