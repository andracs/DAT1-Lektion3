/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kat;

/**
 *
 * @author burhan
 */
public class Hund {
    private int alder=0;
    private String name = "";
    
    public Hund()
    {
        System.out.println("Ny hund)");
    }
    public Hund(int alder)
    {
        this.alder=alder;
        System.out.println("Ny hund er antal år"+alder);
    }
    public Hund(String name)
    {
       this.name=name;
        System.out.println("Ny hund navn"+name);
    }
    public String GetDogName()
    {
        return name;
    }
    public void SetDogName(String name)
    {
        this.name=name;
    }
    
    public void Spiser()
    {
        System.out.println("hunden spiser");
    }
    
            
    
}
