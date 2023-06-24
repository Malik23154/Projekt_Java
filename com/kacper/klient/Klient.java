package com.kacper.klient;

import com.kacper.sklep.Sklep;

public class Klient {
    String imie;
    String nazwisko;
    int gruboscPortfela;
    public Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.gruboscPortfela = 1500;
    }

    public int getGruboscPortfela() {
        return gruboscPortfela;
    }

    public int pracuj(){
        System.out.println("Pracujesz...");
        this.gruboscPortfela += 300;
        return this.gruboscPortfela;
    }
    public void kupTowary(Sklep sklep, String towar, int ilosc){
        this.gruboscPortfela -= sklep.sprzedajTowar(towar, ilosc);
        System.out.println("Stan twojego konta to: "+ getGruboscPortfela());

    }
}
