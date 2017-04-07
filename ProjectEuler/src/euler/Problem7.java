package euler;

import java.util.List;

public class Problem7
{
    public static void main(String[] args)
    {
        List<Integer> primes = EulerUtils.getPrimes(1000000);
        System.out.println(primes.get(10001-1));
    }
}