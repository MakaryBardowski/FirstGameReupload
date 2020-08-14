package com.example.naukalayouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








    }

    public void usunImie(View view){
        EditText imiePoczatkowe = findViewById(R.id.WybierzImieMain);
        imiePoczatkowe.setText("");
    }

    public void start(View view){
        Intent wejdzDoMenuGlownego = new Intent(this, menuGlowneActivity.class);
        EditText zmianaImienia = findViewById(R.id.WybierzImieMain);
        String imie = zmianaImienia.getText().toString();
        Gracze.playerHuman.setImie(imie);
        startActivity(wejdzDoMenuGlownego);
        finish();


    }

}


