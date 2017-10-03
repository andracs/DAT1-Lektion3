package dk.n4;

public class TestHund {

    public static void main(String[] args) {

        System.out.println("Velkommen til Hundeinternatet!");

        Hund hund1 = new Hund(3,"Fido"); //Opretter nyt objekt (hund) med navnet hund1 og alder og navn angivet
        hund1.setAntalSoeskende(4); //Setter hundens antal søskende baseret på indtastning
        hund1.getAntalSoeskende(); //Getter hundens antal søskende
        hund1.setTemperament("Rolig af sind"); //Setter hundens temperament baseret på indtastning i String
        hund1.getTemperament(); //Henter beskrivelse af temperament

        Hund hund2 = new Hund(1,"Douglas"); //Opretter nyt objekt (hund) med navnet hund2 og alder og navn angivet
        hund2.setAntalSoeskende(2); //Setter hundens antal søskende baseret på indtastning
        hund2.getAntalSoeskende(); //Getter hundens antal søskende
        hund2.setTemperament("Aggressiv! Bider meget"); //Setter hundens temperament baseret på indtastning i String
        hund2.getTemperament(); //Henter beskrivelse af temperament

    }
}
