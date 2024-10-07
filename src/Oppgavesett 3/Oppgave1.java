/**
 * Oppgave1
 * Vi skal i denne oppgaven lage en funksjon som tar inn to tall fra brukeren,
 * og leverer ut gangetabellen til og med 10 i en tabell mellom og med de to tallene.
 */
import java.util.Scanner; // Importerer scanner klassen

public class Oppgave1 {
   /* static int gangetabell(){
    }
    */  
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // Tar inn input fra bruker
       try{
            System.out.println("Start: ");

            //Oppretter input fra brukeren som en variabel
            
            int start = scanner.nextInt();

            System.out.println("Slutt: ");
            int slutt = scanner.nextInt();

                for (int i = start; i <= slutt; i++){
                    System.out.println(i + "-gangen:"); // Lager en for løkke som gir ut tabellen mellom og med de to input tallene

                    for (int j = 1; j <= 10; j++){ // lager en ny for løkke for multiplikasjon mellom 1-10 og printer ut resultat.
                    System.out.println(i + " x " + j  + " = " + i * j);
                    }   
                }
        } catch (Exception e) {
                // Fanger  opp unntak og printer ut feilmelding
                System.out.println("Noe gikk feil!" + " Vennligst tast inn et heltall i 'Start' og i 'Slutt' i rekkefølgen, lav - høy.");
        }
        scanner.close();
    }
}