package executing_Threads;

public class _01_SingleThreadSingleTask extends Thread {
    public void run(){
        System.out.println("Single task from Single Thread");
    }
    public static void main(String[] args) {
        _01_SingleThreadSingleTask th = new _01_SingleThreadSingleTask();
        th.start();

    }
}
