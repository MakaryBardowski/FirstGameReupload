package com.example.naukalayouteditor;
// jest to klasa odpowiadajaca za zmienna wybranego budynku podstawiana przy kliknieciu przycisku do
// budowania budynku, i na bazie tej zmiennej sa podstawiane obrazki i zmienne w karcie budowania
public class WybranyBudynek {

    public byte wybranyBudynek;
    public byte zbudowaneCzyNie;    // 0 to wartosc bazowa, 1 zbudowany, 2 brak surowcow, 3 blad.

    public WybranyBudynek(byte wybranyBudynek, byte zbudowaneCzyNie) {
        this.wybranyBudynek = wybranyBudynek;
        this.zbudowaneCzyNie = zbudowaneCzyNie;
    }

    public byte getWybranyBudynek() {
        return wybranyBudynek;
    }

    public void setWybranyBudynek(byte wybranyBudynek) {
        this.wybranyBudynek = wybranyBudynek;
    }

    public byte getZbudowaneCzyNie() {
        return zbudowaneCzyNie;
    }

    public void setZbudowaneCzyNie(byte zbudowaneCzyNie) {
        this.zbudowaneCzyNie = zbudowaneCzyNie;
    }


    public static WybranyBudynek Numery = new WybranyBudynek((byte)0,(byte)0);

}


