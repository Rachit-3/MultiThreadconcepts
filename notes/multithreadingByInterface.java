package notes;
class myThread implements Runnable{
public void run()
{    while(true)
    System.out.println("jai hind jai bharat");
}
}
class myThread2 implements Runnable {
    public void run() {
        while(true)
        System.out.println("--------------------");
    }
}
public class multithreadingByInterface {
    public static void main(String[] args) {
myThread m=new myThread();
Thread k=new Thread(m);
myThread2 n=new myThread2();
Thread l= new Thread(n);
k.start();
l.start();
    }
}
