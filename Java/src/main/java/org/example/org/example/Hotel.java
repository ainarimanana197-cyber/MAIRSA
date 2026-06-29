package org.example;

import java.util.List;

public class Hotel {
    private int id;
    private String nomHotel;
    private String emailHotel;
    private String telephone;
    private String adresse;
    private List<org.example.Chambre> listChambres;

    public Hotel(int id, String nomHotel, String emailHotel, String telephone, String adresse, List<Chambre> listChambres) {
        this.id = id;
        this.nomHotel = nomHotel;
        this.emailHotel = emailHotel;
        this.telephone = telephone;
        this.adresse = adresse;
        this.listChambres = listChambres;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNomHotel() {return nomHotel;}
    public void setNomHotel(String nomHotel) {this.nomHotel = nomHotel;}

    public String getEmailHotel() {return emailHotel;}
    public void setEmailHotel(String emailHotel) {this.emailHotel = emailHotel;}

    public String getTelephone() {return telephone;}
    public void setTelephone(String telephone) {this.telephone = telephone;}

    public String getAdresse() {return adresse;}
    public void setAdresse(String adresse) {this.adresse = adresse;}

    public List<org.example.Chambre> getListChambres() {return listChambres;}
    public void setListChambres(List<org.example.Chambre> listChambres) {this.listChambres = listChambres;}

    public void ajouterChambre(org.example.Chambre chambre) {
        if (chambre != null) {
            this.listChambres.add(chambre);
            System.out.println("La chambre a été ajoutée avec succès.");
        } else {
            System.out.println("Erreur : la chambre ne peut pas être nulle.");
        }
    }

    public void afficherChambresLibresAvecLeurType() {
        System.out.println("Liste des chambres libres : ");
        boolean aucuneChambreLibre = true;
        for (org.example.Chambre chambre : listChambres) {
            if (chambre.estDisponible()) {
                System.out.println("Chambre N°" + org.example.Chambre.getNum() + " | Type : " + chambre.getType());
                aucuneChambreLibre = false;
            }
        }
        if (aucuneChambreLibre) {
            System.out.println("Actuellement, il n'y a aucune chambre libre dans l'hôtel.");
        }
    }

    public org.example.Chambre trouverChambreOccupeeParClient(int idClient) {
        for (org.example.Chambre chambre : listChambres) {
            if (!chambre.estDisponible() && org.example.Client.getClient() != null) {
                if (chambre.getClient().getId() == idClient) {
                    return chambre; // Retourne l'objet Chambre si le client est trouvé
                }
            }
        }
        return null;
    }
    public List<org.example.Chambre> getListChambres() {
        return listChambres;
    }
}
