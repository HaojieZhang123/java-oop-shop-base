package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public int IVA = 22; // default IVA value

    // constructor
    public Prodotto(String nome, String descrizione, float prezzo) {

        // random codice generation
        Random random = new Random();
        this.codice = random.nextInt(1000000); // generates a random codice between 0 and 999999

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;

        this.IVA = 22; // default IVA value
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public float getPrezzoConIVA() {
        return this.prezzo * (100 + this.IVA) / 100;
    }

    public String getNomeEsteso() {
        return this.codice + "-" + this.nome;
    }
}
