package euler;

public class Problem6
{
    public static void main(String[] args)
    {
        long sum = 0;
        long sumOfSquares = 0;
        for(int i=1; i<=100; i++)
        {
            sum += i;
            sumOfSquares += (long)i * i;
        }
        long squareOfSums = sum * sum;
        System.out.println(squareOfSums - sumOfSquares);
    }
}