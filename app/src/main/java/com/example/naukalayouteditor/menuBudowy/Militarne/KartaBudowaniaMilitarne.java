package com.example.naukalayouteditor.menuBudowy.Militarne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.naukalayouteditor.BladLubZbudowales;
import com.example.naukalayouteditor.Budowle;
import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.WybranyBudynek;
import com.example.naukalayouteditor.menuBudowy.Militarne.menuBudowyMilitarne;

public class KartaBudowaniaMilitarne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karta_budowania_militarne);
    TextView ustawTekst;

//todo: cena budynku


    ustawTekst = findViewById(R.id.textViewZloto);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getZloto())));

    ustawTekst = findViewById(R.id.textViewMieszkancy);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getMieszkancy())));

    ustawTekst = findViewById(R.id.textViewJedzenie);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getJedzenie())));

    ustawTekst = findViewById(R.id.textViewDrewno);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getDrewno())));

    ustawTekst = findViewById(R.id.textViewKamien);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getKamien())));

    ustawTekst = findViewById(R.id.textViewZelazo);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getZelazo())));

    ustawTekst = findViewById(R.id.tooltipBudynku);

        if (WybranyBudynek.Numery.getWybranyBudynek() == 8) {
        ustawTekst.setText("Koszary pozwalają na szkolenie żołnierzy.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.baraki.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.baraki.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.baraki.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.baraki.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.baraki.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.baraki.getZelazo()));
    } else if (WybranyBudynek.Numery.getWybranyBudynek() == 9) {
        ustawTekst.setText("Mur to najbardziej podstawowy budynek obronny. Do budowy budynków obronnych potrzebna jest potrzebna wersja tego budynku. Np. żeby zbudować Fort potrzebujesz Muru");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.mur.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.mur.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.mur.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.mur.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.mur.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.mur.getZelazo()));
    } else if (WybranyBudynek.Numery.getWybranyBudynek() == 10) {
        ustawTekst.setText("Fort to budynek przystosowany do obrony okrężnej, dzięki czemu zapewnia komfortowe warunki obrony.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.fort.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.fort.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.fort.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.fort.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.fort.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.fort.getZelazo()));
    } else if (WybranyBudynek.Numery.getWybranyBudynek() == 11) {
        ustawTekst.setText("Zamek to ośrodek władzy książęcej, a także cięzka budowla obronna zapewniająca doskonałą ochronę przed wrogiem.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.zamek.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.zamek.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.zamek.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.zamek.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.zamek.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.zamek.getZelazo()));
    } else if (WybranyBudynek.Numery.getWybranyBudynek() == 12) {
        ustawTekst.setText("Cytadela to dominująca nad miastem, samodzielna twierdza.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.cytadela.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.cytadela.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.cytadela.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.cytadela.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.cytadela.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.cytadela.getZelazo()));
        }

}

    public void powrotDoMenuMilitarnych(View view) {
        Intent intencjaPowrotuDoMenuMilitarnych = new Intent(this, menuBudowyMilitarne.class);
        startActivity(intencjaPowrotuDoMenuMilitarnych);
        finish();
    }

    public void zbudujMilitarne(View view) {
        Intent intencjaZbudowalesLubBlad = new Intent(this, BladLubZbudowales.class);
        if (WybranyBudynek.Numery.getWybranyBudynek() == 8) { // budowanie koszar
            if (Gracze.playerHuman.getZloto() >= Budowle.baraki.getZloto() && Gracze.playerHuman.getMieszkancy() >= Budowle.baraki.getMieszkancy() && Gracze.playerHuman.getJedzenie() >= Budowle.baraki.getJedzenie() && Gracze.playerHuman.getDrewno() >= Budowle.baraki.getDrewno() && Gracze.playerHuman.getKamien() >= Budowle.baraki.getKamien() && Gracze.playerHuman.getZelazo() >= Budowle.baraki.getZelazo()) {
                Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.baraki.getZloto());
                Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.baraki.getMieszkancy());
                Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.baraki.getJedzenie());
                Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.baraki.getDrewno());
                Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.baraki.getKamien());
                Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.baraki.getZelazo());
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1); // ustawia zmienna na wartosc ktora mowi ze budynek zostal zbudowany
                Gracze.playerHuman.setBaraki(true);
                startActivity(intencjaZbudowalesLubBlad);
                finish();


            } else {
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);  // ustawia zmienna na wartosc ktora mowi ze nie masz surowcow na kupno budynkow
                startActivity(intencjaZbudowalesLubBlad);
                finish();
            }

        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 9) { // budowanie muru
            if (Gracze.playerHuman.getZloto() >= Budowle.mur.getZloto() && Gracze.playerHuman.getMieszkancy() >= Budowle.mur.getMieszkancy() && Gracze.playerHuman.getJedzenie() >= Budowle.mur.getJedzenie() && Gracze.playerHuman.getDrewno() >= Budowle.mur.getDrewno() && Gracze.playerHuman.getKamien() >= Budowle.mur.getKamien() && Gracze.playerHuman.getZelazo() >= Budowle.mur.getZelazo()) {
                Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.mur.getZloto());
                Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.mur.getMieszkancy());
                Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.mur.getJedzenie());
                Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.mur.getDrewno());
                Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.mur.getKamien());
                Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.mur.getZelazo());
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1); // ustawia zmienna na wartosc ktora mowi ze budynek zostal zbudowany
                Gracze.playerHuman.setMur(true);
                startActivity(intencjaZbudowalesLubBlad);
                finish();


            } else {
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);  // ustawia zmienna na wartosc ktora mowi ze nie masz surowcow na kupno budynkow
                startActivity(intencjaZbudowalesLubBlad);
                finish();
            }
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 10) { // budowanie fortu
            if (Gracze.playerHuman.getZloto() >= Budowle.fort.getZloto() && Gracze.playerHuman.getMieszkancy() >= Budowle.fort.getMieszkancy() && Gracze.playerHuman.getJedzenie() >= Budowle.fort.getJedzenie() && Gracze.playerHuman.getDrewno() >= Budowle.fort.getDrewno() && Gracze.playerHuman.getKamien() >= Budowle.fort.getKamien() && Gracze.playerHuman.getZelazo() >= Budowle.fort.getZelazo()) {
                Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.fort.getZloto());
                Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.fort.getMieszkancy());
                Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.fort.getJedzenie());
                Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.fort.getDrewno());
                Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.fort.getKamien());
                Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.fort.getZelazo());
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1); // ustawia zmienna na wartosc ktora mowi ze budynek zostal zbudowany
                Gracze.playerHuman.setFort(true);
                startActivity(intencjaZbudowalesLubBlad);
                finish();


            } else {
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);  // ustawia zmienna na wartosc ktora mowi ze nie masz surowcow na kupno budynkow
                startActivity(intencjaZbudowalesLubBlad);
                finish();
            }
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 11) { // budowanie zamku
            if (Gracze.playerHuman.getZloto() >= Budowle.zamek.getZloto() && Gracze.playerHuman.getMieszkancy() >= Budowle.zamek.getMieszkancy() && Gracze.playerHuman.getJedzenie() >= Budowle.zamek.getJedzenie() && Gracze.playerHuman.getDrewno() >= Budowle.zamek.getDrewno() && Gracze.playerHuman.getKamien() >= Budowle.zamek.getKamien() && Gracze.playerHuman.getZelazo() >= Budowle.zamek.getZelazo()) {
                Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.zamek.getZloto());
                Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.zamek.getMieszkancy());
                Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.zamek.getJedzenie());
                Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.zamek.getDrewno());
                Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.zamek.getKamien());
                Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.zamek.getZelazo());
                Gracze.playerHuman.setZamek(true);
                startActivity(intencjaZbudowalesLubBlad);
                finish();


            } else {
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);  // ustawia zmienna na wartosc ktora mowi ze nie masz surowcow na kupno budynkow
                startActivity(intencjaZbudowalesLubBlad);
                finish();
            }
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 12) { // budowanie zamku
            if (Gracze.playerHuman.getZloto() >= Budowle.cytadela.getZloto() && Gracze.playerHuman.getMieszkancy() >= Budowle.cytadela.getMieszkancy() && Gracze.playerHuman.getJedzenie() >= Budowle.cytadela.getJedzenie() && Gracze.playerHuman.getDrewno() >= Budowle.cytadela.getDrewno() && Gracze.playerHuman.getKamien() >= Budowle.cytadela.getKamien() && Gracze.playerHuman.getZelazo() >= Budowle.cytadela.getZelazo()) {
                Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.cytadela.getZloto());
                Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.cytadela.getMieszkancy());
                Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.cytadela.getJedzenie());
                Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.cytadela.getDrewno());
                Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.cytadela.getKamien());
                Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.cytadela.getZelazo());
                Gracze.playerHuman.setCytadela(true);
                startActivity(intencjaZbudowalesLubBlad);
                finish();


            } else {
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);  // ustawia zmienna na wartosc ktora mowi ze nie masz surowcow na kupno budynkow
                startActivity(intencjaZbudowalesLubBlad);
                finish();
            }
        }

    }


}