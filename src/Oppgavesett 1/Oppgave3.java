//I denne oppgaven skal vi gjøre om input av sekunder til timer og minutter.
import java.util.Scanner; //Importerer Scanner klassen først

public class Oppgave3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Oppretter en Scanner

        System.out.println("Skriv inn antall sekunder for omgjøring til timer og minutter: ");

        //Oppretter inputtet fra user som en variabel
        int sekunder = scanner.nextInt();

        // Informerer om antall timer, min og sekunder som er satt inn, uavhengig av hverandre

        int timer = sekunder / 60 / 60;
        int min = sekunder / 60;
        System.out.println("Dette er da " + timer + " timer, " +  min + " minutter og " + sekunder + " sekunder.");
        
        //Timer sin variabel er lik
        min = (sekunder - timer *  60 * 60) / 60; //Definerer minuttene i rest fra timene
        int sekunderRest = sekunder - timer * 60 * 60 - min * 60; //Gjenstående sekunder

        //Printer ut omgjøringen til timer og minutter
        
        System.out.println("Ved omgjøring fra sekunder, får vi " + timer + " timer, " + min + " minutter og " + sekunderRest + " sekunder.");
        
        scanner.close();
    }
}
