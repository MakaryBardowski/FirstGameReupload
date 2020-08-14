package com.example.naukalayouteditor.menuBudowy.Gospodarcze;

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

// todo: w layoucie gospodarczych zajebac 4 budynek targowisko.
public class menuBudowyGospodarcze extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_budowy_gospodarcze);

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
        ustawTekst.setText(Integer.toString(Math.round(Gracze.playerHuman.getIloscTartakow())));

        ustawTekst = findViewById(R.id.textViewIloscBudynku2);
        ustawTekst.setText(Integer.toString(Math.round(Gracze.playerHuman.getIloscKopalni())));

        ustawTekst = findViewById(R.id.textViewIloscBudynku3);
        ustawTekst.setText(Integer.toString(Math.round(Gracze.playerHuman.getIloscHut())));

    }

    public void powrotDoMenuBudowy(View view){
        Intent intencjaPowrotuDoMenuBudowy = new Intent(this, menuBudowyActivity.class);  // nazwa pomocnicza
        startActivity(intencjaPowrotuDoMenuBudowy);
        finish();
    }
    public void doKartyBudowyTartak(View view){
        Intent intencjaDoKartyBudowy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte)5);
        startActivity(intencjaDoKartyBudowy);
        finish();
    }
    public void doKartyBudowyKopalnia(View view){
        Intent intencjaDoKartyBudowy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte)6);
        startActivity(intencjaDoKartyBudowy);
        finish();
    }
    public void doKartyBudowyHuta(View view){
        Intent intencjaDoKartyBudowy = new Intent(this, KartaBudowaniaMieszkalneGospodarcze.class);
        WybranyBudynek.Numery.setWybranyBudynek((byte)7);
        startActivity(intencjaDoKartyBudowy);
        finish();
    }
}
