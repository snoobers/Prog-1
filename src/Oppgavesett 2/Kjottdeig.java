public class Kjottdeig {
    public static void main(String[] args) {
//Informasjon om a
    double a_pris = 35.90d;
    double a_vekt_gram = 450.0d;
    double a_pris_per_gram = a_vekt_gram / a_pris;
//Informasjon om b
    double b_pris = 39.90d;
    double b_vekt_gram = 500.0d;
    double b_pris_per_gram = b_vekt_gram / b_pris;

    if (b_pris_per_gram < a_pris_per_gram) {
        System.out.println("Merke B er billigst!");
    }else {
            System.out.println("Merke A er billigst!");
       }
    }
}
