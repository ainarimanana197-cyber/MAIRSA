package org.example;

public class Employe{
    private int id;
    private String nomEmploye;
    private String poste;
    private String telephoneEmploye;
    private double salaire;

    public Employe(int id, String nomEmploye, String poste, String telephoneEmploye, double salaire) {
        this.id = id;
        this.nomEmploye = nomEmploye;
        this.poste = poste;
        this.telephoneEmploye = telephoneEmploye;
        this.salaire = salaire;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNomEmploye() {return nomEmploye;}
    public void setNomEmploye(String nomEmploye) {this.nomEmploye = nomEmploye;}

    public String getPoste() {return poste;}
    public void setPoste(String poste) {this.poste = poste;}

    public String getTelephoneEmploye() {return telephoneEmploye;}
    public void setTelephoneEmploye(String telephoneEmploye) {this.telephoneEmploye = telephoneEmploye;}

    public double getSalaire() {return salaire;}
    public void setSalaire(double salaire) {this.salaire = salaire;}

    public void assignerEquipe(String typeEquipe) {
        System.out.println(this.nomEmploye + " a été assigné(e) à l'équipe du : " + typeEquipe);
    }
    @Override
    public String toString() {
        return "Employe n°"+id + " : " + nomEmploye + "(" + poste + ") - Salaire : " + salaire + "euro";
    }
}

