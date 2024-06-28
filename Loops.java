import java.util.*;

public class Loops {

    // For LOOP
    // public static void main(String[] args) {
    //     for (int i = 0; i <= 10; i++) {
    //         System.out.println(i);
    //     }
    // }

    //While Loop
    // public static void main(String[] args) {
    //     int i = 0 ;
    //     while(i < 10){
    //         i++ ;
    //         System.out.println(i);
    //     }
    // }

    //Do while loop
    // public static void main(String[] args) {
    //     int i = 0 ;
    //     do{
    //         i++ ;
    //         System.out.println(i);
    //     }while(i < 10);
    // }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      for(int i = 1 ; i <= 10 ; i++ ){
        System.out.println( a + " x " + i + " = " + a*i);
      }
    }
}
