package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Client {
    private String prenom;
    private String nomFamille;
    private String tel;
    private List<Reservation> reservations;

    public void faireReservation(Reservation reservation) {
        reservations.add(reservation);
    }

}
