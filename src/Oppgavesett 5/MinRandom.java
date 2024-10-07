import java.util.Random; //Import the Random class


public class MinRandom {

    private Random random;

    // Oppretter konstruktøren vår med et Random-objekt
    public MinRandom(){
        random = new Random();
    }
    
    // Definerer metodene våre
    // Gir et heltall mellom satte grenseverdier, inkludert nedre, men eksludert øvre
    public int nesteHeltall(int nedre, int ovre){
        if (nedre >= ovre){
            throw new IllegalArgumentException("NEDRE MÅ VÆRE MINDRE ENN ØVRE");
        }
            return random.nextInt(nedre, ovre);
        }
        
    //Gir et desimaltall mellom sette grenseverdier, inkludert nedre, men eksklusivt øvre
    public double nesteDesimaltall(double nedre, double ovre){
        if (nedre >= ovre){
            throw new IllegalArgumentException("NEDRE MÅ VÆRE MINDRE ENN ØVRE");
        }
            double desimaltall = nedre + random.nextDouble() * (ovre - nedre);
            return desimaltall;
        }
    

    public static void main(String[] args) {
        
        // Oppretter objektet vårt
        MinRandom minRandom = new MinRandom();

        // Setter opp to for løkker for å teste metodene 5 ganger hver
        for (int i = 0; i < 5; i++){
            System.out.println(minRandom.nesteHeltall(2, 10));
        }
        for (int i = 0; i < 5; i++){
            System.out.println(minRandom.nesteDesimaltall(2, 10));
        }
    }
}
