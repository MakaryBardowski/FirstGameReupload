package com.example.naukalayouteditor.menuAtaku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.WydarzeniaSprawdzanie;
import com.example.naukalayouteditor.WydarzenieActivty;

import java.util.Random;


public class atakPodgladWroga extends AppCompatActivity {
    TextView ustawTekst;
    ImageView ustawObrazek;
    Button ustawPrzycisk;


    private static Random losowanie = new Random();


    double iloscStalaPiechotyWroga = 0; // wrogowie maja ilosc wojska bazowana na ilosci wojsk gracza + stałą ilość
    double iloscStalaLucznikowWroga = 0; //
    double iloscStalaKawaleriiWroga = 0; //


    short wybranaJednostkaAtakujacego = 0;
    short wybranaJednostkaAtakowana = 0;   // 0 to zadna, 1 to piechota gracza, 2 to lucznicy gracza, 3 to kawaleria gracza, 4 to piechota wroga , 5 to lucznicy wroga, 6 to kawaleria wroga


    int silaAtaku;
    int silaObrony;

    int losowyNumerAi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atak_podglad_wroga);

        if (menuAtaku.wybranyWrog == 1) {
            iloscStalaPiechotyWroga = 15;
            iloscStalaLucznikowWroga = 7;
            iloscStalaKawaleriiWroga = 2;

            double dolnaGranicaLosowaniaAtakWydarzenia = 0.45;
            double gornaGranicaLosowaniaAtakWydarzenia = 1.05; // potrzebne do ataku wroga jako wydarzenie

            // linijka na dole losuje doubla z przedzialu, dodaje do niej stala ilosc wojsk zalezna od trudnosci przeciwnika, potem ustawia wojska komputera na wynik tego dzialania
            Gracze.playerComputerAtak.setIloscPiechoty(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscPiechoty() + iloscStalaPiechotyWroga));
            Gracze.playerComputerAtak.setIloscLucznikow(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscLucznikow() + iloscStalaLucznikowWroga));
            Gracze.playerComputerAtak.setIloscKawalerii(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscKawalerii() + iloscStalaKawaleriiWroga));

        } else if (menuAtaku.wybranyWrog == 2) {

            iloscStalaPiechotyWroga = 40;
            iloscStalaLucznikowWroga = 17;
            iloscStalaKawaleriiWroga = 6;

            double dolnaGranicaLosowaniaAtakWydarzenia = 0.9;
            double gornaGranicaLosowaniaAtakWydarzenia = 1.2; // potrzebne do ataku wroga jako wydarzenie

            // linijka na dole losuje doubla z przedzialu, dodaje do niej stala ilosc wojsk zalezna od trudnosci przeciwnika, potem ustawia wojska komputera na wynik tego dzialania
            Gracze.playerComputerAtak.setIloscPiechoty(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscPiechoty() + iloscStalaPiechotyWroga));
            Gracze.playerComputerAtak.setIloscLucznikow(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscLucznikow() + iloscStalaLucznikowWroga));
            Gracze.playerComputerAtak.setIloscKawalerii(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscKawalerii() + iloscStalaKawaleriiWroga));
        } else if (menuAtaku.wybranyWrog == 3) {
            iloscStalaPiechotyWroga = 89;
            iloscStalaLucznikowWroga = 54;
            iloscStalaKawaleriiWroga = 21;

            double dolnaGranicaLosowaniaAtakWydarzenia = 1;
            double gornaGranicaLosowaniaAtakWydarzenia = 1.35; // potrzebne do ataku wroga jako wydarzenie

            // linijka na dole losuje doubla z przedzialu, dodaje do niej stala ilosc wojsk zalezna od trudnosci przeciwnika, potem ustawia wojska komputera na wynik tego dzialania
            Gracze.playerComputerAtak.setIloscPiechoty(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscPiechoty() + iloscStalaPiechotyWroga));
            Gracze.playerComputerAtak.setIloscLucznikow(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscLucznikow() + iloscStalaLucznikowWroga));
            Gracze.playerComputerAtak.setIloscKawalerii(Math.round((dolnaGranicaLosowaniaAtakWydarzenia + (gornaGranicaLosowaniaAtakWydarzenia - dolnaGranicaLosowaniaAtakWydarzenia) * losowanie.nextDouble()) * Gracze.playerHuman.getIloscKawalerii() + iloscStalaKawaleriiWroga));
        }


        ustawTekst = findViewById(R.id.iloscPiechotaGracz);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscPiechoty())));

        ustawTekst = findViewById(R.id.iloscLucznicyGracz);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscLucznikow())));

        ustawTekst = findViewById(R.id.iloscKawaleriaGracz);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscKawalerii())));

        ustawTekst = findViewById(R.id.iloscPiechotaWrog);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscPiechoty())));

        ustawTekst = findViewById(R.id.iloscLucznicyWrog);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscLucznikow())));

        ustawTekst = findViewById(R.id.iloscKawaleriaWrog);
        ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscKawalerii())));


//        ustawObrazek = findViewById(R.id.piechotaWrog);
//        ustawObrazek.setClickable(false);
//
//        ustawObrazek = findViewById(R.id.lucznicyWrog);
//        ustawObrazek.setClickable(false);
//
//        ustawObrazek = findViewById(R.id.kawaleriaWrog);
//        ustawObrazek.setClickable(false);


    }

    public void atakujacyWybierzPiechote(View view) {   // napisane do konca


        ustawObrazek = findViewById(R.id.lucznicyGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_256x256);

        ustawObrazek = findViewById(R.id.kawaleriaGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_256x256);


        ustawObrazek = findViewById(R.id.piechotaGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_piechota_wybrana256x256);
        wybranaJednostkaAtakujacego = 1;


    }

    public void atakujacyWybierzLucznikow(View view) {


        ustawObrazek = findViewById(R.id.piechotaGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_piechota_256x256);

        ustawObrazek = findViewById(R.id.kawaleriaGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_256x256);


        ustawObrazek = findViewById(R.id.lucznicyGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_wybrani256x256);
        wybranaJednostkaAtakujacego = 2;


    }

    public void atakujacyWybierzKawaleria(View view) {

        ustawObrazek = findViewById(R.id.piechotaGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_piechota_256x256);

        ustawObrazek = findViewById(R.id.lucznicyGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_256x256);

        ustawObrazek = findViewById(R.id.kawaleriaGracz);
        ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_wybrana256x256);
        wybranaJednostkaAtakujacego = 3;


    }


    public void AtakowanyWybierzPiechote(View view) {  // napisane do konca


        ustawObrazek = findViewById(R.id.lucznicyWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_wrog);

        ustawObrazek = findViewById(R.id.kawaleriaWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_wrog);


        ustawObrazek = findViewById(R.id.piechotaWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_piechota_wrog_atakowana);
        wybranaJednostkaAtakowana = 4;


    }


    public void AtakowanyWybierzLucznikow(View view) {      // napisane do konca


        ustawObrazek = findViewById(R.id.piechotaWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_piechota_wrog);

        ustawObrazek = findViewById(R.id.kawaleriaWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_wrog);


        ustawObrazek = findViewById(R.id.lucznicyWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_wrog_atakowani);
        wybranaJednostkaAtakowana = 5;


    }


    public void AtakowanyWybierzKawalerie(View view) {     // napisane do konca


        ustawObrazek = findViewById(R.id.piechotaWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_piechota_wrog);

        ustawObrazek = findViewById(R.id.lucznicyWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_wrog);


        ustawObrazek = findViewById(R.id.kawaleriaWrog);
        ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_wrog_atakowana);
        wybranaJednostkaAtakowana = 6;


    }
    public void wybieranieAtakujacegoAi(){
        losowyNumerAi = losowanie.nextInt(3);
        if (losowyNumerAi == 0 && Gracze.playerComputerAtak.getIloscPiechoty() != 0) {
            wybranaJednostkaAtakujacego = 4;
        } else if (losowyNumerAi == 1 && Gracze.playerHuman.getIloscLucznikow() != 0) {
            wybranaJednostkaAtakujacego = 5;
        } else if (losowyNumerAi == 2 && Gracze.playerHuman.getIloscKawalerii() != 0) {
            wybranaJednostkaAtakujacego = 6;
        } else {
            wybieranieAtakujacegoAi();
        }
    }

    public void wybieranieWrogaAi(){
        losowyNumerAi = losowanie.nextInt(3);
        if (losowyNumerAi == 0 && Gracze.playerHuman.getIloscPiechoty() != 0) {
            wybranaJednostkaAtakowana = 1;
        } else if (losowyNumerAi == 1&& Gracze.playerHuman.getIloscLucznikow() != 0) {
            wybranaJednostkaAtakowana = 2;
        } else if (losowyNumerAi == 2 && Gracze.playerHuman.getIloscKawalerii() != 0) {
            wybranaJednostkaAtakowana = 3;

        } else {wybieranieWrogaAi();}
    }


    public void ai() {

wybieranieAtakujacegoAi();

        wybieranieWrogaAi();

        silaObrony = 0;
        if (wybranaJednostkaAtakowana == 1) {
            silaObrony = (int) Math.round(Gracze.playerHuman.getIloscPiechoty() * 1);
        } else if (wybranaJednostkaAtakowana == 2) {
            silaObrony = (int) Math.round(Gracze.playerHuman.getIloscLucznikow() * 2.5);
        } else if (wybranaJednostkaAtakowana == 3) {
            silaObrony = (int) Math.round(Gracze.playerHuman.getIloscKawalerii() * 0.5); // ustalnie sily obrony gracza
        }

silaAtaku =0;
         if (wybranaJednostkaAtakujacego == 4) { // ustalanie sily ataku kompa
            silaAtaku = (int) Math.round(Gracze.playerComputerAtak.getIloscPiechoty() * 0.85);
            if (silaAtaku > silaObrony) {
                Gracze.playerComputerAtak.setIloscPiechoty((silaAtaku - silaObrony) / 0.85);
            } else {
                Gracze.playerComputerAtak.setIloscPiechoty(0);
            }


        } else if (wybranaJednostkaAtakujacego == 5) {
            silaAtaku = (int) Math.round(Gracze.playerComputerAtak.getIloscLucznikow() * 0.9);
            if (silaAtaku > silaObrony) {
                Gracze.playerComputerAtak.setIloscLucznikow((silaAtaku/0.9 - silaObrony));
            } else {
                Gracze.playerComputerAtak.setIloscLucznikow(0);
            }


        } else if (wybranaJednostkaAtakujacego == 6) {
            silaAtaku = (int) Math.round(Gracze.playerComputerAtak.getIloscKawalerii() * 0.95);
            if (silaAtaku > silaObrony) {
                Gracze.playerComputerAtak.setIloscKawalerii((silaAtaku - silaObrony) / 0.95);
            } else {
                Gracze.playerComputerAtak.setIloscKawalerii(0);
            }


        }


        // odejmowanie wojsk broniacych
        if (wybranaJednostkaAtakowana == 1) {
            if (silaAtaku > silaObrony) {
                Gracze.playerHuman.setIloscPiechoty(0);
            } else {
                Gracze.playerHuman.setIloscPiechoty(silaObrony - silaAtaku);
            }

        } else if (wybranaJednostkaAtakowana == 2) {
            if (silaAtaku > silaObrony) {
                Gracze.playerHuman.setIloscLucznikow(0);
            } else {
                Gracze.playerHuman.setIloscLucznikow((silaObrony/2 - silaAtaku));
            }

        } else if (wybranaJednostkaAtakowana == 3) {
            if (silaAtaku > silaObrony) {
                Gracze.playerHuman.setIloscKawalerii(0);
            } else {
                Gracze.playerHuman.setIloscKawalerii((silaObrony - silaAtaku) / 3);
            }
        }
    }

    public void atak(View view) {
        if (wybranaJednostkaAtakujacego != 0 && wybranaJednostkaAtakowana != 0) {
            // usuniecie przycisku powrotu
            ustawPrzycisk = findViewById(R.id.przyciskPowrot);
            ustawPrzycisk.setBackgroundColor(Color.TRANSPARENT);
            ustawPrzycisk.setClickable(false);


            ustawTekst = findViewById(R.id.przyciskPowrot);
            ustawTekst.setText("");
            // usuniecie przycisku powrotu


            // matematyka
            // obliczanie sily obrony v
            if (wybranaJednostkaAtakowana == 1) {
                silaObrony = (int) Math.round(Gracze.playerHuman.getIloscPiechoty() * 1);
            } else if (wybranaJednostkaAtakowana == 2) {
                silaObrony = (int) Math.round(Gracze.playerHuman.getIloscLucznikow() * 2.5);
            } else if (wybranaJednostkaAtakowana == 3) {
                silaObrony = (int) Math.round(Gracze.playerHuman.getIloscKawalerii() * 0.5); // ustalnie sily obrony gracza
            } else if (wybranaJednostkaAtakowana == 4) { // ustalanie sily obrony kompa
                silaObrony = (int) Math.round(Gracze.playerComputerAtak.getIloscPiechoty() * 0.85);
            } else if (wybranaJednostkaAtakowana == 5) {
                silaObrony = (int) Math.round(Gracze.playerComputerAtak.getIloscLucznikow() * 1.5);
            } else if (wybranaJednostkaAtakowana == 6) {
                silaObrony = (int) Math.round(Gracze.playerComputerAtak.getIloscKawalerii() * 0.4);
            }


            // obliczanie sily ataku i odejmowanie wojsk atakujacych
            if (wybranaJednostkaAtakujacego == 1) {
                silaAtaku = (int) Math.round(Gracze.playerHuman.getIloscPiechoty() * 1);
                if (silaAtaku > silaObrony) {
                    Gracze.playerHuman.setIloscPiechoty(silaAtaku - silaObrony);
                } else {
                    Gracze.playerHuman.setIloscPiechoty(0);
                }
                ustawTekst = findViewById(R.id.iloscPiechotaGracz);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscPiechoty())));


            } else if (wybranaJednostkaAtakujacego == 2) {
                silaAtaku = (int) Math.round(Gracze.playerHuman.getIloscLucznikow() * 2);
                if (silaAtaku > silaObrony) {
                    Gracze.playerHuman.setIloscLucznikow((silaAtaku - silaObrony) / 2);
                } else {
                    Gracze.playerHuman.setIloscLucznikow(0);
                }
                ustawTekst = findViewById(R.id.iloscLucznicyGracz);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscLucznikow())));


            } else if (wybranaJednostkaAtakujacego == 3) {
                silaAtaku = (int) Math.round(Gracze.playerHuman.getIloscKawalerii() * 3); // ustalnie sily ataku gracza
                if (silaAtaku > silaObrony) {
                    Gracze.playerHuman.setIloscKawalerii((silaAtaku - silaObrony) / 3);
                } else {
                    Gracze.playerHuman.setIloscKawalerii(0);
                }
                ustawTekst = findViewById(R.id.iloscKawaleriaGracz);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscKawalerii())));


            }


            // odejmowanie wojsk broniacych
            if (wybranaJednostkaAtakowana == 4) {
                if (silaAtaku > silaObrony) {
                    Gracze.playerComputerAtak.setIloscPiechoty(0);
                } else {
                    Gracze.playerComputerAtak.setIloscPiechoty((silaObrony - silaAtaku) / 0.85);
                }
                ustawTekst = findViewById(R.id.iloscPiechotaWrog);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscPiechoty())));
            } else if (wybranaJednostkaAtakowana == 5) {
                if (silaAtaku > silaObrony) {
                    Gracze.playerComputerAtak.setIloscLucznikow(0);
                } else {
                    Gracze.playerComputerAtak.setIloscLucznikow((silaObrony - silaAtaku) / 0.9);

                }
                ustawTekst = findViewById(R.id.iloscLucznicyWrog);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscLucznikow())));
            } else if (wybranaJednostkaAtakowana == 6) {
                if (silaAtaku > silaObrony) {
                    Gracze.playerComputerAtak.setIloscKawalerii(0);
                } else {
                    Gracze.playerComputerAtak.setIloscKawalerii((silaObrony - silaAtaku) / 0.95);
                }
                ustawTekst = findViewById(R.id.iloscKawaleriaWrog);
                ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscKawalerii())));
            }


            // matematyka
            wybranaJednostkaAtakowana = 0;
            wybranaJednostkaAtakujacego = 0;

            // sprawdzanie czy ktos wygral

            if (Gracze.playerHuman.getIloscPiechoty() == 0 && Gracze.playerHuman.getIloscLucznikow() == 0 && Gracze.playerHuman.getIloscKawalerii() == 0) {
                WydarzenieActivty.eventPrzeczytany = false;
                WydarzeniaSprawdzanie.losowyNumerWydarzenia = 1000;
                Intent intent = new Intent(this, WydarzenieActivty.class);
                startActivity(intent);

            } else if (Gracze.playerComputerAtak.getIloscPiechoty() == 0 && Gracze.playerComputerAtak.getIloscLucznikow() == 0 && Gracze.playerComputerAtak.getIloscKawalerii() == 0) {
                WydarzenieActivty.eventPrzeczytany = false;
                WydarzeniaSprawdzanie.losowyNumerWydarzenia = 999;
                Intent intent = new Intent(this, WydarzenieActivty.class);
                startActivity(intent);


            }
            //sprawdzanie czy ktos wygral


            // resetowanie ikon

            ustawTekst = findViewById(R.id.turaGracza);
            ustawTekst.setText("");

            ustawTekst = findViewById(R.id.czyjaTura);
            ustawTekst.setText("");

            ustawObrazek = findViewById(R.id.piechotaGracz);
            ustawObrazek.setImageResource(R.drawable.ikona_piechota_256x256);

            ustawObrazek = findViewById(R.id.lucznicyGracz);
            ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_256x256);

            ustawObrazek = findViewById(R.id.kawaleriaGracz);
            ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_256x256);

            ustawObrazek = findViewById(R.id.piechotaWrog);
            ustawObrazek.setImageResource(R.drawable.ikona_piechota_wrog);

            ustawObrazek = findViewById(R.id.lucznicyWrog);
            ustawObrazek.setImageResource(R.drawable.ikona_lucznicy_wrog);

            ustawObrazek = findViewById(R.id.kawaleriaWrog);
            ustawObrazek.setImageResource(R.drawable.ikona_kawaleria_wrog);
            // resetowaie ikon


            // ai method was supposed to be made by randomising previous attack methods written in generic, but for some reason using View methods crashed my phone, so i wrote it all over again, manually
            if ((Gracze.playerHuman.getIloscPiechoty() != 0 || Gracze.playerHuman.getIloscLucznikow() != 0 || Gracze.playerHuman.getIloscKawalerii() != 0) && ((Gracze.playerComputerAtak.getIloscPiechoty() != 0 || Gracze.playerComputerAtak.getIloscLucznikow() != 0 || Gracze.playerComputerAtak.getIloscKawalerii() != 0))) {
                ai();
            }

            wybranaJednostkaAtakowana = 0;
            wybranaJednostkaAtakujacego = 0;

            ustawTekst = findViewById(R.id.iloscPiechotaGracz);
            ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscPiechoty())));

            ustawTekst = findViewById(R.id.iloscLucznicyGracz);
            ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscLucznikow())));

            ustawTekst = findViewById(R.id.iloscKawaleriaGracz);
            ustawTekst.setText(Long.toString(Math.round(Gracze.playerHuman.getIloscKawalerii())));

            ustawTekst = findViewById(R.id.iloscPiechotaWrog);
            ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscPiechoty())));

            ustawTekst = findViewById(R.id.iloscLucznicyWrog);
            ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscLucznikow())));

            ustawTekst = findViewById(R.id.iloscKawaleriaWrog);
            ustawTekst.setText(Long.toString(Math.round(Gracze.playerComputerAtak.getIloscKawalerii())));


            if (Gracze.playerHuman.getIloscPiechoty() == 0 && Gracze.playerHuman.getIloscLucznikow() == 0 && Gracze.playerHuman.getIloscKawalerii() == 0) {
                WydarzenieActivty.eventPrzeczytany = false;
                WydarzeniaSprawdzanie.losowyNumerWydarzenia = 1000;
                Intent intent = new Intent(this, WydarzenieActivty.class);
                startActivity(intent);

            } else if (Gracze.playerComputerAtak.getIloscPiechoty() == 0 && Gracze.playerComputerAtak.getIloscLucznikow() == 0 && Gracze.playerComputerAtak.getIloscKawalerii() == 0) {
                WydarzenieActivty.eventPrzeczytany = false;
                WydarzeniaSprawdzanie.losowyNumerWydarzenia = 999;
                Intent intent = new Intent(this, WydarzenieActivty.class);
                startActivity(intent);


            }
        }
    }



    public void powrot(View view) {
        Intent intent = new Intent(this, menuAtaku.class);
        startActivity(intent);
        finish();
    }
}
