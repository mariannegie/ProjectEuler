package euler;

public class Problem4
{
    public static void main(String[] args)
    {
        int max = 0;
        for(int i=999; i>0; i--)
        {
            for(int j=999; j>0; j--)
            {
                int prod = i * j;
                if(prod > max && isPalindrome(prod))
                {
                    max = prod;
                }
            }
        }

        System.out.println(max);
    }

    private static boolean isPalindrome(int anInt)
    {
        String intStr = Integer.toString(anInt);
        return new StringBuilder(intStr).reverse().toString().equals(intStr);
    }
}