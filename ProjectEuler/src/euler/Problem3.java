package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem3
{
    public static void main(String[] args)
    {
        long num = 600851475143L;
        List<Integer> factors = getPrimeFactors(num);
        System.out.println(factors.get(factors.size()-1));
    }

    // I know these methods are going to be reused,
    // so make them easy to factor out later
    private static List<Integer> getPrimeFactors(long number)
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