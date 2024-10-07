import java.util.Scanner;

/**
 * Skuddaar
 * Aktivitetsdiagram:
 * 1 Start
 * 2 Leser tall fra brukeren
 * 3 Er taller delelig med 400? Hvis Ja = skuddår, hvis Nei = neste
 * 4 Er tallet delelig med 100? Hvis Ja = ikke skuddår, hvis Nei = neste
 * 5 Er tallet delelig med 4? Hvis Ja = skuddår, hvis Nei = ikke et skuddår
 * (Printer ut resultat etter hva som legges inn)
 * 6 Avslutter 
 */
public class Skuddaar {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Skriv inn et årstall: ");
    
        //Oppretter input fra bruker som en variabel
        int aarstall = scanner.nextInt();

        int skuddaar = aarstall % 4;

        if (aarstall % 400 == 0){
            System.out.println("Dette er et skuddår!");
        }else if (aarstall % 100 == 0){
            System.out.println("Dette er ikke et skuddår.");
        }else if (skuddaar == 0){
             System.out.println("Dette er et skuddår!");
        } else {
            System.out.println("Dette er ikke et skuddår.");
        }
        scanner.close();
    }
}