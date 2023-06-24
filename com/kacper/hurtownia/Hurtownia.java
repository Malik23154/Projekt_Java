package com.kacper.hurtownia;

import com.kacper.sklep.Sklep;

import java.util.ArrayList;

/**
 * klasa hurtownia, która może sprowadzać towary od producenta oraz je sprzedawać
 */
public class Hurtownia {
    String nazwa;
    ArrayList<String> towary;
    ArrayList<Integer> cenyTowarow;
    ArrayList<Integer> iloscTowarow;
    int stanKonta;

    public int getStanKonta() {
        return stanKonta;
    }

    public ArrayList<Integer> getIloscTowarow() {
        return iloscTowarow;
    }

    public Hurtownia(String nazwa, int stanKonta) {
        this.nazwa = nazwa;
        this.towary = new ArrayList<>();
        this.stanKonta = stanKonta;
        this.cenyTowarow = new ArrayList<>();
        this.iloscTowarow = new ArrayList<>();
    }

    /**
     * metoda sprawdzająca stan magazynu
     */
    public void magazyn(){
        System.out.println("Towary: " + this.towary);
        System.out.println("Ceny towarów: " + this.cenyTowarow);
        System.out.println("Ilość towarów: " + this.iloscTowarow);
    }

    /**
     * metoda dodająca towary "sprowadzając je od producenta"
     */
    public void sprowadzTowarOdProducenta(String towar, int cenaTowaru, int ilosc){
        this.towary.add(towar);
        this.cenyTowarow.add(cenaTowaru);
        this.iloscTowarow.add(ilosc);
    }

    /**
     * metoda usuwająca towary po nazwie
     */
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

    /**
     * metoda sprzedająca towary dla sklepu
     */
    public int sprzedajTowar(String towar, int ilosc){
        for(int i = 0; i < this.towary.size(); i++)
        {
            if (this.towary.get(i).equals(towar))
            {
                int obecnyStan = this.getIloscTowarow().get(i);
                this.iloscTowarow.set(i, obecnyStan - ilosc);
                this.stanKonta += (ilosc * cenyTowarow.get(i));
                return ilosc * cenyTowarow.get(i);
            }
        }
        return 0;
    }

}

