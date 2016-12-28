package euler;

import java.util.ArrayList;
import java.util.List;

public class EulerUtils
{
    public static List<Integer> getPrimeFactors(long number)
    {
        List<Integer> primes = getPrimes((int)Math.floor(Math.sqrt(number)));
        List<Integer> factors = new ArrayList<>();
        for(int p: primes)
        {
            if(number % p == 0)
            {
                factors.add(p);
            }
        }
        return factors;
    }

    public static List<Integer> getAllFactors(int number)
    {
        List<Integer> primes = getPrimes((int)Math.floor(Math.sqrt(number)));
        List<Integer> factors = new ArrayList<>();
        for(int p: primes)
        {
            // Short circuit if we have no more prime factors
            if(number <= 1)
            {
                break;
            }

            while(number % p == 0)
            {
                factors.add(p);
                number = number / p;
            }
        }

        return factors;
    }

    public static long getGCD(long int1, long int2)
    {
        // Use Euclidean algorithm
        // See https://en.wikipedia.org/wiki/Euclidean_algorithm
        while(int1 != int2)
        {
            if(int1 > int2)
            {
                int1 = int1 - int2;
            }
            else
            {
                int2 = int2 - int1;
            }
        }
        return int1;
    }

    public static long getLCM(long int1, long int2)
    {
        return (long)int1 * int2 / getGCD(int1, int2);
    }

    private static List<Integer> getPrimes(int max)
    {
        boolean[] primeArray = new boolean[max+1];
        // Call 0 and 1 not prime off the bat
        for(int i=2; i<max; i++)
        {
            primeArray[i] = true;
        }

        List<Integer> primes = new ArrayList<>();
        for(int i=2; i<=max; i++)
        {
            if(primeArray[i])
            {
                primes.add(i);
                int j = i + i;
                while(j<max)
                {
                    primeArray[j] = false;
                    j += i;
                }
            }
        }
        return primes;
    }
}