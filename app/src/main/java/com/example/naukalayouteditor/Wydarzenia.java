package com.example.naukalayouteditor;

import android.content.Intent;

public class Wydarzenia {
    public static double zlotoNaRok;
    public static double mieszkancyNaRok;
    public static double jedzienieNaRok;


    public static void normalnyRok(){


        Gracze.playerHuman.setZloto(Math.round(Gracze.playerHuman.getZloto() + zlotoNaRok));
        Gracze.playerHuman.setMieszkancy(Math.round(Gracze.playerHuman.getMieszkancy() + mieszkancyNaRok));
        Gracze.playerHuman.setJedzenie(Math.round(Gracze.playerHuman.getJedzenie() + jedzienieNaRok));
        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() + Gracze.playerHuman.getIloscTartakow()*20); // Matematyka drewna
        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() + Gracze.playerHuman.getIloscKopalni()*20); // matematyka kamienia
        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() + Gracze.playerHuman.getIloscHut()*10); // matematyka zelaza


    }

    public static void susza(){


        Gracze.playerHuman.setZloto(Math.round(Gracze.playerHuman.getZloto() + zlotoNaRok));
        Gracze.playerHuman.setMieszkancy(Math.round(Gracze.playerHuman.getMieszkancy() + mieszkancyNaRok * 0.3));
        Gracze.playerHuman.setJedzenie(Math.round(Gracze.playerHuman.getJedzenie() + jedzienieNaRok * 0.3));
        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() + Gracze.playerHuman.getIloscTartakow()*20); // Matematyka drewna
        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() + Gracze.playerHuman.getIloscKopalni()*20); // matematyka kamienia
        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() + Gracze.playerHuman.getIloscHut()*10); // matematyka zelaza
    }

    public static void zaraza(){




        Gracze.playerHuman.setZloto(Math.round(Gracze.playerHuman.getZloto() + zlotoNaRok));
        Gracze.playerHuman.setMieszkancy(Math.round(Gracze.playerHuman.getMieszkancy() * 0.6));
        Gracze.playerHuman.setJedzenie(Math.round(Gracze.playerHuman.getJedzenie() + jedzienieNaRok));
        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() + Gracze.playerHuman.getIloscTartakow()*20); // Matematyka drewna
        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() + Gracze.playerHuman.getIloscKopalni()*20); // matematyka kamienia
        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() + Gracze.playerHuman.getIloscHut()*10); // matematyka zelaza
    }

    public static void urodzaj(){


        Gracze.playerHuman.setZloto(Math.round(Gracze.playerHuman.getZloto() + zlotoNaRok * 1.15));
        Gracze.playerHuman.setMieszkancy(Math.round(Gracze.playerHuman.getMieszkancy() + mieszkancyNaRok * 1.45));
        Gracze.playerHuman.setJedzenie(Math.round(Gracze.playerHuman.getJedzenie() + jedzienieNaRok * 1.45));
        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() + Gracze.playerHuman.getIloscTartakow()*20); // Matematyka drewna
        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() + Gracze.playerHuman.getIloscKopalni()*20); // matematyka kamienia
        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() + Gracze.playerHuman.getIloscHut()*10); // matematyka zelaza

    }}

    /////////////////////// WYDARZENIE ATAK JEST W KLASIE ATAK



