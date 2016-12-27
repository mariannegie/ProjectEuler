package euler;

public class Problem5
{
    public static void main(String[] args)
    {
        long product = 1;
        for(int i=20; i>1; i--)
        {
            product = EulerUtils.getLCM(product, i);
        }

        System.out.println(product);
    }
}