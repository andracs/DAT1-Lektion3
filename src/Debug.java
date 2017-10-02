import sun.jvm.hotspot.HelloWorld;

public class Debug {

    private int a = 45;

    private double b = 3.0;

    private long c = 2;

    private char d = 'a';

    private boolean e = false;

    private String f = "Husmandskost";


    public static void main(String[] args) {

        Kat k = new Kat("Else");
        k.setAlder(12);
        k.hvorGammel();

        System.out.println("Finito");

        System.out.println(k.toString());
        
        k = new Kat("Kurt");

        k.hvorGammel();

        System.out.println(k.toString());
    }

}
