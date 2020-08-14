package com.example.naukalayouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.naukalayouteditor.menuBudowy.KartaBudowaniaMieszkalneGospodarcze;
import com.example.naukalayouteditor.menuBudowy.menuBudowyActivity;

public class BladLubZbudowales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blad_lub_zbudowales);
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

        ustawTekst = findViewById(R.id.BladCzyZbudowanyText);

        if(WybranyBudynek.Numery.getZbudowaneCzyNie() == 1){
            ustawTekst.setText("Pomyślnie zbudowałeś budynek.");
        } else if (WybranyBudynek.Numery.getZbudowaneCzyNie() == 2){
            ustawTekst.setText("Nie masz wystarczająco zasobów by zbudować budynek.");
        } else if (WybranyBudynek.Numery.getZbudowaneCzyNie() == 3){
            ustawTekst.setText("Musisz wpisać liczbę dodatnią!");
        } else if (WybranyBudynek.Numery.getZbudowaneCzyNie() == 4){
            ustawTekst.setText("Pomyślnie wyszkoliłeś wojsko.");
        } else if (WybranyBudynek.Numery.getZbudowaneCzyNie() == 5){
            ustawTekst.setText("Nie masz wystarczająco zasobów by wyszkolić wojsko.");
        }



    }

    public void powrotDoMenu(View view){
        if(WybranyBudynek.Numery.getWybranyBudynek() >= 13 && WybranyBudynek.Numery.getWybranyBudynek() <= 15) {
            Intent powrotDOMenu = new Intent(this, menuGlowneActivity.class);
            startActivity(powrotDOMenu);
            finish();
        } else {
            Intent powrotDOMenuBudowy = new Intent(this, menuBudowyActivity.class);
            startActivity(powrotDOMenuBudowy);
            finish();
        }
    }
}
