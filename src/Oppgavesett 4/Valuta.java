import java.util.Scanner;
 
/* 
Oppgave1
*/
public class Valuta {
    private double kurs;
    
        public Valuta(double kurs)
        {
            this.kurs = kurs;
        }
        public double getKurs()
        {
            return this.kurs;
        }
    static double nokTilKurs(double nok, double kurs)
    {
        return nok / kurs ;

    }
    static double kursTilNok(double nok, double kurs)
    {
        return  kurs * nok;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Oppretter  en scanner for å lese inn verdier fra brukeren

        //Valuta myObj =  new Valuta(); //Oppretter en  ny objektskopi og legger inn kurs verdien av euro først

        System.out.println("Velg valuta: ");
        System.out.println("1: Euro");
        System.out.println("2: Dollar");
        System.out.println("3: Svenske kroner");
        System.out.println("4: Avslutt");

        int tall = sc.nextInt();

        switch (tall) {
            case 1:
            Valuta euro = new Valuta(11.78);
            System.out.println("1: Omgjøring Euro  til NOK");
            System.out.println("2: Omgjøring NOK til Euro");
            int valg = sc.nextInt();
            
            if  (valg == 1)
            {
                System.out.println("Skriv inn antall Euro: ");
                double Euro = sc.nextDouble();
                double nok = kursTilNok(Euro, euro.getKurs());
                System.out.println(Euro + "Euro  er likt " + nok + "NOK");
            }
            else if (valg == 2)
            {
                System.out.println("Skriv inn antall NOK: ");
                double nok = sc.nextDouble();
                double Euro = nokTilKurs(nok, euro.getKurs());
                System.out.println(nok + "NOK  er likt " + Euro + "Euro");
            }
                break;
            case 2:

            System.out.println("1: Omgjøring Dollar  til NOK");
            System.out.println("2: Omgjøring NOK til Dollar");
            int svar =  sc.nextInt();
            Valuta dollar = new Valuta(10.6);
            if  (svar == 1)
            {
                System.out.println("Skriv inn antall Dollar: ");
                double Dollar = sc.nextDouble();
                double nok = kursTilNok(Dollar, dollar.getKurs());
                System.out.println(Dollar + "dollar  er likt " + nok + "NOK");
            }
            else if (svar == 2)
            {
                System.out.println("Skriv inn antall NOK: ");
                double nok = sc.nextDouble();
                double Dollar = nokTilKurs(nok, dollar.getKurs());
                System.out.println(nok + "NOK  er likt " + Dollar + "dollar");
            }
                break;
            case 3:
            System.out.println("1: Omgjøring SEK  til NOK");
            System.out.println("2: Omgjøring NOK til SEK");
            int valg2 =  sc.nextInt();
            Valuta sek = new Valuta(1.03);
            if  (valg2 == 1)
            {
                System.out.println("Skriv inn antall SEK: ");
                double SEK = sc.nextDouble();
                double nok = kursTilNok(SEK, sek.getKurs());
                System.out.println(SEK + " SEK  er likt " + nok + "NOK");
            }
            else if (valg2 == 2)
            {
                System.out.println("Skriv inn antall NOK: ");
                double nok = sc.nextDouble();
                double SEK = nokTilKurs(nok, sek.getKurs());
                System.out.println(nok + "NOK  er likt " + SEK + " SEK");
            }
                break;
            case 4:
                System.out.println("Ha en fin dag!");
            default:
                break;
        }

    }
}