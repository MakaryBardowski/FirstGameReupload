package com.example.naukalayouteditor;

public class Gracze {
    private String imie;
    private double mieszkancy;
    private double jedzenie;
    private double zloto;
    private double drewno;
    private double kamien;
    private double zelazo;
    private int iloscChat;
    private int iloscFolwarkow;
    private int iloscDworow;
    private int iloscPalacow;
    private int iloscHut;
    private int iloscTartakow;
    private int iloscKopalni;
    private boolean baraki;
    private boolean mur;
    private boolean fort;
    private boolean zamek;
    private boolean cytadela;
    private double iloscPiechoty;
    private double iloscLucznikow;
    private double iloscKawalerii;

    public Gracze(String imie, int mieszkancy, int jedzenie, int zloto, int drewno, int kamien, int zelazo, int iloscChat, int iloscFolwarkow, int iloscDworow, int iloscPalacow, int iloscHut, int iloscTartakow, int iloscKopalni, boolean baraki, boolean mur, boolean fort, boolean zamek, boolean cytadela, int iloscPiechoty, int iloscLucznikow, int iloscKawalerii) {
        this.imie = imie;
        this.mieszkancy = mieszkancy;
        this.jedzenie = jedzenie;
        this.zloto = zloto;
        this.drewno = drewno;
        this.kamien = kamien;
        this.zelazo = zelazo;
        this.iloscChat = iloscChat;
        this.iloscFolwarkow = iloscFolwarkow;
        this.iloscDworow = iloscDworow;
        this.iloscPalacow = iloscPalacow;
        this.iloscHut = iloscHut;
        this.iloscTartakow = iloscTartakow;
        this.iloscKopalni = iloscKopalni;
        this.baraki = baraki;
        this.mur = mur;
        this.fort = fort;
        this.zamek = zamek;
        this.cytadela = cytadela;
        this.iloscPiechoty = iloscPiechoty;
        this.iloscLucznikow = iloscLucznikow;
        this.iloscKawalerii = iloscKawalerii;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(double mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public double getJedzenie() {
        return jedzenie;
    }

    public void setJedzenie(double jedzenie) {
        this.jedzenie = jedzenie;
    }

    public double getZloto() {
        return zloto;
    }

    public void setZloto(double zloto) {
        this.zloto = zloto;
    }

    public double getDrewno() {
        return drewno;
    }

    public void setDrewno(double drewno) {
        this.drewno = drewno;
    }

    public double getKamien() {
        return kamien;
    }

    public void setKamien(double kamien) {
        this.kamien = kamien;
    }

    public double getZelazo() {
        return zelazo;
    }

    public void setZelazo(double zelazo) {
        this.zelazo = zelazo;
    }

    public int getIloscChat() {
        return iloscChat;
    }

    public void setIloscChat(int iloscChat) {
        this.iloscChat = iloscChat;
    }

    public int getIloscFolwarkow() {
        return iloscFolwarkow;
    }

    public void setIloscFolwarkow(int iloscFolwarkow) {
        this.iloscFolwarkow = iloscFolwarkow;
    }

    public int getIloscDworow() {
        return iloscDworow;
    }

    public void setIloscDworow(int iloscDworow) {
        this.iloscDworow = iloscDworow;
    }

    public int getIloscPalacow() {
        return iloscPalacow;
    }

    public void setIloscPalacow(int iloscPalacow) {
        this.iloscPalacow = iloscPalacow;
    }

    public int getIloscHut() {
        return iloscHut;
    }

    public void setIloscHut(int iloscHut) {
        this.iloscHut = iloscHut;
    }

    public int getIloscTartakow() {
        return iloscTartakow;
    }

    public void setIloscTartakow(int iloscTartakow) {
        this.iloscTartakow = iloscTartakow;
    }

    public int getIloscKopalni() {
        return iloscKopalni;
    }

    public void setIloscKopalni(int iloscKopalni) {
        this.iloscKopalni = iloscKopalni;
    }

    public boolean isBaraki() {
        return baraki;
    }

    public void setBaraki(boolean baraki) {
        this.baraki = baraki;
    }

    public boolean isMur() {
        return mur;
    }

    public void setMur(boolean mur) {
        this.mur = mur;
    }

    public boolean isFort() {
        return fort;
    }

    public void setFort(boolean fort) {
        this.fort = fort;
    }

    public boolean isZamek() {
        return zamek;
    }

    public void setZamek(boolean zamek) {
        this.zamek = zamek;
    }

    public boolean isCytadela() {
        return cytadela;
    }

    public void setCytadela(boolean cytadela) {
        this.cytadela = cytadela;
    }

    public double getIloscPiechoty() {
        return iloscPiechoty;
    }

    public void setIloscPiechoty(double iloscPiechoty) {
        this.iloscPiechoty = iloscPiechoty;
    }

    public double getIloscLucznikow() {
        return iloscLucznikow;
    }

    public void setIloscLucznikow(double iloscLucznikow) {
        this.iloscLucznikow = iloscLucznikow;
    }

    public double getIloscKawalerii() {
        return iloscKawalerii;
    }

    public void setIloscKawalerii(double iloscKawalerii) {
        this.iloscKawalerii = iloscKawalerii;
    }




    public static Gracze playerHuman = new Gracze("x", 50, 50, 1000, 100, 100, 50, 2, 0,0 , 0, 0, 1, 1, false, false, false, false, false, 10, 5, 0);
    public static Gracze playerComputerAtak = new Gracze("Komputer", 100, 200, 5000, 100, 100, 50, 10, 1, 0, 0, 0, 1, 1, false, false, false, false, false, 0, 0, 0);

}