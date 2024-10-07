import java.util.Random;

/**
 * Terning
 */
public class TerningSpill {
    
    private java.util.Random terning = new java.util.Random(); //Oppretter en generator for tilfeldig tall
    private int sumPoeng;

    public TerningSpill(int sumPoeng) {  
        
        this.sumPoeng = sumPoeng;
    }
    public TerningSpill(Random terning){
        this.terning = terning;
    }

    public int getsumPoeng()
    {
        return sumPoeng;
    }

    public int getSumPoeng(int terningKast, int sumPoeng) {  // Lager en metode for å returnere summen av terningkast +  sumPoeng vi har
        return sumPoeng += terningKast;
    }
    public int kastTerning(){
        int terningkast = terning.nextInt(6) + 1; //Legger til + 1 for at det skal gi en int mellom  1 og 6
        return  terningkast;
    }
    public void erFerdig(String spiller){
        System.out.println("Gratulerer " + spiller + "! Du vant!");
        
    }
    public int minusTerning(int terningKast, int sumPoeng){
        return sumPoeng -= terningKast;
    }

    public static void main(String[] args) {
        System.out.println("Førstemann til 100 eller mer poeng vinner! Lykke til!");
        TerningSpill spillerA = new TerningSpill(0);
        TerningSpill spillerB = new TerningSpill(0);
        
        //Oppretter rundenummer
        int runde = 1;

        while (spillerA.getsumPoeng() != 100 && spillerB.getsumPoeng() != 100){

            //Begge spillere kaster terning én gang
            int terningKastA = spillerA.kastTerning();
            int terningKastB = spillerB.kastTerning();

            //Legger til kastet i sumPoeng ved hjelp av metoden getSumPoeng
            spillerA.sumPoeng = spillerA.getSumPoeng(terningKastA, spillerA.sumPoeng);
            spillerB.sumPoeng = spillerB.getSumPoeng(terningKastB, spillerB.sumPoeng);

            // Øker rundenummer for hver runde
            System.out.println("Runde " + runde + ":");
            runde ++;

            //Legger til if setning for å sjekke om terningkast = 1. Hvis = 1 så settes sumPoeng = 0
            if (terningKastA == 1)
            {
                spillerA.sumPoeng = 0;
            }
            else if (terningKastB == 1)
            {
                spillerB.sumPoeng = 0;
            }

            //Printer ut score 
            System.out.println("Spiller A har: " + spillerA.sumPoeng + " poeng og spiller B har:  " + spillerB.sumPoeng + " poeng!");

            //Trekker fra terning kastet hvis sumPoeng er over 100
            if (spillerA.getsumPoeng() > 100) {
                spillerA.sumPoeng = spillerA.minusTerning(terningKastA, spillerA.sumPoeng); 
            }
            else if (spillerB.getsumPoeng() > 100){
                spillerB.sumPoeng = spillerB.minusTerning(terningKastB, spillerA.sumPoeng);
            }


           
        }
        if (spillerA.getsumPoeng() == 100)
        {
            spillerA.erFerdig("Spiller A");
        }
            else
            {
                spillerB.erFerdig("Spiller B");
            }

    }
}