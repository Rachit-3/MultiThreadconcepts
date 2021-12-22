package notes;

public class trycatch {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch ( Exception e) {
            System.out.println("reason is " + e);
        }

    }
}
