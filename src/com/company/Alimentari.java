package com.company;

import java.util.ArrayList;

public class Alimentari extends Prodotti{
    private Data data;
    private Prodotti prodotti;
    ArrayList <Data> alimentariS;
    ArrayList <Prodotti> listaAlimentari;

    public Alimentari() {
        super();
        data = new Data();
        prodotti = new Prodotti();
        alimentariS = new ArrayList<>();
        listaAlimentari = new ArrayList<>();
    }

    public void setProdotto(int c, String d, int p) {
        prodotti.setCodice(c);
        prodotti.setDescrizione(d);
        prodotti.setPrezzo(p);

        listaAlimentari.add(prodotti);
    }

    public void setData(int i) {
        alimentariS.add(data.getScadenza(i));
    }

    public int applicaSconto2() {
        int sconto = 0;
        int dif = data.getDifferenza();

        if (dif < 10) {
            sconto = (super.getPrezzo()*20)/100;
        }

        return sconto;
    }
}
