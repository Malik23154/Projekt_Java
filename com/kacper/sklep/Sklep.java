package com.kacper.sklep;

import com.kacper.hurtownia.Hurtownia;

import java.util.ArrayList;

public class Sklep {
    String nazwa;
    ArrayList<String> towary;
    ArrayList<Integer> cenyTowarow;
    ArrayList<Integer> iloscTowarow;
    int zawartoscKasy;
    public int getZawartoscKasy() {
        return zawartoscKasy;
    }

    public ArrayList<Integer> getIloscTowarow() {
        return iloscTowarow;
    }
    public Sklep(String nazwa, int zawartoscKasy) {
        this.nazwa = nazwa;
        this.towary = new ArrayList<>();
        this.zawartoscKasy = zawartoscKasy;
        this.cenyTowarow = new ArrayList<>();
        this.iloscTowarow = new ArrayList<>();
    }
    public void magazyn(){
        System.out.println("Towary: " + this.towary);
        System.out.println("Ceny towarów: " + this.cenyTowarow);
        System.out.println("Ilość towarów: " + this.iloscTowarow);
    }
    public void kupOdHurtowni(Hurtownia hurtownia, String towar, int cenaTowaru, int ilosc){
        this.towary.add(towar);
        this.cenyTowarow.add(cenaTowaru);
        this.iloscTowarow.add(ilosc);
        this.zawartoscKasy -= ilosc * cenaTowaru * 0.77;
        hurtownia.sprzedajTowar(towar, ilosc);
    }
    public void usunTowar(String towar){
        for(int i = 0; i < this.towary.size(); i++)
        {
            if (towary.get(i).equals(towar))
            {
                this.towary.remove(i);
                this.iloscTowarow.remove(i);
                this.cenyTowarow.remove(i);
                break;
            }
        }
    }
    public int sprzedajTowar(String towar, int ilosc){
        for(int i = 0; i < this.towary.size(); i++)
        {
            if (this.towary.get(i).equals(towar))
            {
                int obecnyStan = this.getIloscTowarow().get(i);
                this.iloscTowarow.set(i, obecnyStan - ilosc);
                this.zawartoscKasy += (ilosc * cenyTowarow.get(i));
                return ilosc * cenyTowarow.get(i);
            }
        }
        return 0;
    }
}
