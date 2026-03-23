
public class SumOfNaturalNo {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}


// by formula n(n+1)/2
/* public class SumOfNaturalNo {
    
    public static void main(String[] args) {
        int n = 10;
        int sum = n * (n + 1) / 2;

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
} */

    // by recursion
/* public class SumOfNaturalNo {

    public static void main(String[] args) {
        int n = 10;
        int result = SumOfNaturalNo(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }

    public static int SumOfNaturalNo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + SumOfNaturalNo(n - 1);
    }
} */