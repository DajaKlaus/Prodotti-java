package com.company;

import java.util.ArrayList;

public class Non_Alimentari extends Prodotti{
    private String materiale;
    private Prodotti prodotti;
    ArrayList<Prodotti> listaNonAlimentari;

    public Non_Alimentari() {
        super();
        materiale = "";
        prodotti = new Prodotti();
        listaNonAlimentari = new ArrayList<>();
    }

    public String Materiale() {
        materiale = prodotti.getDescrizione();

        return materiale;
    }

    public int applicaSconto10() {
        int sconto = 0;

        sconto = (super.getPrezzo()*10)/100;

        return sconto;
    }

    public void controlloMateriale() {
        String mat = Materiale();

        if (mat.equalsIgnoreCase("carta")) {

        }
    }
}
