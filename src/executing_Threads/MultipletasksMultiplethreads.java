package executing_Threads;

public class MultipletasksMultiplethreads {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();
        Thread2 th2 = new Thread2();
        th2.start();
        Thread3 th3 = new Thread3();
        th3.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}
class Thread3 extends Thread{
    public void run(){
        System.out.println("Thread 3");
    }
}