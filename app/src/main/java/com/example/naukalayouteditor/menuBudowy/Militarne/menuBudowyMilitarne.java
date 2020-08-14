package com.example.naukalayouteditor.menuBudowy.Militarne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.WybranyBudynek;
import com.example.naukalayouteditor.menuBudowy.menuBudowyActivity;

public class menuBudowyMilitarne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_budowy_militarne);
        TextView ustawTekst;
        Button ustawPrzycisk;
        ImageView ustawObrazek;

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


        if (Gracze.playerHuman.isMur() && !Gracze.playerHuman.isFort()) {
            ustawPrzycisk = findViewById(R.id.przyciskFortu);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

            ustawTekst = findViewById(R.id.przyciskFortu);
            ustawTekst.setText("Fort");
        }
        if (Gracze.playerHuman.isFort() && !Gracze.playerHuman.isZamek()) {
            ustawPrzycisk = findViewById(R.id.przyciskZamku);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

            ustawTekst = findViewById(R.id.przyciskZamku);
            ustawTekst.setText("Zamek");
        }

        if (Gracze.playerHuman.isZamek() && !Gracze.playerHuman.isCytadela()) {
            ustawPrzycisk = findViewById(R.id.przyciskCytadeli);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

            ustawTekst = findViewById(R.id.przyciskCytadeli);
            ustawTekst.setText("Cytadela");
        }




        if (Gracze.playerHuman.isBaraki()) {          // ustawia zaleznie od tego czy gracz ma baraki tło przycisku i tekst
            ustawPrzycisk = findViewById(R.id.przyciskKoszar);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_zbudowany);

            ustawTekst = findViewById(R.id.przyciskKoszar);
            ustawTekst.setText("");


            ustawTekst = findViewById(R.id.textViewMaszBaraki);
            ustawTekst.setText("tak");

        }
        if (Gracze.playerHuman.isMur()) {          // ustawia zaleznie od tego czy gracz ma mur tło przycisku i tekst
            ustawPrzycisk = findViewById(R.id.przyciskMuru);  // ustawia przycisk na "zbudowany"
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_zbudowany);

            ustawTekst = findViewById(R.id.przyciskMuru); // usuwa tekst na przycisku
            ustawTekst.setText("");


            ustawTekst = findViewById(R.id.najnowszyObronny); // ustawia ze najnowszy zbudowany budynek to mur
            ustawTekst.setText("Mur");

            ustawObrazek = findViewById(R.id.obrazekObronnego);
            ustawObrazek.setImageResource(R.drawable.ikona_mur_256x256);


        }
        if (Gracze.playerHuman.isFort()) {          // ustawia zaleznie od tego czy gracz ma fort tło przycisku i tekst
            ustawPrzycisk = findViewById(R.id.przyciskFortu);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_zbudowany);




            ustawTekst = findViewById(R.id.najnowszyObronny);
            ustawTekst.setText("Fort");

            ustawObrazek = findViewById(R.id.obrazekObronnego);
            ustawObrazek.setImageResource(R.drawable.ikona_fort_256x256);


        }
        if (Gracze.playerHuman.isZamek()) {          // ustawia zaleznie od tego czy gracz ma zamek tło przycisku i tekst
            ustawPrzycisk = findViewById(R.id.przyciskZamku);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_zbudowany);




            ustawTekst = findViewById(R.id.najnowszyObronny);
            ustawTekst.setText("Zamek");

            ustawObrazek = findViewById(R.id.obrazekObronnego);
            ustawObrazek.setImageResource(R.drawable.ikona_zamek_256x256); // do ustawiania obrazkow image view, uzywac setImageResource
        }
        if (Gracze.playerHuman.isCytadela()) {          // ustawia zaleznie od tego czy gracz ma cytadele tło przycisku i tekst
            ustawPrzycisk = findViewById(R.id.przyciskCytadeli);
            ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_zbudowany);



            ustawTekst = findViewById(R.id.najnowszyObronny);
            ustawTekst.setText("Cytadela");

            ustawObrazek = findViewById(R.id.obrazekObronnego);
            ustawObrazek.setImageResource(R.drawable.ikona_cytadela_256x256);


        }
    }

    public void powrotDoMenuBudowy(View view) {
        Intent intencjaPowrotuDoMenuGlownego = new Intent(this, menuBudowyActivity.class);
        startActivity(intencjaPowrotuDoMenuGlownego);
        finish();
    }

    public void doKartyBudowyBaraki(View view) {
        if (!Gracze.playerHuman.isBaraki()) {
            Intent intencjaKartyBudowyMilitarnych = new Intent(this, KartaBudowaniaMilitarne.class);
            WybranyBudynek.Numery.setWybranyBudynek((byte) 8);
            startActivity(intencjaKartyBudowyMilitarnych);
            finish();
        }
    }

    public void doKartyBudowyMur(View view) {
        if (!Gracze.playerHuman.isMur()) {
            Intent intencjaKartyBudowyMilitarnych = new Intent(this, KartaBudowaniaMilitarne.class);
            WybranyBudynek.Numery.setWybranyBudynek((byte) 9);
            startActivity(intencjaKartyBudowyMilitarnych);
            finish();
        }
    }

    public void doKartyBudowyFort(View view) {
        if (!Gracze.playerHuman.isFort() && Gracze.playerHuman.isMur()) {
            Intent intencjaKartyBudowyMilitarnych = new Intent(this, KartaBudowaniaMilitarne.class);
            WybranyBudynek.Numery.setWybranyBudynek((byte) 10);
            startActivity(intencjaKartyBudowyMilitarnych);
            finish();
        }
    }

    public void doKartyBudowyZamek(View view) {
        if (!Gracze.playerHuman.isZamek() && Gracze.playerHuman.isFort()) {
            Intent intencjaKartyBudowyMilitarnych = new Intent(this, KartaBudowaniaMilitarne.class);
            WybranyBudynek.Numery.setWybranyBudynek((byte) 11);
            startActivity(intencjaKartyBudowyMilitarnych);
            finish();
        }
    }

    public void doKartyBudowyCytadela(View view) {
        if (!Gracze.playerHuman.isCytadela() && Gracze.playerHuman.isZamek()) {
            Intent intencjaKartyBudowyMilitarnych = new Intent(this, KartaBudowaniaMilitarne.class);
            WybranyBudynek.Numery.setWybranyBudynek((byte) 12);
            startActivity(intencjaKartyBudowyMilitarnych);
            finish();
        }
    }
}
