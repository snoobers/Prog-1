import java.util.Scanner; // Importerer scanner klassen

public class Oppgave2 {
    //I denne oppgaven skal vi finne ut om input fra brukeren er et primtall.

    static boolean isPrime(int n) 
    {
        //Passer på at den er større enn 1
        if  (n <= 1) 
            return false;
        
        // Deler med alle tall opp til sqrt(n)
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
        }

        public static void main(String[] args) {

        //Oppretter en scanner
        Scanner scanner = new Scanner(System.in); 

        //Lager en do/while loop for brukeren til å skrive inn tall
        boolean loop = true;

        //Legger inn en try statement
        try {
            do {
            //Tar inn input
            System.out.println("Skriv inn et tall for å sjekke om det er et primtall: ");
            int tall = scanner.nextInt();
            
                if (isPrime(tall)) 
                    System.out.println("Dette er et primtall!");
                else
                    System.out.println("Dette er ikke et primtall...");
                {
                //Sjekker om  brukeren vil fortsette
                    System.out.println("Vil du analysere et nytt tall? (Ja/Nei)");
                    String svar = scanner.next();

                    if (svar.equalsIgnoreCase("nei")) {
                        loop = false;
                    } else if (svar.equalsIgnoreCase("ja")) {
                        loop  = true;
                    }
                }
                    
            } while(loop);

        } catch (Exception e) {
            System.out.println("Du har skrevet inn noe som ikke er et heltall! Forsøk på nytt!");
        }
        scanner.close();
    }
}