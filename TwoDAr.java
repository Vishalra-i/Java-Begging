import java.util.Scanner;

public class TwoDAr {
    // public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    int row = sc.nextInt();
    //    int col = sc.nextInt();

    //    int[][] twoArr = new int[row][col];
    //    for(int i=0; i<row; i++){
    //     for(int j=0; j<col; j++){
    //         twoArr[i][j] = sc.nextInt();
    //     }
    //    }
    //     for(int i=0; i<row; i++){
    //         for(int j=0; j<col; j++){
    //             System.out.print(twoArr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Search Value");
        int x = sc.nextInt() ;
        System.out.println("Enter Row Value");
        int rows = sc.nextInt();
        System.out.println("Enter Column Value");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols] ;
        
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                array[i][j] = sc.nextInt() ;
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(array[i][j] == x){
                    System.out.println("Found at row number: " + i + " and column number : " + j);
                }
                
            }
        }
        sc.close();
    }
}
