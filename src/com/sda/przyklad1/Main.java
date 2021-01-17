package com.sda.przyklad1;

public class Main {
    public static void main(String[] args) {


        Tygrys tygrys = new Tygrys();
        tygrys.wyswietl();
        tygrys.setIloscLap(3);
        tygrys.wyswietl();
        tygrys = new Tygrys();
        tygrys.setIloscLap(5);
        Zwierze zwierze = new Tygrys();
        Zwierze zwierze1 = new Zwierze(2);
        if (zwierze1 instanceof Tygrys)

        System.out.println();
        Tygrys tygrys1 = (Tygrys) zwierze;
        tygrys1.wyswietl();



    }
}
