package threadClassMethods.namingMethods;

public class ThreadNaming {
    public static void main(String[] args) {
        System.out.println("main Thread (automatically created by JVM");
        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);  //// exception un Thread main
        Thread.currentThread().setName("rajshree");
        System.out.println("The main thread has been renamed to: ");
        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);   //// exception is thread "rajshree"


        Test t = new Test();    ////Thread-0
//        // created by main thread and naming done by JVM
        t.start();
        Test t2 = new Test();
        t2.start();    //// Thread-1
        t2.setName("raj");   //// Thread-1 --> raj

    }
}

class Test extends Thread{
    @Override
    public void run(){

        System.out.println("user created thread: " +Thread.currentThread().getName());
//        We can set the name of this thred as well
    }

}
