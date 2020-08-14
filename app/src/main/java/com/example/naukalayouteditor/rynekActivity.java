package com.example.naukalayouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class rynekActivity extends AppCompatActivity {

    short wybranySprzedaz = 0; //0 to nic , 1 to zloto, 2 to jedzenie, 3 drewno, 4 kamien, 5 zelazo
    short wybranyKupno = 0; // 0 to nic, ,  1 to zloto, 2 to jedzenie, 3 drewno, 4 kamien, 5 zelazo

    TextView ustawTekst;
    Button ustawPrzycisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rynek);



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


        //// poligon testowy


        int maksymalnySlider = 0;

        // set a change listener on the SeekBar
        SeekBar slajder = findViewById(R.id.seekBar);  // składnia taka sama jak textView.
        slajder.setOnSeekBarChangeListener(seekBarChangeListener);
        slajder.setMax(maksymalnySlider);


        int iloscRynek = slajder.getProgress();
        ustawTekst = findViewById(R.id.sprzedaszIlosc);
        ustawTekst.setText(Integer.toString(iloscRynek));
        ustawTekst = findViewById(R.id.kupiszIlosc);
        ustawTekst.setText(Integer.toString(iloscRynek));
        //// poligon testowy


    }

    public void powrotDoMenuGlownego(View view) {
        Intent intencjaPowrotuDoMenuGlownego = new Intent(this, menuGlowneActivity.class);  // nazwa pomocnicza
        startActivity(intencjaPowrotuDoMenuGlownego);
        finish();
    }

    /// poligon testowy

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int iloscRynek, boolean fromUser) {
            // updated continuously as the user slides the thumb
            ustawTekst = findViewById(R.id.sprzedaszIlosc);

            ustawTekst.setText(Integer.toString(iloscRynek));

            ustawTekst = findViewById(R.id.kupiszIlosc);
            if(wybranySprzedaz == 1) {
                ustawTekst.setText(Long.toString(Math.round(iloscRynek * WydarzeniaSprawdzanie.surowceZaZloto)));
            } else if (wybranyKupno == 1){
                ustawTekst.setText(Long.toString(Math.round(iloscRynek * WydarzeniaSprawdzanie.zlotoZaSurowce)));
            } else {
                ustawTekst.setText(Long.toString(Math.round(iloscRynek * WydarzeniaSprawdzanie.surowceZaSurowce)));
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };
    //// poligon testowy


    // poprawić na bardziej uniwersalne
    public void wybierzSprzedazZloto(View view) {

        wybranySprzedaz = 1;

        SeekBar slajder = findViewById(R.id.seekBar); // ustawia max slajdera na max ilosc sprzedawanego surowca (ilosc kupowanego maksymalna jest zalezna od kursu)
        int maksymalnySlider = (int) Gracze.playerHuman.getZloto();
        slajder.setMax(maksymalnySlider);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZloto); // ustawia ze ten wybrany
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajJedzenie); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);


    }

    public void wybierzSprzedazJedzenie(View view) {
        wybranySprzedaz = 2;

        SeekBar slajder = findViewById(R.id.seekBar); // ustawia max slajdera na max ilosc sprzedawanego surowca (ilosc kupowanego maksymalna jest zalezna od kursu)
        int maksymalnySlider = (int) Gracze.playerHuman.getJedzenie();
        slajder.setMax(maksymalnySlider);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

    }

    public void wybierzSprzedazDrewno(View view) {
        wybranySprzedaz = 3;

        SeekBar slajder = findViewById(R.id.seekBar); // ustawia max slajdera na max ilosc sprzedawanego surowca (ilosc kupowanego maksymalna jest zalezna od kursu)
        int maksymalnySlider = (int) Gracze.playerHuman.getDrewno();
        slajder.setMax(maksymalnySlider);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
    }

    public void wybierzSprzedazKamien(View view) {
        wybranySprzedaz = 4;

        SeekBar slajder = findViewById(R.id.seekBar); // ustawia max slajdera na max ilosc sprzedawanego surowca (ilosc kupowanego maksymalna jest zalezna od kursu)
        int maksymalnySlider = (int) Gracze.playerHuman.getKamien();
        slajder.setMax(maksymalnySlider);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
    }

    public void wybierzSprzedazZelazo(View view) {
        wybranySprzedaz = 5;

        SeekBar slajder = findViewById(R.id.seekBar); // ustawia max slajdera na max ilosc sprzedawanego surowca (ilosc kupowanego maksymalna jest zalezna od kursu)
        int maksymalnySlider = (int) Gracze.playerHuman.getZelazo();
        slajder.setMax(maksymalnySlider);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskSprzedajZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskSprzedajKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);


    }


    public void wybierzKupZloto(View view) {
        wybranyKupno = 1;
        ustawPrzycisk = findViewById(R.id.przyciskKupZloto);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskKupJedzenie); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
    }

    public void wybierzKupJedzenie(View view) {
        wybranyKupno = 2;
        ustawPrzycisk = findViewById(R.id.przyciskKupJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskKupZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
    }

    public void wybierzKupDrewno(View view) {
        wybranyKupno = 3;
        ustawPrzycisk = findViewById(R.id.przyciskKupDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskKupZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
    }

    public void wybierzKupKamien(View view) {
        wybranyKupno = 4;
        ustawPrzycisk = findViewById(R.id.przyciskKupKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskKupZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
    }

    public void wybierzKupZelazo(View view) {
        wybranyKupno = 5;
        ustawPrzycisk = findViewById(R.id.przyciskKupZelazo);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_wybrany);


        ustawPrzycisk = findViewById(R.id.przyciskKupZloto); // ustawia inne na zwykle tlo
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupJedzenie);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupDrewno);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);

        ustawPrzycisk = findViewById(R.id.przyciskKupKamien);
        ustawPrzycisk.setBackgroundResource(R.drawable.przycisk_menu);
    }


    public void zatwierdz(View view) {
        SeekBar slajder = findViewById(R.id.seekBar);
        if (wybranySprzedaz != 0 && wybranyKupno == 0 | wybranyKupno == wybranySprzedaz) {

        } else {

            ustawTekst = findViewById(R.id.sprzedaszIlosc);
            int sprzedane = Integer.parseInt(ustawTekst.getText().toString());
            ustawTekst = findViewById(R.id.kupiszIlosc);
            int kupione = Integer.parseInt(ustawTekst.getText().toString());

            if (wybranySprzedaz == 1) {
                Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - sprzedane);
                ustawTekst = findViewById(R.id.textViewZloto);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getZloto())));
                int maksymalnySlider = (int) Gracze.playerHuman.getZloto();
                slajder.setMax(maksymalnySlider);

            } else if (wybranySprzedaz == 2) {
                Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - sprzedane);
                ustawTekst = findViewById(R.id.textViewJedzenie);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getJedzenie())));
                int maksymalnySlider = (int) Gracze.playerHuman.getJedzenie(); // ustawia max slajdera na ilosc surowca po sprzedazy
                slajder.setMax(maksymalnySlider);
            } else if (wybranySprzedaz == 3) {
                Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - sprzedane);
                ustawTekst = findViewById(R.id.textViewDrewno);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getDrewno())));
                int maksymalnySlider = (int) Gracze.playerHuman.getDrewno();
                slajder.setMax(maksymalnySlider);
            } else if (wybranySprzedaz == 4) {
                Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - sprzedane);
                ustawTekst = findViewById(R.id.textViewKamien);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getKamien())));
                int maksymalnySlider = (int) Gracze.playerHuman.getKamien();
                slajder.setMax(maksymalnySlider);
            } else if (wybranySprzedaz == 5) {
                Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - sprzedane);
                ustawTekst = findViewById(R.id.textViewZelazo);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getZelazo())));
                int maksymalnySlider = (int) Gracze.playerHuman.getZelazo();
                slajder.setMax(maksymalnySlider);
            }

            if (wybranyKupno == 1) {
                Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() + kupione);
                ustawTekst = findViewById(R.id.textViewZloto);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getZloto())));
            } else if (wybranyKupno == 2) {
                Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() + kupione);
                ustawTekst = findViewById(R.id.textViewJedzenie);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getJedzenie())));
            } else if (wybranyKupno == 3) {
                Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() + kupione);
                ustawTekst = findViewById(R.id.textViewDrewno);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getDrewno())));
            } else if (wybranyKupno == 4) {
                Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() + kupione);
                ustawTekst = findViewById(R.id.textViewKamien);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getKamien())));
            } else if (wybranyKupno == 5) {
                Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() + kupione);
                ustawTekst = findViewById(R.id.textViewZelazo);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getZelazo())));
            }
        }
    }
}
