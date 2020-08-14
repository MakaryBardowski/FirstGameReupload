package com.example.naukalayouteditor.menuBudowy;
// todo: ogarnac ten syf w chuj

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.example.naukalayouteditor.BladLubZbudowales;
import com.example.naukalayouteditor.Budowle;
import com.example.naukalayouteditor.Gracze;
import com.example.naukalayouteditor.R;
import com.example.naukalayouteditor.WybranyBudynek;
import com.example.naukalayouteditor.menuBudowy.Gospodarcze.menuBudowyGospodarcze;
import com.example.naukalayouteditor.menuBudowy.Mieszkalne.menuBudowyMieszkalne;

import com.example.naukalayouteditor.menuTreningu.menuTreninguActivity;


public class KartaBudowaniaMieszkalneGospodarcze extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karta_budowania_mieszkalne);
        TextView ustawTekst;


//todo: cena budynku


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


        ustawTekst = findViewById(R.id.button26); //button26 to id przycisku "zbuduj"


        if (WybranyBudynek.Numery.getWybranyBudynek() == 1) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Chata to podstawowy budynek który zapewnia 3 Jedzenia rocznie. Na Jedzeniu bazowany jest roczny przychód mieszkańcow.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.chaty.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.chaty.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.chaty.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.chaty.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.chaty.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.chaty.getZelazo()));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 2) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Folwark, choć kosztowniejszy w budowie, jest wydajniejszy od chaty i produkuje 7 Jedzenia rocznie. Na Jedzeniu bazowany jest roczny przychód mieszkańcow.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.folwark.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.folwark.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.folwark.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.folwark.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.folwark.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.folwark.getZelazo()));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 3) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Dwór to rezydencja ubogiej szlachty. Dzięki otaczającym go polom przynosi 20 Jedzenia rocznie. Na Jedzeniu bazowany jest roczny przychód mieszkańcow.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.dwor.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.dwor.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.dwor.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.dwor.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.dwor.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.dwor.getZelazo()));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 4) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Pałac to siedziba najbogatszych mieszkańców królestwa. Dzięki wyzyskowi biedniejszych, dostarcza 75 Jedzenia rocznie. Na Jedzeniu bazowany jest roczny przychód mieszkańcow.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.palac.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.palac.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.palac.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.palac.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.palac.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.palac.getZelazo()));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 5) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Tartak to pierwszy z trzech budynków produkujących surowce. Dostarcza 20 drewna rocznie. Drewno, jak inne zasoby, potrzebne jest do budowania.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.tartak.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.tartak.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.tartak.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.tartak.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.tartak.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.tartak.getZelazo()));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 6) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Kopalnia to drugi z trzech budynków produkujących surowce. Dostarcza 20 kamienia rocznie. Kamień, jak inne zasoby, potrzebny jest do budowania.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.kopalnia.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.kopalnia.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.kopalnia.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.kopalnia.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.kopalnia.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.kopalnia.getZelazo()));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 7) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Huta to dodatkowy budynek gospodarczy dostarczający 10 żelaza rocznie. Podobnie jak drewno i kamień, potrzebne jest ono do wznoszenia budowli.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(Budowle.huta.getZloto()));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(Budowle.huta.getMieszkancy()));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(Budowle.huta.getJedzenie()));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(Budowle.huta.getDrewno()));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(Budowle.huta.getKamien()));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(Budowle.huta.getZelazo()));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 13) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Piechota to trzon każdej armii. Dobrze uzbrojeni, są równie sprawni w obronie, co w ataku.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(165));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(1));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(30));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(0));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(0));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(20));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 14) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Łucznicy, dzięki przewadze zasięgowej, są doskonali w obronie. Lepiej nie zostawiać ich w pierwszej linii.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(235));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(1));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(30));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(30));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(0));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(10));
        } else if (WybranyBudynek.Numery.getWybranyBudynek() == 15) {
            ustawTekst = findViewById(R.id.tooltipBudynku);
            ustawTekst.setText("Ciężka kawaleria nie bierze jeńcow. Dzięki cięzkiej zbroi są niemalże nieśmiertelni na polu walki, choć sami sieją chaos w szeregach wroga.");

            ustawTekst = findViewById(R.id.cenaZloto);
            ustawTekst.setText(Long.toString(345));

            ustawTekst = findViewById(R.id.cenaMieszkancy);
            ustawTekst.setText(Long.toString(2));

            ustawTekst = findViewById(R.id.cenaJedzenie);
            ustawTekst.setText(Long.toString(50));

            ustawTekst = findViewById(R.id.cenaDrewno);
            ustawTekst.setText(Long.toString(0));

            ustawTekst = findViewById(R.id.cenaKamien);
            ustawTekst.setText(Long.toString(0));

            ustawTekst = findViewById(R.id.cenaZelazo);
            ustawTekst.setText(Long.toString(50));
        }

    }

    public void powrotDoMenuMieszkalnychGospodarczych(View view) {
        if (WybranyBudynek.Numery.getWybranyBudynek() <= 4) { // to, czy wraca do menu budowy mieszkalnych czy gospodarczych,
            // zalezy od numerka przypisanego do każdego budynku (mieszkalne maja 1-4, gospodarcze 5-7, wosjkowe 8-12, żołnierze 13-15.
            Intent intencjaPowrotuDoMenuMieszkalnych = new Intent(this, menuBudowyMieszkalne.class);
            startActivity(intencjaPowrotuDoMenuMieszkalnych);
            finish();
        } else if (WybranyBudynek.Numery.getWybranyBudynek() > 4 && WybranyBudynek.Numery.getWybranyBudynek() <= 7) {
            Intent intencjaPowrotuDoMenuMieszkalnych = new Intent(this, menuBudowyGospodarcze.class);
            startActivity(intencjaPowrotuDoMenuMieszkalnych);
            finish();
        } else {
            Intent intencjaPowrotuDoMenuTreningu = new Intent(this, menuTreninguActivity.class);
            startActivity(intencjaPowrotuDoMenuTreningu);
            finish();
        }
    }

    public void zbuduj(View view) {
        Intent intencjaZbudowalesLubBlad = new Intent(this, BladLubZbudowales.class);


        EditText iloscZbudowanychTekst = findViewById(R.id.editTextIleBudynkow);
        String iloscZbudowanychString = iloscZbudowanychTekst.getText().toString();
        int iloscZbudowanychLiczba = 0;




            iloscZbudowanychLiczba = 0;

//            try {                                                                // sprawdza czy wypierdoli error, jesli tak to zakonczy akcje i nie przypisze jej ostatecznie.
//                iloscZbudowanychLiczba = Integer.parseInt(iloscZbudowanychString); // nie dziala
//            } catch (IllegalStateException illegalnyStejtEksepszyn) {
//                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 3);
//                startActivity(intencjaZbudowalesLubBlad);
//                finish();
//            }
        if(iloscZbudowanychString.equals("")){

        } else {
            iloscZbudowanychLiczba = Integer.parseInt(iloscZbudowanychString); // jesli pomyslnie przeszlo try catcha to przypisze ta zmienna i bedzie dzialac dobrze


            if (iloscZbudowanychLiczba <= 0) { // sprawdza czy wpisana liczba to nie 0
                WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 3);  // ustawia zmienna na wartosc ktora mowi ze musisz wpisać liczbę dodatnią
                startActivity(intencjaZbudowalesLubBlad);
                finish();
            } else {


                if (WybranyBudynek.Numery.getWybranyBudynek() == 1) {  // budowanie chaty
                    if (Gracze.playerHuman.getZloto() >= Budowle.chaty.getZloto() * iloscZbudowanychLiczba && Gracze.playerHuman.getMieszkancy() >= Budowle.chaty.getMieszkancy() * iloscZbudowanychLiczba && Gracze.playerHuman.getJedzenie() >= Budowle.chaty.getJedzenie() * iloscZbudowanychLiczba && Gracze.playerHuman.getDrewno() >= Budowle.chaty.getDrewno() * iloscZbudowanychLiczba && Gracze.playerHuman.getKamien() >= Budowle.chaty.getKamien() * iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= Budowle.chaty.getZelazo() * iloscZbudowanychLiczba) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.chaty.getZloto() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.chaty.getMieszkancy() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.chaty.getJedzenie() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.chaty.getDrewno() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.chaty.getKamien() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.chaty.getZelazo() * iloscZbudowanychLiczba);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1); // ustawia zmienna na wartosc ktora mowi ze budynek zostal zbudowany
                        Gracze.playerHuman.setIloscChat(Gracze.playerHuman.getIloscChat() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();

                    } else if (iloscZbudowanychLiczba <= 0) {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 3);  // ustawia zmienna na wartosc ktora mowi ze musisz wpisać liczbę dodatnią

                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);  // ustawia zmienna na wartosc ktora mowi ze nie masz surowcow na kupno budynkow
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }


                } else if (WybranyBudynek.Numery.getWybranyBudynek() == 2) {  // budowanie folwarku
                    if (Gracze.playerHuman.getZloto() >= Budowle.folwark.getZloto() * iloscZbudowanychLiczba && Gracze.playerHuman.getMieszkancy() >= Budowle.folwark.getMieszkancy() * iloscZbudowanychLiczba && Gracze.playerHuman.getJedzenie() >= Budowle.folwark.getJedzenie() * iloscZbudowanychLiczba && Gracze.playerHuman.getDrewno() >= Budowle.folwark.getDrewno() * iloscZbudowanychLiczba && Gracze.playerHuman.getKamien() >= Budowle.folwark.getKamien() * iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= Budowle.folwark.getZelazo() * iloscZbudowanychLiczba) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.folwark.getZloto() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.folwark.getMieszkancy() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.folwark.getJedzenie() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.folwark.getDrewno() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.folwark.getKamien() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.folwark.getZelazo() * iloscZbudowanychLiczba);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1);
                        Gracze.playerHuman.setIloscFolwarkow(Gracze.playerHuman.getIloscFolwarkow() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }


                } else if (WybranyBudynek.Numery.getWybranyBudynek() == 3) {
                    if (Gracze.playerHuman.getZloto() >= Budowle.dwor.getZloto() * iloscZbudowanychLiczba && Gracze.playerHuman.getMieszkancy() >= Budowle.dwor.getMieszkancy() * iloscZbudowanychLiczba && Gracze.playerHuman.getJedzenie() >= Budowle.dwor.getJedzenie() * iloscZbudowanychLiczba && Gracze.playerHuman.getDrewno() >= Budowle.dwor.getDrewno() * iloscZbudowanychLiczba && Gracze.playerHuman.getKamien() >= Budowle.dwor.getKamien() * iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= Budowle.dwor.getZelazo() * iloscZbudowanychLiczba) {

                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.dwor.getZloto() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.dwor.getMieszkancy() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.dwor.getJedzenie() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.dwor.getDrewno() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.dwor.getKamien() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.dwor.getZelazo() * iloscZbudowanychLiczba);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1);
                        Gracze.playerHuman.setIloscDworow(Gracze.playerHuman.getIloscDworow() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }
                } else if (WybranyBudynek.Numery.getWybranyBudynek() == 4) {
                    if (Gracze.playerHuman.getZloto() >= Budowle.palac.getZloto() * iloscZbudowanychLiczba && Gracze.playerHuman.getMieszkancy() >= Budowle.palac.getMieszkancy() * iloscZbudowanychLiczba && Gracze.playerHuman.getJedzenie() >= Budowle.palac.getJedzenie() * iloscZbudowanychLiczba && Gracze.playerHuman.getDrewno() >= Budowle.palac.getDrewno() * iloscZbudowanychLiczba && Gracze.playerHuman.getKamien() >= Budowle.palac.getKamien() * iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= Budowle.palac.getZelazo() * iloscZbudowanychLiczba) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.palac.getZloto() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.palac.getMieszkancy() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.palac.getJedzenie() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.palac.getDrewno() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.palac.getKamien() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.palac.getZelazo() * iloscZbudowanychLiczba);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1);
                        Gracze.playerHuman.setIloscPalacow(Gracze.playerHuman.getIloscPalacow() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }
                } else if (WybranyBudynek.Numery.getWybranyBudynek() == 5) {  // budowanie tartaku
                    if (Gracze.playerHuman.getZloto() >= Budowle.tartak.getZloto() * iloscZbudowanychLiczba && Gracze.playerHuman.getMieszkancy() >= Budowle.tartak.getMieszkancy() * iloscZbudowanychLiczba && Gracze.playerHuman.getJedzenie() >= Budowle.tartak.getJedzenie() * iloscZbudowanychLiczba && Gracze.playerHuman.getDrewno() >= Budowle.tartak.getDrewno() * iloscZbudowanychLiczba && Gracze.playerHuman.getKamien() >= Budowle.tartak.getKamien() * iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= Budowle.tartak.getZelazo() * iloscZbudowanychLiczba) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.tartak.getZloto() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.tartak.getMieszkancy() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.tartak.getJedzenie() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.tartak.getDrewno() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.tartak.getKamien() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.tartak.getZelazo() * iloscZbudowanychLiczba);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1); // ustawia zmienna na wartosc ktora mowi ze budynek zostal zbudowany (nie wywali bledu)
                        Gracze.playerHuman.setIloscTartakow(Gracze.playerHuman.getIloscTartakow() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);  // ustawia zmienna na wartosc ktora mowi ze nie masz surowcow na kupno budynkow
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }
                } else if (WybranyBudynek.Numery.getWybranyBudynek() == 6) {  // budowanie kopalni
                    if (Gracze.playerHuman.getZloto() >= Budowle.kopalnia.getZloto() * iloscZbudowanychLiczba && Gracze.playerHuman.getMieszkancy() >= Budowle.kopalnia.getMieszkancy() * iloscZbudowanychLiczba && Gracze.playerHuman.getJedzenie() >= Budowle.kopalnia.getJedzenie() * iloscZbudowanychLiczba && Gracze.playerHuman.getDrewno() >= Budowle.kopalnia.getDrewno() * iloscZbudowanychLiczba && Gracze.playerHuman.getKamien() >= Budowle.kopalnia.getKamien() * iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= Budowle.kopalnia.getZelazo() * iloscZbudowanychLiczba) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.kopalnia.getZloto() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.kopalnia.getMieszkancy() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.kopalnia.getJedzenie() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.kopalnia.getDrewno() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.kopalnia.getKamien() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.kopalnia.getZelazo() * iloscZbudowanychLiczba);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1);
                        Gracze.playerHuman.setIloscKopalni(Gracze.playerHuman.getIloscKopalni() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }


                }
                if (WybranyBudynek.Numery.getWybranyBudynek() == 7) {  // budowanie huty
                    if (Gracze.playerHuman.getZloto() >= Budowle.huta.getZloto() * iloscZbudowanychLiczba && Gracze.playerHuman.getMieszkancy() >= Budowle.huta.getMieszkancy() * iloscZbudowanychLiczba && Gracze.playerHuman.getJedzenie() >= Budowle.huta.getJedzenie() * iloscZbudowanychLiczba && Gracze.playerHuman.getDrewno() >= Budowle.huta.getDrewno() * iloscZbudowanychLiczba && Gracze.playerHuman.getKamien() >= Budowle.huta.getKamien() * iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= Budowle.huta.getZelazo() * iloscZbudowanychLiczba) {

                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - Budowle.huta.getZloto() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - Budowle.huta.getMieszkancy() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - Budowle.huta.getJedzenie() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - Budowle.huta.getDrewno() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setKamien(Gracze.playerHuman.getKamien() - Budowle.huta.getKamien() * iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - Budowle.huta.getZelazo() * iloscZbudowanychLiczba);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 1);
                        Gracze.playerHuman.setIloscHut(Gracze.playerHuman.getIloscHut() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 2);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }
                }
                if (WybranyBudynek.Numery.getWybranyBudynek() == 13) {  // zolnierze to nie obiekt, hardcoded wartosci // SZKOLENIE PIECHOTY
                    if (Gracze.playerHuman.getZloto() >= iloscZbudowanychLiczba * 165 && Gracze.playerHuman.getMieszkancy() >= iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= iloscZbudowanychLiczba * 20 && Gracze.playerHuman.getJedzenie() >= iloscZbudowanychLiczba * 30) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - iloscZbudowanychLiczba * 165);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - iloscZbudowanychLiczba * 20);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - iloscZbudowanychLiczba * 30);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 4); // 4 znaczy ze wyszkoliles, 5 znaczy ze nie stac cie na szkolenie.
                        Gracze.playerHuman.setIloscPiechoty(Gracze.playerHuman.getIloscPiechoty() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 5); // 4 znaczy ze wyszkoliles, 5 znaczy ze nie stac cie na szkolenie.
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }
                }
                if (WybranyBudynek.Numery.getWybranyBudynek() == 14) {  // zolnierze to nie obiekt, hardcoded wartosci // SZKOLENIE lucznikow
                    if (Gracze.playerHuman.getZloto() >= iloscZbudowanychLiczba * 235 && Gracze.playerHuman.getMieszkancy() >= iloscZbudowanychLiczba && Gracze.playerHuman.getZelazo() >= iloscZbudowanychLiczba * 10 && Gracze.playerHuman.getJedzenie() >= iloscZbudowanychLiczba * 30 && Gracze.playerHuman.getDrewno() >= iloscZbudowanychLiczba * 30) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - iloscZbudowanychLiczba * 235);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - iloscZbudowanychLiczba);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - iloscZbudowanychLiczba * 10);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - iloscZbudowanychLiczba * 30);
                        Gracze.playerHuman.setDrewno(Gracze.playerHuman.getDrewno() - iloscZbudowanychLiczba * 30);
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 4); // 4 znaczy ze wyszkoliles, 5 znaczy ze nie stac cie na szkolenie.
                        Gracze.playerHuman.setIloscLucznikow(Gracze.playerHuman.getIloscLucznikow() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 5); // 4 znaczy ze wyszkoliles, 5 znaczy ze nie stac cie na szkolenie.
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }
                }
                if (WybranyBudynek.Numery.getWybranyBudynek() == 15) {  // zolnierze to nie obiekt, hardcoded wartosci // SZKOLENIE kawalerii
                    if (Gracze.playerHuman.getZloto() >= iloscZbudowanychLiczba * 345 && Gracze.playerHuman.getMieszkancy() >= iloscZbudowanychLiczba * 2 && Gracze.playerHuman.getZelazo() >= iloscZbudowanychLiczba * 50 && Gracze.playerHuman.getJedzenie() >= iloscZbudowanychLiczba * 50) {
                        Gracze.playerHuman.setZloto(Gracze.playerHuman.getZloto() - iloscZbudowanychLiczba * 345);
                        Gracze.playerHuman.setMieszkancy(Gracze.playerHuman.getMieszkancy() - iloscZbudowanychLiczba * 2);
                        Gracze.playerHuman.setZelazo(Gracze.playerHuman.getZelazo() - iloscZbudowanychLiczba * 50);
                        Gracze.playerHuman.setJedzenie(Gracze.playerHuman.getJedzenie() - iloscZbudowanychLiczba * 50);

                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 4); // 4 znaczy ze wyszkoliles, 5 znaczy ze nie stac cie na szkolenie.
                        Gracze.playerHuman.setIloscKawalerii(Gracze.playerHuman.getIloscKawalerii() + iloscZbudowanychLiczba);
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    } else {
                        WybranyBudynek.Numery.setZbudowaneCzyNie((byte) 5); // 4 znaczy ze wyszkoliles, 5 znaczy ze nie stac cie na szkolenie.
                        startActivity(intencjaZbudowalesLubBlad);
                        finish();
                    }
                }


                finish();


            }

    }
}}