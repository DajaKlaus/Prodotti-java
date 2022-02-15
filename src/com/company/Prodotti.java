package com.company;

public class Prodotti {
    private int codice;
    private String descrizione;
    private int prezzo;

    public Prodotti() {
        codice = 0;
        descrizione = "";
        prezzo = 0;
    }

    public int applicaSconto() {
        int prezzoScontato = 0;
        int sconto = 0;

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

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getPrezzo() {
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
