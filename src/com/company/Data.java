package com.company;

import java.util.ArrayList;

public class Data {
    private int giornop;
    private int mesep;
    private int annop;
    private int giornos;
    private int meses;
    private int annos;

    ArrayList <Data> produzione = new ArrayList<>();
    ArrayList <Data> scadenza = new ArrayList<>();

    public Data() {
        giornop = 0;
        mesep = 0;
        annop = 0;
        giornos = 0;
        meses = 0;
        annos = 0;
    }

    public Data(int gg, int m, int a) {
        giornop = gg;
        mesep = m;
        annop = a;
    }

    public void carica(int ggp, int mp, int ap, int ggs, int ms, int as) {
            produzione.add(new Data(ggp, mp, ap));
            scadenza.add(new Data(ggs, ms, as));
    }

    public void rimanenti() {
        int ggRimanenti = 0;
        int mRimanenti = 0;
        int aRimanenti = 0;

        //cotrollo mesi
        if (mesep == 2) {
            if (produzione.get(0).getGiornop() == 1) {
                for (int i = 1; i <= 28; i++) {
                    if (i < 28) {
                        ggRimanenti = i;
                    }

                    if (i == 28) {
                        mRimanenti += 1;
                    }
                }
            } else if (produzione.get(0).getGiornop() > 1) {
                for (int i = 28 - produzione.get(0).getGiornop(); i <= 28; i++) {
                    ggRimanenti = i;
                }
            }
        }

        if (mesep == 1 || mesep == 3 || mesep == 5 || mesep == 7 || mesep == 8 || mesep == 10 || mesep == 12) {
            if (produzione.get(0).getGiornop() == 1) {
                for (int i = 1; i <= 31; i++) {
                    if (i < 31) {
                        ggRimanenti = i;
                    }

                    if (i == 31) {
                        mRimanenti += 1;
                    }
                }
            } else if (produzione.get(0).getGiornop() > 1) {
                for (int i = 31 - produzione.get(0).getGiornop(); i <= 31; i++) {
                    ggRimanenti = i;
                }
            }
        }

        if (mesep == 4 || mesep == 6 || mesep == 9 || mesep == 11) {
            if (produzione.get(0).getGiornop() == 1) {
                for (int i = 1; i <= 30; i++) {
                    if (i < 30) {
                        ggRimanenti = i;
                    }

                    if (i == 30) {
                        mRimanenti += 1;
                    }
                }
            } else if (produzione.get(0).getGiornop() > 1) {
                for (int i = 30 - produzione.get(0).getGiornop(); i <= 30; i++) {
                    ggRimanenti = i;
                }
            }
        }
        // ^^

        //controllo anni
        if (produzione.get(0).getAnnop() == scadenza.get(0).getAnnos()) {
            aRimanenti = 0;
        } else {
            aRimanenti = produzione.get(0).getAnnop() - scadenza.get(0).getAnnos();
        }
        //^^

        System.out.println("giorni rimanenti: " + ggRimanenti + ":" + mRimanenti + ":" + aRimanenti);
    }

    public int getDifferenza() {
        int differenza = 0;


        if ((scadenza.get(0).getGiornos() - produzione.get(0).getGiornop()) == 10) {
            differenza = scadenza.get(0).getGiornos() - produzione.get(0).getGiornop();
        }

        return differenza;
    }

    public void setScadenza(ArrayList<Data> scadenza) {
        this.scadenza = scadenza;
    }

    public void setProduzione(ArrayList<Data> produzione) {
        this.produzione = produzione;
    }

    public void setGiornop(int giornop) {
        this.giornop = giornop;
    }

    public void setGiornos(int giornos) {
        this.giornos = giornos;
    }

    public void setMesep(int mesep) {
        this.mesep = mesep;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public void setAnnop(int annop) {
        this.annop = annop;
    }

    public void setAnnos(int annos) {
        this.annos = annos;
    }

    public ArrayList<Data> getProduzione() {
        return produzione;
    }

    public ArrayList<Data> getScadenza() {
        return scadenza;
    }

    public int getGiornop() {
        return giornop;
    }

    public int getGiornos() {
        return giornos;
    }

    public int getMesep() {
        return mesep;
    }

    public int getMeses() {
        return meses;
    }

    public int getAnnop() {
        return annop;
    }

    public int getAnnos() {
        return annos;
    }

    @Override
    public String toString() {
        return "Data{" +
                "giornop=" + giornop +
                ", mesep=" + mesep +
                ", annop=" + annop +
                ", giornos=" + giornos +
                ", meses=" + meses +
                ", annos=" + annos +
                ", produzione=" + produzione +
                ", scadenza=" + scadenza +
                '}';
    }
}
