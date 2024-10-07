/**
 * Oppgave5
 */
public class Brok {

    private int teller;
    private int nevner;

    public Brok(int teller, int nevner){
        if (nevner == 0){
            throw new IllegalArgumentException("Å dele på null er tull!");
        }
        this.teller = teller;
        this.nevner = nevner;
        
    }
    public Brok(int teller){
        this.teller = teller;
        nevner = 1;
    }

    // Get metoder som henter  ut verdiene fra objekter
    public int getTeller(){
        return teller;
    }
    public int getNevner(){
        return nevner;
    }
    

    //Summer
    public void summer(int teller, int nevner){
        if (this.nevner != nevner){
            this.teller = (this.nevner * teller) + (this.teller * nevner);
            this.nevner = (this.nevner * nevner);
        }
        else{
            this.teller += teller;
        }
        
        
    }
    //Subtraher
    public void subtraher(int teller, int nevner){
        if (this.nevner != nevner){
            this.teller = (this.teller * nevner) - (this.nevner * teller);
            this.nevner = (this.nevner * nevner);
        }
        else{
            this.teller -= teller;
        }
        
    }
    //Multipliser
    public void multipliser(int teller, int nevner){
        this.teller = this.teller * teller;
        this.nevner = this.nevner * nevner;
    }
    //Divider
    public void divider(int teller, int nevner){
        this.teller = this.teller * nevner;
        this.nevner = this.nevner * teller;
    }


    public static void main(String[] args) {
        Brok brok1 = new Brok(4, 3);
        brok1.divider(1,2);
        System.out.println("Teller: " + brok1.getTeller());
        System.out.println("Nevner: " + brok1.getNevner());
        


    }
}