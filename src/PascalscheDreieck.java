import java.util.Scanner;

public class PascalscheDreieck {
    public PascalscheDreieck(int row) {
        int[][] pascal = new int[row][];
        for(int i = 0; i < pascal.length ; i++){
            pascal[i] = new int[i];
            for(int j = 0; j < pascal[i].length; j++){
                pascal[i][j] = j;
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teh maximum row number: ");
        int row = scanner.nextInt();
        new PascalscheDreieck(row);
    }
}
