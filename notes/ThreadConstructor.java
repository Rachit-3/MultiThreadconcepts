package notes;

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while (i<100)
        {     System.out.println("Thread is here");
        i++;}
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
   mythr t=new mythr("rachit");
        mythr t1=new mythr("rahul");
   t.start();
   t1.start();
        System.out.println("id of thread" + t.getId()  );
        System.out.println("name of thread" + t.getName());
        System.out.println("id of thread" + t1.getId()  );
        System.out.println("name of thread" + t1.getName());
    }

}
