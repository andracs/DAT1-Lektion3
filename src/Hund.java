package dk.n4;

public class Hund { //Laver klassen Hund

    int alder = -1; //Deklarerer og initialiserer variablen "alder" med datatypen integer. Default-værdi er sat til -1 (ufødt hund)
    String navn = "Unavngiven hund"; //Deklarerer og initialiserer variablen "navn" med klassen String. Hvis navn ikke angives senere bliver hunden unavngiven som default.
    int siblings = 0; //Deklarerer og initialiserer variablen "siblings" med datatypen integer. Default sat til 0.
    String temp = ""; //Deklarerer og initialiserer variblen "temp", angivet som String.
    Race race; //Deklarerer klassen Race;

    Hund() { //Constructor uden argumenter
    }

    Hund(int hundensAlder, String hundensNavn) { //Constructor med argument om hundensNavn
        alder = hundensAlder; //Fortæller at hundensAlder refererer til den deklarerede/initialiserede varibale alder
        navn = hundensNavn; //Fortæller at hundensNavn refererer til den deklarerede/initialiserede variable navn
        System.out.println("En ny hund med navnet " + navn + " og alderen " + alder + " er avlet."); //Printer beskeden om, at en ny hund er avlet
        System.out.println(navn + " er af racen " + race + ".");
    }

    public void setAntalSoeskende(int antalSoeskende) { //Setter hundens antal af søskende. Skal indeholde variablen "antalSoeskende"
        siblings = antalSoeskende; //Fortæller at antalSoeskende refererer til vores variable siblings
        System.out.println(navn + " har fået registreret antal søskende."); //Printer beskeden om, at hunden med "navn" nu har fået registreret søskende
    }

    public void getAntalSoeskende() { //Getter hundens antal af søskende.
        System.out.println(navn + " har " + siblings + " søskende registreret."); //Printer beskeden om, hvor mange søskende hunden har
    }

    public void setTemperament(String temperament) { //Setter beskrivelse af temperament. Skal indeholde klassen String temperament
        temp = temperament; //Fortæller at temperament refererer til vores variable temp
        System.out.println(navn + "s temperament er oprettet."); //Printer beskeden om, at hunden med "navn" nu har fået registreret temperament
    }

    public void getTemperament() { //Getter hundens temperament.
        System.out.println(navn + "s temperament kan beskrives: " + temp + "."); //Printer besked om hundens temperament baseret på variablen temp
    }


/*

    public setRace(enum r) { //Setter beskrivelse af temperament. Skal indeholde klassen String temperament
        race = r; //Fortæller at temperament refererer til vores variable temp
        System.out.println(navn + "s race er oprettet."); //Printer beskeden om, at hunden med "navn" nu har fået registreret race
    }

    public void getRace() { //Getter hundens race.
        System.out.println(navn + "s race er " + race + "."); //Printer besked om hundens race
    }

*/

}

