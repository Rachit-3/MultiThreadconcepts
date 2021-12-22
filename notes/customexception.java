package notes;
import java.util.Scanner;
class  customexcep extends  Exception{
    public String getMessage()
    {
      return "this is exception";
    }
    public String toString()
    {
        return "esxception occur";

    }
}
public class customexception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            if(a<0||b<0)
                throw new customexcep();
            System.out.println(a*b/2);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }


    }
}
