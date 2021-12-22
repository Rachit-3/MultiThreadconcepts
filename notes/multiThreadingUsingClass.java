package notes;
class mythread extends Thread {
    @Override
    public void run() {
        int i=0;
        while (true) {

            System.out.println("my thread is running");
            System.out.println("ezzzzzzzzz");
            i++;
        }
    }
}
    class mythread1 extends Thread {
        @Override
        public void run() {
            int i=0;
            while (i<1000000) {
                System.out.println("my thread1 tu running");
                System.out.println("buzzzzzzz");
                i++;
            }

        }
    }
public class multiThreadingUsingClass {
    // read about concurrency vs parallelism
    // multi threading is used to achieve concurrency
    public static void main(String[] args) {
     mythread m=new mythread();
     mythread1 n=new mythread1();
     m.start();//start method is use to start the thread it calls run method internally
    n.start();
    }
}
//observe the output