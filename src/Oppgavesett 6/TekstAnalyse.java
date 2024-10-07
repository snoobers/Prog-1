import java.util.Scanner;
import java.util.Arrays;


public class TekstAnalyse {
    
    private int[] antallTegn = new int[30];
    private String[] bokstaver = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};

    private TekstAnalyse(String tekst){

        //Finner lengden og gjør teksten til små bokstaver
        int lengde = tekst.length(); 
        tekst = tekst.toLowerCase();

        //Lager en for løkke for alle tegn i teksten vi har
        for (int i = 0; i < lengde; i ++){

            //Finner bokstaven vi har i hvert tegn og legger til +1 i listen til riktig indeks
            char karakter = tekst.charAt(i);
            String bokstav = Character.toString(karakter);
            int indeks = Arrays.asList(bokstaver).indexOf(bokstav);

            //Dersom det ikke er en bokstav vil indeks = -1. Legger til +1 til indeks 29
            if (indeks == -1){
                antallTegn[29] ++;
            } else { antallTegn[indeks] ++;
            }
        }
    }


    private void forskjelligeBokstaver(){ // Metode for å finne antall forskjellige bokstaver i teksten
        int teller = 0;
        for (int i = 0; i < 30; i ++){
            if (antallTegn[i] != 0){
                teller ++;
            }
        }
        System.out.println("Det er: " + teller + " forskjellige bokstaver i teksten.");
    }

    private void antallBokstaver(){ //Metode for å finne totalt antall bokstaver i teksten
        int summenBokstaver = 0;

            for (int i = 0; i < 30; i ++){
                summenBokstaver += antallTegn[i];
            }
        System.out.println("Det er: " + summenBokstaver + " bokstaver i teksten som er skrevet.");
    } 

    private void prosentTegn(){ //Metode for å finne andel prosten av bokstaver i teksten
        int sumTabell = 0;
        int summenTegn = antallTegn[29];

        for (int i = 0; i < 30; i ++){
            sumTabell += antallTegn[i];
        }

        //Finner prosenten av tegn
        int prosentTegn = summenTegn * 100 / sumTabell;
        System.out.println(prosentTegn + "% er ikke bokstaver i teksten.");
    }

    private void hvorMangeAv(String bokstav){
        int indeks = Arrays.asList(bokstaver).indexOf(bokstav);
        System.out.println("Det finnes: " + antallTegn[indeks] + " av bokstaven " + bokstav);
    }

    private void forekommerMest(){
        int max = 0;

        for (int i = 0; i < 29; i ++){
            if (max < antallTegn[i]){
                max = antallTegn[i];
            }
        }
        for (int i = 0; i < 29; i ++){
            if (max == antallTegn[i]){
                System.out.println("Det finnes: " + antallTegn[i] + " av bokstaven(e): " + bokstaver[i]);
            }
        }
    }

    public static void main(String[] args) {
    

        //Oppretter et scanner objekt
        Scanner scanner = new Scanner(System.in);
        

        //Tar inn input fra bruker
        System.out.println("Skriv inn tekst som skal analyseres: ");
        String tekst = scanner.nextLine();
        TekstAnalyse tekstObjekt = new TekstAnalyse(tekst);

        tekstObjekt.forekommerMest();
        tekstObjekt.hvorMangeAv("j");
        tekstObjekt.prosentTegn();
        tekstObjekt.antallBokstaver();
        tekstObjekt.forskjelligeBokstaver();

        scanner.close();
    }
}
