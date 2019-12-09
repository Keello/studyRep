package commonSubsequence;

import java.util.Arrays;

public class CommonSubsequence {

    public static void main(String[] args) {
        String firstWord = "fish";
        String secondWord = "fosh";
        int subsequenceLength = 0;
        int cell[][] = new int[firstWord.length()][secondWord.length()];
        for (int i=0; i<firstWord.length(); i++){
            for (int j=0; j<secondWord.length(); j++){
                if (firstWord.charAt(i) == secondWord.charAt(j)){
                    if (i>0 && j>0)
                        cell[i][j] = cell[i-1][j-1] + 1;
                    else cell[i][j] = 1;
                }
                else{
                    if (i == 0 && j > 0) {
                        cell[i][j] = cell[i][j - 1];
                    } else if (i > 0 && j == 0) {
                        cell[i][j] = cell[i - 1][j];
                    } else if (i > 0 && j > 0) {
                        cell[i][j] = Math.max(cell[i - 1][j], cell[i][j - 1]);
                    } else {
                        cell[i][j] = 0;
                    }
                }
            }
        }
        for (int i=0; i<firstWord.length(); i++) {
            for (int j = 0; j < secondWord.length(); j++) {
                if (cell[i][j] > subsequenceLength)
                    subsequenceLength = cell[i][j];
            }
        }

        System.out.println(firstWord + ", " + secondWord);
        System.out.println("Длина общей последовательности: " + subsequenceLength);
        for (int[] row : cell){
            System.out.println(Arrays.toString(row));
        }
    }
}
