import java.util.Scanner;

public class PascalscheDreieck {

    public PascalscheDreieck(int row) {
        int[][] pascal = new int[row][];
        for(int i = 0; i < pascal.length ; i++){
            pascal[i] = new int[i+1];
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i){
                    pascal[i][j] = 1;
                }
                else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum row number: ");
        int row = scanner.nextInt();
        new PascalscheDreieck(row+1);
    }
}
