package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

            // 1. Création de l'objet Hotel
            Hotel monHotel = new Hotel(1, "MAIRSA Hôtel", "contact@mairsa.com", "0123456789", "Maldives");

            // 2. Affichage des informations de base de l'hôtel pour vérifier la création
            System.out.println("--- Informations de l'Hôtel ---");
            System.out.println("Nom : " + monHotel.getNomHotel());
            System.out.println("Email : " + monHotel.getEmailHotel());
            System.out.println("Téléphone : " + monHotel.getTelephone());
            System.out.println("Adresse : " + monHotel.getAdresse());
            System.out.println("-------------------------------\n");

           // 3.
        }
}
