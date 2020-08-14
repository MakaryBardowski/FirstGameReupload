package com.example.naukalayouteditor;

public class Budowle {


    private String imie;
    private int mieszkancy;
    private int jedzenie;
    private int zloto;
    private int drewno;
    private int kamien;
    private int zelazo;

    public Budowle(String imie, int mieszkancy, int jedzenie, int zloto, int drewno, int kamien, int zelazo) {
        this.imie = imie;
        this.mieszkancy = mieszkancy;
        this.jedzenie = jedzenie;
        this.zloto = zloto;
        this.drewno = drewno;
        this.kamien = kamien;
        this.zelazo = zelazo;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(int mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public int getJedzenie() {
        return jedzenie;
    }

    public void setJedzenie(int jedzenie) {
        this.jedzenie = jedzenie;
    }

    public int getZloto() {
        return zloto;
    }

    public void setZloto(int zloto) {
        this.zloto = zloto;
    }

    public int getDrewno() {
        return drewno;
    }

    public void setDrewno(int drewno) {
        this.drewno = drewno;
    }

    public int getKamien() {
        return kamien;
    }

    public void setKamien(int kamien) {
        this.kamien = kamien;
    }

    public int getZelazo() {
        return zelazo;
    }

    public void setZelazo(int zelazo) {
        this.zelazo = zelazo;
    }

    @Override
    public String toString() {
        return "(Z: " + getZloto() + " | M: " + getMieszkancy() + " | J: " + getJedzenie() + " | D: " + getDrewno() + " | K: " + getKamien() + " | Ż: " + getZelazo() + ")";
    }



    // mieszkalne
    public static Budowle chaty = new Budowle("Chaty", 10, 30, 1000, 10,10, 0);
    public static Budowle folwark = new Budowle("Folwark", 20, 50, 2000, 50,45,3);
    public static Budowle dwor = new Budowle("Dwor", 40, 90, 8500, 70,100,20);
    public static Budowle palac = new Budowle("Palac", 100, 415, 20000, 250,300,75);

    //  zasobowe
    public static Budowle huta = new Budowle("Huta", 30, 100, 5000, 35,120,10);
    public static Budowle tartak = new Budowle("Tartak", 10, 30, 1000, 0,20,4);
    public static Budowle kopalnia = new Budowle("Kopalnia", 15, 50, 2000, 30,0,6);

    // militarne
    public static Budowle baraki = new Budowle("Baraki", 100, 500, 14500, 300,300,50);
    public static Budowle mur = new Budowle("Mur", 100, 300, 3000, 400,500,50);
    public static Budowle fort = new Budowle("Fort", 500, 900, 10000, 800,1000,250);
    public static Budowle zamek = new Budowle("Zamek", 1000, 3000, 30000, 4000,5000,500);
    public static Budowle cytadela = new Budowle("Cytadela", 4500, 7000, 75000, 10000,10000,5000);


}
