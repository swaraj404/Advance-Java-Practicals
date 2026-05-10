import java.rmi.*;

public class rmiclient
{
    public static void main(String args[])
    {
        try
        {
            String s1 = "rmi://localhost/palin";

            one onex = (one) Naming.lookup(s1);

            int m = onex.palin("madam");

            if(m == 1)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}