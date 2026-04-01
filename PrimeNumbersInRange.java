public class PrimeNumbersInRange
{
    public static void main(String[] args)
    {

        int lower = 1, upper = 20;

        for (int i = lower; i <= upper; i++)
            if (isPrime(i))
                System.out.println(i);
    }

    static boolean isPrime(int n)
    {
        int count = 0;

        // 0, 1 and negative numbers are not prime
        if (n < 2)
            return false;

        // checking divisibility from 2 to n-1
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }

        // if no divisor found then it is prime
        return true;
    }
}