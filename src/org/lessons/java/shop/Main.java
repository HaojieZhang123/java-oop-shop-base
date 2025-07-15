package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Laptop", "High performance laptop", new BigDecimal("1200.00"),
                new BigDecimal("0.22"));
        Prodotto prodotto2 = new Prodotto("Smartphone", "Latest model smartphone", new BigDecimal("800.00"),
                new BigDecimal("0.22"));

        System.out.println("Prodotto 1: " + prodotto1.getNomeEsteso() + ", Prezzo: " + prodotto1.getPrezzo()
                + ", Prezzo con IVA: " + prodotto1.getPrezzoConIVA());
        System.out.println("Prodotto 2: " + prodotto2.getNomeEsteso() + ", Prezzo: " + prodotto2.getPrezzo()
                + ", Prezzo con IVA: " + prodotto2.getPrezzoConIVA());
    }
}
