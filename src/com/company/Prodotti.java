package com.company;

public class Prodotti {
    private int codice;
    private String descrizione;
    private double prezzo;

    public Prodotti() {
        codice = 0;
        descrizione = "";
        prezzo = 0;
    }

    public double applicaSconto() {
        double prezzoScontato = 0;
        double sconto = 0;

        sconto = (prezzo * 5) / 100;
        prezzoScontato = prezzo - sconto;

        return prezzoScontato;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Prodotti{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
