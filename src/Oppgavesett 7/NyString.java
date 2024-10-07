/**
 * NyString
 */
public class NyString {

    String tekst;

    //Konstruktør som tar inn en gitt tekst
    public NyString(String tekst){
        this.tekst = tekst;
    }

    //Metoder for forkortelse og for å fjerne ønsket tegn
    public void forkortelse(){
        String[] parts = tekst.split(" "); //Oppretter en liste med resterende tegn etter fjernet mellomrom

        for (int i = 0; i < parts.length; i ++){ //Itererer over antall ord i listen
            String ord = parts[i];
            char forsteBokstav = ord.charAt(0); 
            System.out.print(forsteBokstav); //Finner og printer den første bokstaven av hvert ord
        }
    }
    
    /* Den jeg lagde selv java-style
    public void fjernTegn(String tegn){
        //Lager en vile løkke som går så lenge bokstaven vi ønsker å fjerne fortsatt finnes
        String smaaBokstaver = tekst.toLowerCase();
        while (smaaBokstaver.contains(tegn)){

            for (int i = 0; i < smaaBokstaver.length(); i ++){  //Itererer lengden av teksten vi har
                String bokstav = Character.toString(smaaBokstaver.charAt(i));

                if (bokstav.equals(tegn)){  //Sjekker om bokstaven vi er på er lik den som skal fjernes
                    tekst = tekst.substring(0, i) + tekst.substring(i + 1);  // Dersom den er lik fjerner vi den 
                    smaaBokstaver = smaaBokstaver.substring(0, i) + smaaBokstaver.substring(i + 1);
                    break;  //Break for å unngå at det blir feil med indeksering dersom vi fortsetter etter å ha fjernet en bokstav
                }
            }
        }
        System.out.println(tekst);
    }
    */ 

    public void fjernTegn(String tegn){
        //Fjerner tegnet som både stor og liten bokstav
        tekst = tekst.replace(tegn.toLowerCase(), "");
        tekst = tekst.replace(tegn.toUpperCase(), "");

        //Printer den teksten med fjernet tegn
        System.out.println(tekst);
    }


    public static void main(String[] args) {
        NyString teksten = new NyString("Hei, jeg heter Edvard og jeg synes det er morsomt med programmering. Det er fortsatt vanskelig, men øvelse gjør mester!");

        //teksten.forkortelse();

        teksten.fjernTegn("e");

    }
}