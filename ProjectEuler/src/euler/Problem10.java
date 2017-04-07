package euler;

import java.util.List;

public class Problem10
{
    public static void main(String[] args)
    {
        List<Integer> primes = EulerUtils.getPrimes(2000000);
        long sum = 0;
        for(Integer i: primes)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}