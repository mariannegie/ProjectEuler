public class Problem2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;
        while(fib2 <= 4000000)
        {
            if(fib2 % 2 == 0)
            {
                sum += fib2;
            }

            int tmp = fib2;
            fib2 = fib1 + fib2;
            fib1 = tmp;
        }

        System.out.println(sum);
    }
}