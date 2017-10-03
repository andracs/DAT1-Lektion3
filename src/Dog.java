package com.company;

public class Dog {

   public int Alder, AntalBen;
   String farve;

   Dog (String hundensFarve) {
       farve = hundensFarve;
       System.out.println("hundens farve er " + farve);

   }
    Dog (int hundensAlder){
        Alder = hundensAlder;
        System.out.println("hundens alder er " + Alder);

    }

    public void setAntalBen(int antalBen) {
        AntalBen = antalBen;
    }

    public int getAntalBen() {
        return AntalBen;
    }
}
