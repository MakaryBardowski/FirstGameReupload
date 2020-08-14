package com.example.naukalayouteditor.menuTreningu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.WybranyBudynek;
import com.example.naukalayouteditor.menuBudowy.KartaBudowaniaMieszkalneGospodarcze;
import com.example.naukalayouteditor.menuGlowneActivity;

public class menuTreninguActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_treningu);



        TextView ustawTekst;

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

        ustawTekst = findViewById(R.id.textViewPiechota);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscPiechoty())));

        ustawTekst = findViewById(R.id.textViewLucznicy);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscLucznikow())));

        ustawTekst = findViewById(R.id.textViewKawaleria);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscKawalerii())));
    }

    public void powrotDoMenuGlownego(View view) {
        Intent intencjaPowrotuDoMenuGlownego = new Intent(this, menuGlowneActivity.class);  // nazwa pomocnicza
        startActivity(intencjaPowrotuDoMenuGlownego);
        finish();
    }

    public void doKartyBudowyPiechoty(View view) {
        Intent intencjaKartyBudowyZolnierzy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte) 13);
        startActivity(intencjaKartyBudowyZolnierzy);
        finish();
    }

    public void doKartyBudowyLucznikow(View view) {
        Intent intencjaKartyBudowyZolnierzy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte) 14);
        startActivity(intencjaKartyBudowyZolnierzy);
        finish();
    }

    public void doKartyBudowyKawalerii(View view) {
        Intent intencjaKartyBudowyZolnierzy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte) 15);
        startActivity(intencjaKartyBudowyZolnierzy);
        finish();
    }
}
