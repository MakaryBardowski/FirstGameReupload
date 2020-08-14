package com.example.naukalayouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.naukalayouteditor.menuBudowy.menuBudowyActivity;
import com.example.naukalayouteditor.menuTreningu.menuTreninguActivity;
import com.example.naukalayouteditor.menuAtaku.menuAtaku;

//todo: posprzątać wszystkie klasy javy, tj: , Atak,, Targowisko, (wykreślić posprzątane)

public class menuGlowneActivity extends AppCompatActivity {
    public static int rok = 1331;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_glowne);
        TextView ustawTekst;
        Button ustawPrzycisk;


        if (((WydarzeniaSprawdzanie.losowyNumerWydarzenia == 6 && !WydarzenieActivty.eventPrzeczytany) || (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 7 && !WydarzenieActivty.eventPrzeczytany)) || (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 9 && !WydarzenieActivty.eventPrzeczytany) || (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 10 && !WydarzenieActivty.eventPrzeczytany) || ((WydarzeniaSprawdzanie.losowyNumerWydarzenia == 3 && !WydarzenieActivty.eventPrzeczytany) || (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 4 && !WydarzenieActivty.eventPrzeczytany))) {
            Intent event = new Intent(this, WydarzenieActivty.class);
            startActivity(event);
            finish();
        }
        if (Gracze.playerHuman.isCytadela() && Gracze.playerHuman.getIloscChat() >= 50 && Gracze.playerHuman.getIloscFolwarkow() >= 50 && Gracze.playerHuman.getIloscDworow() >= 50 && Gracze.playerHuman.getIloscPalacow() >= 50 && Gracze.playerHuman.getIloscTartakow() >= 50 && Gracze.playerHuman.getIloscKopalni() >= 50 && Gracze.playerHuman.getIloscHut() >= 50 && Gracze.playerHuman.getIloscPiechoty() >= 500 && Gracze.playerHuman.getIloscLucznikow() >= 500 && Gracze.playerHuman.getIloscKawalerii() >= 500) {
            Intent intent = new Intent(this, WydarzenieActivty.class);
            WydarzeniaSprawdzanie.losowyNumerWydarzenia = -2115;
            startActivity(intent);
            finish();

        } else if (Gracze.playerHuman.getMieszkancy() <= 0) {
// kod jesli przegrales
            Intent intent = new Intent(this, WydarzenieActivty.class);
            WydarzeniaSprawdzanie.losowyNumerWydarzenia = 2137;
            startActivity(intent);
            finish();
        }


        ustawTekst = findViewById(R.id.wyswietla_IMIE);
        ustawTekst.setText(Gracze.playerHuman.getImie());

        ustawTekst = findViewById(R.id.wyswietlaRok);
        ustawTekst.setText("AD " + Integer.toString(rok));

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


        if (Gracze.playerHuman.isBaraki()) {          // ustawia zaleznie od tego czy gracz ma baraki tło przycisku i tekst
            ustawPrzycisk = findViewById(R.id.przycisk_menu_treningu);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

            ustawTekst = findViewById(R.id.przycisk_menu_treningu);
            ustawTekst.setText("Menu treningu");  // tekst nie hardcoded,wzięty ze stringow zrobionych przeze mnie
        }

        if (Gracze.playerHuman.getIloscPiechoty() > 0 || Gracze.playerHuman.getIloscLucznikow() > 0 || Gracze.playerHuman.getIloscKawalerii() > 0) {
            ustawPrzycisk = findViewById(R.id.przyciskAtaku);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

            ustawTekst = findViewById(R.id.przyciskAtaku);
            ustawTekst.setText("Atak");
        }


    }

    public void zakonczTure(View view) {
        rok += 1;
        WydarzenieActivty.eventPrzeczytany = false;
        WydarzeniaSprawdzanie.WydarzeniaSprawdzanie();
        finish();
        startActivity(getIntent());


    }

    public void menuBudowy(View view) {
        Intent wejdzDoMenuBudowy = new Intent(this, menuBudowyActivity.class);
        startActivity(wejdzDoMenuBudowy);
        finish();
    }

    public void menuTreningu(View view) {
        if (Gracze.playerHuman.isBaraki()) {
            Intent menuTreningu = new Intent(this, menuTreninguActivity.class);
            startActivity(menuTreningu);
            finish();
        }

    }

    public void rynek(View view) {
        Intent rynek = new Intent(this, rynekActivity.class);
        startActivity(rynek);
        finish();
    }

    public void atak(View view) {
        if (Gracze.playerHuman.getIloscPiechoty() > 0 || Gracze.playerHuman.getIloscLucznikow() > 0 || Gracze.playerHuman.getIloscKawalerii() > 0) {
            Intent rynek = new Intent(this, menuAtaku.class);
            startActivity(rynek);
            finish();
        }
    }
}
