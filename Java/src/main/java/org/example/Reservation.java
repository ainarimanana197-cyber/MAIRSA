package org.example;

import java.time.LocalDate;
import java.util.List;

public class Reservation {
    private int id;
    private Client client;
    private Employe employe;
    private List<Chambre> listChambres;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private ModePayment modePayment;
    private double montantTotal;
    private StatutReservation statut;

    public Reservation(int id, Client client, Employe employe, List<Chambre> listChambres,
                       LocalDate dateDebut, LocalDate dateFin, ModePayment modePayment) {
        this.id = id;
        this.client = client;
        this.employe = employe;
        this.listChambres = listChambres;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.modePayment = modePayment;
        this.statut = StatutReservation.EN_ATTENTE;
        this.montantTotal = calculMontantTotal();
    }

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

    public int getId() { return id; }
    public Client getClient() { return client; }
    public Employe getEmploye() { return employe; }
    public List<Chambre> getListChambres() { return listChambres; }
    public LocalDate getDateDebut() { return dateDebut; }
    public LocalDate getDateFin() { return dateFin; }
    public ModePayment getModePayment() { return modePayment; }
    public double getMontantTotal() { return montantTotal; }
    public StatutReservation getStatut() { return statut; }

    @Override
    public String toString() {
        return "Reservation n°" + id + " | Client: " + client + " | Statut: " + statut +
                " | Du " + dateDebut + " au " + dateFin + " | Total: " + montantTotal + "Ar";
    }
}