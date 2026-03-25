import java.util.Scanner;

public class SumRange {

    // Method 1: Using Loop (Brute Force)
    static int sumLoop(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }

    // Method 2: Using Formula
    static int sumFormula(int a, int b){
        return (b*(b+1)/2) - ((a-1)*a/2);
    }

    // Method 3: Using Recursion
    static int sumRecursion(int a, int b){
        if(a > b)
            return 0;
        return a + sumRecursion(a+1, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum using Loop = " + sumLoop(a,b));
        System.out.println("Sum using Formula = " + sumFormula(a,b));
        System.out.println("Sum using Recursion = " + sumRecursion(a,b));
    }
}