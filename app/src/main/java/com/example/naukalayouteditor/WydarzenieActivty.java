package com.example.naukalayouteditor;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

import com.example.naukalayouteditor.menuAtaku.menuAtaku;

public class WydarzenieActivty extends AppCompatActivity {
    public static boolean eventPrzeczytany = false;

    public int iloscChat;
    public int iloscDworow;
    public int iloscTartakow;
    public int iloscKopalni;
    public int iloscZlota;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wydarzenie_activty);
        TextView ustawTekst;
        ImageView ustawObrazek;
        Button ustawPrzycisk;

// losowy numer wydarzenia 999 - wygrales z kompem
        // losowy numer wydarzenia 1000 - przegrales z kompem

        ustawTekst = findViewById(R.id.opisEventu);
        ustawObrazek = findViewById(R.id.obrazekEventu);
        if ((WydarzeniaSprawdzanie.losowyNumerWydarzenia == 6 && !eventPrzeczytany) || (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 7 && !eventPrzeczytany)) { //zaraza - w przypadku zarazy nie ustawia obrazków bo domyslnie ekran eventu to zaraza.
            ustawTekst.setText("Nowy rok przyniosl zaraze i smierc; Zycie traci 40% mieszkancow, 15% zolnierzy , szaleje inflacja, ponadto, nie ma nowych mieszkancow. ");
        } else if ((WydarzeniaSprawdzanie.losowyNumerWydarzenia == 9 && !eventPrzeczytany) || (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 10 && !eventPrzeczytany)) { // urodzaj
            ustawTekst.setText("Nowy rok przyniosl urodzaj i rozkwit gospodarczy; Przyrost mieszkancow i jedzenia w tym roku zwiekszyl sie o 45%, a zlota o 15%. ");
            ustawObrazek.setImageResource(R.drawable.event_urodzaj_png);

            ustawObrazek = findViewById(R.id.ramkaEvent);
            ustawObrazek.setImageResource(R.drawable.ramka_dobry_event);

            ustawPrzycisk = findViewById(R.id.okEvent);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_urodzaj);
        } else if ((WydarzeniaSprawdzanie.losowyNumerWydarzenia == 3 && !eventPrzeczytany) || (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 4 && !eventPrzeczytany)) { // susza
            ustawTekst.setText("Nowy rok przyniosl susze i glod; Przyrost mieszkancow i jedzenia w tym roku jest mniejszy o 70%. Ceny jedzenia na targowisku ida w gore.");
            ustawObrazek.setImageResource(R.drawable.event_susza_png);

            ustawObrazek = findViewById(R.id.ramkaEvent);
            ustawObrazek.setImageResource(R.drawable.ramka_event_susza);

            ustawPrzycisk = findViewById(R.id.okEvent);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_susza);
        } else if ((WydarzeniaSprawdzanie.losowyNumerWydarzenia == 999 && !eventPrzeczytany)) { // wygrales z kompem

            iloscChat = 0;
            iloscDworow = 0;
            iloscTartakow = 0;
            iloscKopalni = 0;
            iloscZlota = 0;

            ustawTekst.setText("Zwycięstwo jest najsłodsze jeśli zaznałeś porażki. Zapewne następne zwycięstwo twojego wroga będzie bardzo słodkie.");
            ustawObrazek.setImageResource(R.drawable.event_oblezenie_zwyciestwo);

            ustawObrazek = findViewById(R.id.ramkaEvent);
            ustawObrazek.setImageResource(R.drawable.ramka_na_surowce);

            ustawPrzycisk = findViewById(R.id.okEvent);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

            if (menuAtaku.wybranyWrog == 1) { // loot
                iloscChat = random.nextInt(3);
                iloscDworow = random.nextInt(2);
                iloscTartakow = random.nextInt(2);
                iloscKopalni = random.nextInt(2);
                iloscZlota = random.nextInt(5000);



            } else if (menuAtaku.wybranyWrog == 2) {
                iloscChat = random.nextInt(6);
                iloscDworow = random.nextInt(4);
                iloscTartakow = random.nextInt(4);
                iloscKopalni = random.nextInt(4);
                iloscZlota = random.nextInt(10000);
            } else if (menuAtaku.wybranyWrog == 3) {
                iloscChat = random.nextInt(10);
                iloscDworow = random.nextInt(7);
                iloscTartakow = random.nextInt(8);
                iloscKopalni = random.nextInt(8);
                iloscZlota = random.nextInt(20000);
            }

            ustawTekst = findViewById(R.id.lupy);
            ustawTekst.setText("Łupy:");

            ustawTekst = findViewById(R.id.zlotolupy);
            ustawTekst.setText("Złoto: +" + Long.toString(iloscZlota));

            ustawTekst = findViewById(R.id.chatylupy);
            ustawTekst.setText("Chaty: +"+ Long.toString(iloscChat));

            ustawTekst = findViewById(R.id.dworylupy);
            ustawTekst.setText("Dwory: +"+ Long.toString(iloscDworow));

            ustawTekst = findViewById(R.id.tartakilupy);
            ustawTekst.setText("Tartaki: +"+ Long.toString(iloscTartakow));

            ustawTekst = findViewById(R.id.kopalnielupy);
            ustawTekst.setText("Kopalnie: +"+ Long.toString(iloscKopalni));

            Gracze.playerHuman.setIloscChat(Gracze.playerHuman.getIloscChat() + iloscChat);
            Gracze.playerHuman.setIloscDworow(Gracze.playerHuman.getIloscDworow() + iloscDworow);
            Gracze.playerHuman.setIloscTartakow(Gracze.playerHuman.getIloscTartakow() + iloscTartakow);
            Gracze.playerHuman.setIloscKopalni(Gracze.playerHuman.getIloscKopalni() + iloscKopalni);
            Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() + iloscZlota);


        } else if ((WydarzeniaSprawdzanie.losowyNumerWydarzenia == 1000 && !eventPrzeczytany)) { // przegrales z kompem
            ustawTekst.setText("Twoje wojska walczyły dzielnie, jednak nieudolność dowódcy doprowadziła do nieuniknionej porażki.");
            ustawObrazek.setImageResource(R.drawable.event_oblezenie_porazka);

            ustawObrazek = findViewById(R.id.ramkaEvent);
            ustawObrazek.setImageResource(R.drawable.ramka_event_susza);

            ustawPrzycisk = findViewById(R.id.okEvent);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_susza);
        } else if (WydarzeniaSprawdzanie.losowyNumerWydarzenia == -2115) { // wygrales gre
            ustawTekst.setText("Dzięki twoim wspaniałym rządom twoje królestwo stało się najpotężniejszym na kontynencie. Nikt nie odważy przeciwstawić się twoim rozkazom.");
            ustawObrazek.setImageResource(R.drawable.wygrales_gre);

            ustawObrazek = findViewById(R.id.ramkaEvent);
            ustawObrazek.setImageResource(R.drawable.ramka_na_surowce);

            ustawPrzycisk = findViewById(R.id.okEvent);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
        } else if (WydarzeniaSprawdzanie.losowyNumerWydarzenia == 2137) { // przegrales gre
            ustawTekst.setText("Twoje królestwo od dawna chyliło się ku upadkowi. Ostatnie wydarzenia tylko przypieczętowały ten los.");
            ustawObrazek.setImageResource(R.drawable.event_zaraza_png);



        }


    }

    public void ok(View view) {
        if (WydarzeniaSprawdzanie.losowyNumerWydarzenia == -2115) {
            Intent powrot = new Intent(this, MainActivity.class);
            startActivity(powrot);
            finish();
        } else {
            eventPrzeczytany = true;
            Intent powrot = new Intent(this, menuGlowneActivity.class);
            startActivity(powrot);
            finish();
        }
    }
}
