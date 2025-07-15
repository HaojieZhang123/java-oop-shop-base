package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal IVA; // default IVA value

    // constructor
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal IVA) {

        // random codice generation
        Random random = new Random();
        this.codice = random.nextInt(1000000); // generates a random codice between 0 and 999999

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.IVA = IVA;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoConIVA() {
        if (this.IVA == null) {
            this.IVA = new BigDecimal("0.22"); // default IVA of 22%
        }

        return this.prezzo.add(this.prezzo.multiply(this.IVA)).setScale(2, RoundingMode.DOWN);
    }

    public String getNomeEsteso() {
        return this.codice + "-" + this.nome;
    }
}
