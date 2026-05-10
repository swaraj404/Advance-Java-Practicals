import java.rmi.*;

public class rmiserver
{
    public static void main(String args[])
    {
        try
        {
            two twox = new two();

            Naming.rebind("palin", twox);

            System.out.println("Object registered");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}