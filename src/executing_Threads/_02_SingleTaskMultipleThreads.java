package executing_Threads;

public class _02_SingleTaskMultipleThreads extends Thread{
    public void run(){
        System.out.println("Single task from Multiple Thread");
    }
    public static void main(String[] args) {
        _02_SingleTaskMultipleThreads th = new _02_SingleTaskMultipleThreads();
        th.start();

        _02_SingleTaskMultipleThreads th2 = new _02_SingleTaskMultipleThreads();
        th2.start();

    }
}
