package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem3
{
    public static void main(String[] args)
    {
        long num = 600851475143L;
        List<Long> factors = getPrimeFactors(num);
        System.out.println(factors.get(factors.size()-1));
    }

    // I know these methods are going to be reused,
    // so make them easy to factor out later
    private static List<Long> getPrimeFactors(long number)
    {
        List<Long> primes = getPrimes((long)Math.floor(Math.sqrt(number)));
        List<Long> factors = new ArrayList<>();
        for(long p: primes)
        {
            if(number % p == 0)
            {
                factors.add(p);
            }
        }
        return factors;
    }

    private static List<Long> getPrimes(long max)
    {
        List<Long> primes = new ArrayList<>();
        for(long i=2; i<=max; i++)
        {
            boolean factorFound = false;
            for(long p: primes)
            {
                if(i % p == 0)
                {
                    factorFound = true;
                    break;
                }
            }
            if(!factorFound)
            {
                primes.add(i);
            }
        }
        return primes;
    }
}