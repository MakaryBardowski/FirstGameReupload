package com.example.naukalayouteditor;

import android.content.Intent;

import java.util.Random;
import com.example.naukalayouteditor.menuAtaku.menuAtaku;

public class WydarzeniaSprawdzanie {
    private static double dolnaGranicaTargowisko = 0.45;
    private static double gornaGranicaTargowisko = 0.6;
    private static Random losowy = new Random();
    public static int losowyNumerWydarzenia;

    static double surowceZaZloto = 0.075; // dostaniesz 0.075 surowca za 1 zlota
    static double zlotoZaSurowce = 10;  // dostaniesz 10 zlota za 1 surowiec
    static double surowceZaSurowce = 0.5; // dostaniesz 0.5 surowca za 1 inny surowiec

    public static void WydarzeniaSprawdzanie() {


        losowyNumerWydarzenia = losowy.nextInt(19); // 19 to granica, wiec losuje od 0 - 18

        if (menuGlowneActivity.rok != 1331) {
            Wydarzenia.zlotoNaRok = Gracze.playerHuman.getMieszkancy() * 2; // surowce na rok
            Wydarzenia.mieszkancyNaRok = Gracze.playerHuman.getJedzenie() * 0.18;
            Wydarzenia.jedzienieNaRok = Gracze.playerHuman.getIloscChat() * 3 + Gracze.playerHuman.getIloscFolwarkow() * 7 + Gracze.playerHuman.getIloscDworow() * 20 + Gracze.playerHuman.getIloscPalacow() * 75;

            if (losowyNumerWydarzenia == 3 || losowyNumerWydarzenia == 4) {


                Wydarzenia.susza();


                surowceZaSurowce = Math.round(dolnaGranicaTargowisko + (gornaGranicaTargowisko - dolnaGranicaTargowisko) * losowy.nextDouble()); // znalezione w internecie - ma dawac losowy double z przedzialu.


            } else if (losowyNumerWydarzenia == 6 || losowyNumerWydarzenia == 7) {

                Wydarzenia.zaraza();

                surowceZaSurowce = Math.round(dolnaGranicaTargowisko + (gornaGranicaTargowisko - dolnaGranicaTargowisko) * losowy.nextDouble()); // znalezione w internecie - ma dawac losowy double z przedzialu.



            } else if (losowyNumerWydarzenia == 9 || losowyNumerWydarzenia == 10) {

                Wydarzenia.urodzaj();

                surowceZaSurowce = Math.round(dolnaGranicaTargowisko + (gornaGranicaTargowisko - dolnaGranicaTargowisko) * losowy.nextDouble()); // znalezione w internecie - ma dawac losowy double z przedzialu.



            }    else {
                Wydarzenia.normalnyRok();

                surowceZaSurowce = Math.round(dolnaGranicaTargowisko + (gornaGranicaTargowisko - dolnaGranicaTargowisko) * losowy.nextDouble()); // znalezione w internecie - ma dawac losowy double z przedzialu.

            }
            }

        }


    }



