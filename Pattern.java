public class Pattern {
    // public static void main(String[] args) {
    //     for(int i = 1 ; i < 5 ; i++){
    //         System.out.println("*****");
    //     }
    // }

    //Hollow Rectangle
    // public static void main(String[] args) {
    //     for(int i = 1 ; i <= 4 ; i++){
    //         for(int j = 1 ; j <= 5 ; j++){
    //             if(i == 1 || i == 4 || j == 1 || j == 5){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // //Half Pyramid
    // public static void main(String[] args) {
    //     int n = 4 ;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
                
    //                 System.out.print("*");
                
    //         }
    //         System.out.println();
    //     }
    // }

    //Half  invert Pyramid
    // public static void main(String[] args) {
    //     int n = 4 ;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n; j++) {
                
    //             if(i <= j)
    //                 System.out.print("*");
                
    //         }
    //         System.out.println();
    //     }
    // }

    //5.inverted half pyramid rotate in 180 degree
    // public static void main(String[] args) {
    //     int n = 4  ;
    //     for (int i = 1; i <= n; i++) {
    //         //Inner loop for space
    //         for (int j = 1; j <= n-i; j++) {
    //             System.out.print(" ");
    //         }

    //         //Inner Loop 2 for print start *
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }

    //         //Print next line
    //         System.out.println()  
            
    //     }
    // }

    //Half Pyramid with numbers
    // public static void main(String[] args) {
    //     int n = 8 ;
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= n; j++) {
    //             if(j <= i)
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
       int n = 5 ;
       int k = 1 ;
       for (int i = 1; i <= n ; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(k + " ");
              k++ ;
          }
          System.out.println();
       }
    }
}
