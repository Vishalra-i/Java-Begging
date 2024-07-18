import java.util.Scanner;

public class Exercise {
    //Average number Question no . 1
    // public static int average(int a , int b , int c) {

    //    int sum = a + b + c ;
    //    int avg = sum / 3 ;
    //     return avg ;
    // }


    //sum of all number from 1 to n Question no . 2
    // public static int sumAllOddNumber(int n ) {
    //     int sums = 0 ;
        
    //     for (int i = 1; i <= n ; i++) {
    //         if((i%2) != 0){
    //             sums += i ;
    //         }else{
    //             continue ;
    //         }
    //     }

    //     return sums ;
    // }

    //takes two number and return greater 1 to n Question no . 3
    // public static  int greaterNumber(int a , int b) {

    //   if(a == b){
    //      System.out.print("Both number are equal :");
    //      return a ;
    //   }

    //    if(a > b){
    //      return a ;
    //    }else{
    //     return b ;
    //    }
    // }

    //take radius and retur circumfrence of circle Question no . 4
    // public static  Double Circumference(Double r) {
    //      Double circumfrance =  2 * Math.PI * r ;
    //      return circumfrance ; 
    // }

    //valid age for voting Question no. 4
    // public static void validAgeForVoting(int age) {
    //     if( age >= 18){
    //         System.out.println("You are eligible for voting");
    //     }else{
    //         System.out.println("You are not eligible for voting");
    //     }
    // }


    // //valid age for voting Question no. 5
    // public static void validAgeForVoting(int age) {
    //     if( age >= 18){
    //         System.out.println("You are eligible for voting");
    //     }else{
    //         System.out.println("You are not eligible for voting");
    //     }
    // }


    //Infine loop using do while Question no.6
    // do{
    //     System.out.println("infinite");
    // }while(1<100);

    
    public static void countPositive(String args[]){
        int positive = 0 ;
        int negative = 0 ;
        int zeroes  = 0 ;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a < 0){
            negative++ ;
        }else if(a == 0){
            zeroes++ ;
        }else{
            positive++ ;
        }

    }
    public static void main(String args[]){
        
    }
}
