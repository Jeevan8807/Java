public class Main {
    public static void main(String[] args)
    {
        int sum=0;
        for (int i = 1; i <= 200; i++)
        {
            if (i%2==0)
            System.out.println(i);
        }
        {
            for (int i = 1; i <= 200; i++)
            {
                if (i%2!=0)
                    System.out.println(i);
            }
            {
                for (int i = 1; i <= 200; i++)
                {
                    sum= sum+i;
                }
            }
            System.out.println(sum);
        }
    }
}