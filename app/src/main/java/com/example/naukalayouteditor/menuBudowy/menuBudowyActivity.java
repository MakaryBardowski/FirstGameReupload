package com.example.naukalayouteditor.menuBudowy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.menuBudowy.Gospodarcze.menuBudowyGospodarcze;
import com.example.naukalayouteditor.menuBudowy.Mieszkalne.menuBudowyMieszkalne;
import com.example.naukalayouteditor.menuBudowy.Militarne.menuBudowyMilitarne;
import com.example.naukalayouteditor.menuGlowneActivity;

public class menuBudowyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_budowy);
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


    }

    public void powrotDoMenuGlownego(View view){
        Intent intencjaPowrotuDoMenuGlownego = new Intent(this, menuGlowneActivity.class);  // nazwa pomocnicza
        startActivity(intencjaPowrotuDoMenuGlownego);
        finish();
    }

    public void menuBudowyMieszkalne(View view){
        Intent intencjaMenuBudowyMieszklane = new Intent(this, menuBudowyMieszkalne.class);
        startActivity(intencjaMenuBudowyMieszklane);
        finish();
    }
    public void menuBudowyGospodarcze(View view){
        Intent intencjaMenuBudowyGospodarcze = new Intent(this, menuBudowyGospodarcze.class);
        startActivity(intencjaMenuBudowyGospodarcze);
        finish();
    }
    public void menuBudowyMilitarne(View view){
        Intent intencjaMenuBudowyMilitarne = new Intent(this, menuBudowyMilitarne.class);
        startActivity(intencjaMenuBudowyMilitarne);
        finish();
    }
}
