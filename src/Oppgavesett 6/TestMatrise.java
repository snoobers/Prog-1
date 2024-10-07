public class TestMatrise {
    
    public static void main(String[] args) {
        int[][] data1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] data2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        Matrise m1 = new Matrise(data1);
        Matrise m2 = new Matrise(data2);

        Matrise summen = m1.addisjon(m2);

        if (summen != null){
            // Bruk getMatrise som nå skriver ut riktig formatert matrise
            summen.getMatrise();
        } else {
            System.out.println("Matrisene kan ikke adderes.");
        }
    }
}