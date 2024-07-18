import java.util.Scanner;

public class Function {
    public static void printMyName(String name){
        System.out.println(name);
    }
    private static int sum( int a , int b){
        return a+b;
    }
    public static void printFactotial(int n){
        int fractotial = 1 ;
        for(int i = n ; i >= 1 ; i--){
            System.out.println(n*i);
            fractotial = fractotial * i ;
        }
        System.out.println(fractotial);
        return ;  
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printMyName(name);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = sum(a,b);
        // System.out.print("Sum of "+a+" and "+b+ "is :"+ sum);
        // sc.close();
        int a = sc.nextInt();
        printFactotial(a);

    }
}
