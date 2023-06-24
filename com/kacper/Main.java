package com.kacper;
import com.kacper.hurtownia.Hurtownia;
import com.kacper.klient.Klient;
import com.kacper.sklep.Sklep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var hurtownia = new Hurtownia("Budimex", 100000);
        var sklep = new Sklep("U Marcina", 1000);
        var klient = new Klient("Jarosław", "Kaczyński");
        hurtownia.sprowadzTowarOdProducenta("Kostka brukowa", 10, 100000);
        hurtownia.magazyn();
        sklep.kupOdHurtowni(hurtownia, "Kostka brukowa", 15, 500);
        hurtownia.magazyn();
        sklep.magazyn();
        hurtownia.usunTowar("Kostka brukowa");
        hurtownia.magazyn();
        System.out.println(klient.pracuj());
        klient.kupTowary(sklep, "Kostka brukowa", 50);
        System.out.println(klient.getGruboscPortfela());
    }
}
