package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String risposta, dimensione, code, d, price;
        int c;
        double p, pscontato5;
        String giornop, mesep, annop, giornos, meses, annos;
        int ggp, mp, ap, ggs, ms, as;

        ArrayList <Alimentari> alimentaris = new ArrayList<>();
        Alimentari alimentari = new Alimentari();

        ArrayList <Non_Alimentari> non_alimentaris = new ArrayList<>();
        Non_Alimentari non_alimentari = new Non_Alimentari();

        Data data = new Data();

        Scanner in = new Scanner(System.in);

        System.out.println("inserisci il numero di prodotti che vuoi aquistare");
        dimensione = in.nextLine();
        int dim = Integer.parseInt(dimensione);
        System.out.println("Ha la tessera fedeltà?");
        String tessera = in.nextLine();

        if (tessera.equalsIgnoreCase("si")) {
            for (int i = 1; i <= dim; i++) {
                System.out.println("Il prodotto che vuole aquistare è alimentare o no?");
                 risposta = in.nextLine();
                 if (risposta.equalsIgnoreCase("si")) {
                     System.out.println("inserisci codice");
                     code = in.nextLine();
                     c = Integer.parseInt(code);
                     System.out.println("inserisci descrizione");
                     d = in.nextLine();
                     System.out.println("inserisci prezzo");
                     price = in.nextLine();
                     p = Integer.parseInt(price);
                     pscontato5 = alimentari.applicaSconto();

                     alimentaris.add(new Alimentari()); //non so a che serve
                     alimentari.setProdotto(c, d, pscontato5);

                     System.out.println("inserisci giorno produzione");
                     giornop = in.nextLine();
                     ggp = Integer.parseInt(giornop);
                     System.out.println("inserisci mese produzione");
                     mesep = in.nextLine();
                     mp = Integer.parseInt(mesep);
                     System.out.println("inserisci anno produzione");
                     annop = in.nextLine();
                     ap = Integer.parseInt(annop);
                     System.out.println("inserisci giorno scadenza");
                     giornos = in.nextLine();
                     ggs = Integer.parseInt(giornos);
                     System.out.println("inserisci mese scadenza");
                     meses = in.nextLine();
                     ms = Integer.parseInt(meses);
                     System.out.println("inserisci anno scadenza");
                     annos = in.nextLine();
                     as = Integer.parseInt(annos);

                     data.carica(ggp, mp, ap, ggs, ms, as);
                     data.rimanenti();
                     alimentari.setData(i);

                     double pscontato20 = p - alimentari.applicaSconto20();
                     if (pscontato20 != p) {
                         System.out.println("il prezzo ora è di: " + pscontato20 + " visto che la data di scadenza è minore di 10 giorni");
                     }
                 }
            }
        }

        if (tessera.equalsIgnoreCase("no")) {

        }
    }
}
