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

    public double applicaSconto10() {
        double sconto = 0;

        sconto = (super.getPrezzo()*10)/100;

        return sconto;
    }

    public void controlloMateriale() {
        String mat = Materiale();
        double prezzo = prodotti.getPrezzo();

        if (mat.equalsIgnoreCase("carta") || mat.equalsIgnoreCase("vetro") || mat.equalsIgnoreCase("plastica")) {
            prezzo -= applicaSconto10();
            System.out.println("il prezzo è ora di: " + prezzo);
        }
    }
}
