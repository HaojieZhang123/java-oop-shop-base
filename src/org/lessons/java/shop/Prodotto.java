package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal IVA; // default IVA value

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

    // constructor all zeros
    public Prodotto() {
        this.codice = 0;
        this.nome = "";
        this.descrizione = "";
        this.prezzo = new BigDecimal("0.00");
        this.IVA = new BigDecimal("0.22"); // default IVA of 22%
    }

    // getters
    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public BigDecimal getIVA() {
        return this.IVA;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public void setIVA(BigDecimal IVA) {
        this.IVA = IVA;
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
