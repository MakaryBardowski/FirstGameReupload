package com.example.naukalayouteditor.menuBudowy.Mieszkalne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.menuBudowy.KartaBudowaniaMieszkalneGospodarcze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.WybranyBudynek;
import com.example.naukalayouteditor.menuBudowy.menuBudowyActivity;
import com.example.naukalayouteditor.menuGlowneActivity;

public class menuBudowyMieszkalne extends AppCompatActivity {
 boolean testowyPrzycisku = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_budowy_mieszkalne);



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

        ustawTekst = findViewById(R.id.textViewIloscBudynku1);
        ustawTekst.setText(Integer.toString(Math.round(Gracze.playerHuman.getIloscChat())));

        ustawTekst = findViewById(R.id.textViewIloscBudynku2);
        ustawTekst.setText(Integer.toString(Math.round(Gracze.playerHuman.getIloscFolwarkow())));

        ustawTekst = findViewById(R.id.textViewIloscBudynku3);
        ustawTekst.setText(Integer.toString(Math.round(Gracze.playerHuman.getIloscDworow())));

        ustawTekst = findViewById(R.id.textViewIloscBudynku4);
        ustawTekst.setText(Integer.toString(Math.round(Gracze.playerHuman.getIloscPalacow())));

    }

    public void powrotDoMenuBudowy(View view){
        Intent intencjaPowrotuDoMenuBudowy = new Intent(this, menuBudowyActivity.class);  // nazwa pomocnicza
        startActivity(intencjaPowrotuDoMenuBudowy);
        finish();
    }
    public void doKartyBudowyChata(View view){
        Intent intencjaDoKartyBudowy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte)1);
        startActivity(intencjaDoKartyBudowy);
        finish();
    }
    public void doKartyBudowyFolwark(View view){
        Intent intencjaDoKartyBudowy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte)2);
        startActivity(intencjaDoKartyBudowy);
        finish();
    }
    public void doKartyBudowyDwor(View view){
        Intent intencjaDoKartyBudowy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte)3);
        startActivity(intencjaDoKartyBudowy);
        finish();
    }
    public void doKartyBudowyPalac(View view){
        Intent intencjaDoKartyBudowy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte)4);
        startActivity(intencjaDoKartyBudowy);
        finish();
    }



}
