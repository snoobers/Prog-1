public class Matrise {
    
    private final int [][] arr;

    public Matrise(int[][] arr){
        this.arr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++){
            this.arr[i] = arr[i].clone();
        }
    }

    public void getMatrise(){
        System.out.println(this.toString());
    }

    public Matrise addisjon(Matrise annenMatrise){
        if (this.arr.length != annenMatrise.arr.length || this.arr[0].length != annenMatrise.arr[0].length ){
            return null;
        }
        int rader = this.arr.length;
        int kolonner = this.arr[0].length;
        int[][] resultat = new int[rader][kolonner];

        for (int i = 0; i < rader; i++){
            for (int j = 0; j < kolonner; j++){
                resultat[i][j] = this.arr[i][j] + annenMatrise.arr[i][j];
            }
        }
        return new Matrise(resultat);
    }

    public Matrise multiplikasjon(Matrise annenMatrise){
        int rader1 = this.arr.length;
        int kolonner1 = this.arr[0].length;
        int rader2 = annenMatrise.arr.length;
        int kolonner2 = annenMatrise.arr[0].length;

        if (kolonner1 == rader2){
            int resultat[][] = new int[rader2][kolonner1];
            for (int i = 0; i < rader1; i++){
                for (int j = 0; j < kolonner2; j++){
                    for (int k = 0; k < rader2; k++){
                        resultat[i][j] += this.arr[i][k] * annenMatrise.arr[i][k];
                    }
                }
            }
            return new Matrise(resultat);
            
        } else if (kolonner2 == rader1){
            int resultat[][] = new int[rader1][kolonner2];
            for (int i = 0; i < rader2; i++){
                for (int j = 0; j < kolonner1; j++){
                    for (int k = 0; k < rader1; k++){
                        resultat[i][j] += this.arr[i][k] * annenMatrise.arr[i][k];
                    }
                }
            }
            return new Matrise(resultat);

        } else {
            return null;
        }
    }
        
    public Matrise transpose(){
        int rader = this.arr.length;
        int kolonner = this.arr[0].length;
        int[][] resultat = new int[rader][kolonner];

        for (int i = 0; i < rader; i++){
            for (int j = 0; j < kolonner; j++){
                resultat[j][i] = this.arr[i][j];
            }
        }
        return new Matrise(resultat);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");  // Ny linje etter hver rad
        }
        return sb.toString();
    }
    
}
