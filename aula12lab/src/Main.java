public class Main {
    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();

        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
    }
}