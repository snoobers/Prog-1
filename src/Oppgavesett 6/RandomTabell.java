import java.util.Arrays;
import java.util.Random;

/**
 * I denne oppgaven skal vi lage en tabell som viser hvor mange ganger tallene 1 - 9 er opprettet gjennom et random objekt 
 */
public class RandomTabell {


    public static void main(String[] args) {

        Random random = new Random();
        int[] antall = new int[10]; 

        int teller = 0;

        while (teller < 1000){

            int tilfeldigTall = random.nextInt(10);

            antall[tilfeldigTall] ++;
                  
            teller ++;
        }
        System.out.println(Arrays.toString(antall));
        
    }

}