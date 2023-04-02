import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Aufgabe 2
    public static boolean containsZeituberschreitung( String s) {
        String subString = "Zeitüberschreitung";
        return s.indexOf( subString ) > -1 ? true : false;
    }

    //Aufgabe 2
    public static boolean containsAntwortzeit( String s) {
        String subString = "Zeit=";
        return s.indexOf( subString ) > -1 ? true : false;
    }

    //Aufgabe 3
    public static boolean containsAntwort( String adresse ) {
        String s = Net.ping(adresse);
        String subString = "Antwort";
        return s.indexOf( subString ) > -1 ? true : false;
    }

    //Aufgabe 4
    public static int verfugbareNetze(){
        String ip = "194.94.2.";
        int anzahl = 0;

        ArrayList<String> antwortendeIP = new ArrayList<String>();

        for (int i = 1; i <= 128; i++) {
            String ende = String.valueOf(i);
            String kompletteIP = ip + ende;
            if (!containsAntwort(kompletteIP)) {
                anzahl++;
            } else {
                antwortendeIP.add(kompletteIP);
            }
        }

        //Ausgabe antwortenden Adressen (Aufgabe 5)
        System.out.println(antwortendeIP.toString());

        return anzahl;
    }

    public static void main(String[] args) {

        //Aufgabe 1
        String antwort1 = Net.ping("194.94.2.14");
        String antwort2 = Net.ping("194.94.2.20");

        System.out.println(antwort1);
        System.out.println(antwort2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die IP-Adresse ein: ");
        String ip = scanner.nextLine();
        String antwort =  Net.ping(ip);
        String zwischenspeicher = antwort;
        System.out.println(zwischenspeicher);
        System.out.println(verfugbareNetze());
    }
}

