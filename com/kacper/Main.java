package com.kacper;
import com.kacper.hurtownia.Hurtownia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadź nazwę hurtowni: ");
        String nazwa = scan.next();
        System.out.print("Wprowadź stan konta hurtowni: ");
        int stanKonta = scan.nextInt();

        var hurtownia = new Hurtownia(nazwa, stanKonta);
        System.out.print("Podaj nazwę towaru, który chcesz dodać: ");
        String towar = scan.next();
        System.out.print("Podaj cenę towaru: ");
        int cena = scan.nextInt();
        System.out.print("Podaj ilość towaru: ");
        int ilosc = scan.nextInt();
        hurtownia.dodajTowar(towar, cena, ilosc);
        hurtownia.magazyn();
        System.out.print("Podaj towar, który chcesz kupić: ");
        String towar2 = scan.next();
        System.out.print("Podaj ilość towaru: ");
        int ilosc2 = scan.nextInt();
        hurtownia.sprzedajTowar(towar2, ilosc2);
        hurtownia.magazyn();

    }
}
