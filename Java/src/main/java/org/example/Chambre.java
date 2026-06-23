package org.example;

public class Chambre {
    private int num;
    private TypeChambre type;
    private double prixParNuit;
    private int nbrePersonnes;
    private StatutChambre statut;

    public Chambre(int num, TypeChambre type, double prixParNuit, int nbrePersonnes) {
        this.num = num;
        this.type = type;
        this.prixParNuit = prixParNuit;
        this.nbrePersonnes = nbrePersonnes;
        this.statut = StatutChambre.LIBRE;
    }

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

    public int getNum() { return num; }
    public TypeChambre getType() { return type; }
    public double getPrixParNuit() { return prixParNuit; }
    public int getNbrePersonnes() { return nbrePersonnes; }
    public StatutChambre getStatut() { return statut; }

    @Override
    public String toString() {
        return "Chambre n°" + num + " | " + type + " | " + prixParNuit + "Ar/nuit | " +
                nbrePersonnes + " pers. | " + statut;
    }
}
