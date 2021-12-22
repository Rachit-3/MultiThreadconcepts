package notes;
class Sample extends Thread {
    public void run() {
        while (true) {
            System.out.println(" jai hind jai  bharat");

        }


    }
}
    class samples extends Thread {
        public void run() {
            while (true) {
                System.out.println("1111");
            }
        }
    }

    public class sampleMultiThreading {
        public static void main(String[] args) {
            Sample s = new Sample();
            samples sc =new samples();
            s.start();
            sc.start();

        }
    }
