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

    public void setData() {
        for (int i = 0; i < alimentari.size(); i ++) {
            alimentari.add(data.getScadenza(i));
        }
    }

    public void applicaSconto2() {

    }
}
