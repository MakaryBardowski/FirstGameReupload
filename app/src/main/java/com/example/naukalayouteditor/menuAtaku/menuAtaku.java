package com.example.naukalayouteditor.menuAtaku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.menuGlowneActivity;


public class menuAtaku extends AppCompatActivity {


    public static short wybranyWrog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atak_menu);



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


    public void atakLatwy(View view) {
        wybranyWrog = 1;
        Intent intent = new Intent(this, atakPodgladWroga.class);
        startActivity(intent);
        finish();


    }

    public void atakSredni(View view) {
        wybranyWrog = 2;
        Intent intent = new Intent(this, atakPodgladWroga.class);
        startActivity(intent);
        finish();
    }


    public void atakTrudny(View view) {
        wybranyWrog = 3;
        Intent intent = new Intent(this, atakPodgladWroga.class);
        startActivity(intent);
        finish();
    }



    public void powrot(View view){
        Intent intent = new Intent(this, menuGlowneActivity.class);
        startActivity(intent);
        finish();
    }
}
