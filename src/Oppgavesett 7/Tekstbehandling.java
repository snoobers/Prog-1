public class Tekstbehandling {
    
    String tekst;

    //Konstruktør som tar en tekst som parameter
    public Tekstbehandling(String tekst){
        this.tekst = tekst;
    }

    //Metodene vi skal ha i klassen
    //Finner antall ord i hele teksten
    public void antallOrd(){ 
        String[] ord = tekst.split(" ");
        System.out.println("Vi har " + ord.length + " antall ord i teksten.");
    }

    //Print
    public void getTekst(){ 
        System.out.println(tekst);
    }

    //Upper case outPrint
    public void upperCaseTekst(){ 
        tekst = tekst.toUpperCase();
        System.out.println(tekst);
    }

    //Bytter ut et ord i teksten med ønsket nytt ord
    public void bytteUt(String gammeltOrd, String nyttOrd){ 
        tekst = tekst.replace(gammeltOrd, nyttOrd);
        System.out.println(tekst);
    }

    //Finner gjennomsnittlig ordlengde
    public void gjennomsnittOrdLengde(){ 
        String[] ord = tekst.split(" ");

        int teller = 0; //Teller for å bruke til gjennomsnittet
        int ordListeSum = 0; //Summen av ordlisten til gjennomsnittet
        int[] liste = new int[ord.length]; //Oppretter en liste som skal lagre lengdene av hvert ord

        for (int i = 0; i < ord.length; i ++){
            if (ord[i].contains(".") || ord[i].contains(",") || ord[i].contains("!") || ord[i].contains("?") || ord[i].contains(":")){
                int ordLengde = ord[i].length() - 1;
                liste[i] = ordLengde;
            } else {
                int ordLengde = ord[i].length();
                liste[i] = ordLengde;
            }
            teller ++;
            ordListeSum += liste[i];
        }

        double gjennomsnitt = (double) ordListeSum / teller; //Beregner gjennomsnittet

        System.out.println("Den gjennomsnittlige lengden pr. ord er: " + gjennomsnitt + ".");
    }

    //Finner gjennomsnittet av ord mellom skilletegnene
    public void ordPrPeriode(){
        String[] perioder = tekst.split("[,.!?:]"); //Splitter ved skilletegnene

        int antallOrd = 0;

        for (String periode : perioder){ //Itererer over alle periodene
            String[] ord = periode.split(" "); //Lager en oversikt som skiller ved alle mellomrom
            
            antallOrd += ord.length; //Legger til antall ord (lengden av den nye oversikten) for hver gjennomgang
        }
        double gjennomsnitt = (double) antallOrd / perioder.length;

        System.out.println("Det er gjennomsnittlig: " + gjennomsnitt + " ord mellom hvert skilletegn.");

    }
}
