package notes;
import java .util.Scanner;
class myExcep extends Exception
{
    @Override
    public String toString() {
        return "oops!!! it's an exception";
    }
}


public class throwvsthrows {
    static double divide(double a,double b) throws myExcep
    {
        if(b==0)
            throw new myExcep();
        else
            return a/b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        try {
            System.out.println(divide(a,b));
        }
        catch (myExcep e)
        {
            System.out.println(e.toString());
           e.printStackTrace();
        }


    }
}
