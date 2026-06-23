package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Facture {
    private int id;
    private LocalDate date = LocalDate.now();
    private Reservation reservation;
    private double montant;
    private ModePaiement modePaiement;
}
