public class GreatestOfThreeNumbers {
    public static void main(String[] args)
    {
        int num1 = 10, num2 = 20, num3 = 30;
        int temp, result;

        // find largest between num1 and num2
        temp = num1 > num2 ? num1 : num2;

        // find largest between temp and num3
        result = temp > num3 ? temp : num3;

        System.out.println(result + " is the greatest number");
    }
}
