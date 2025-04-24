package threadClassMethods.namingMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread : "+Thread.currentThread().getName());
        UserThread th = new UserThread();
        th.start();

        System.out.println(Thread.currentThread().isAlive());   /// true

        System.out.println(th.isAlive());   /// may return true orr false

        /*

        This is race-dependent:

If main checks th.isAlive() before the run() method finishes → true.

If main checks after run() completes → false.

This uncertainty arises because threads run concurrently, and the user thread might start and finish very quickly.
        * */
    }
}
class UserThread extends Thread{
    public void run(){
        System.out.println("User created Thread: "+Thread.currentThread().getName());
    }
}
