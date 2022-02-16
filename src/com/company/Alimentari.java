package com.company;

import java.util.ArrayList;

public class Alimentari extends Prodotti{
    private Data data;
    ArrayList <Data> alimentari;

    public Alimentari() {
        super();
        data = new Data();
        alimentari = new ArrayList<>();
    }

    public void setData(int i) {
        alimentari.add(data.getScadenza(i));
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
