
//// Step 1 : Extending the Thread Class
public class CreateThread extends Thread {

//    // step 2: Override the run() method
    @Override
    public void run(){
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        CreateThread t = new CreateThread();
        t.start();

//        t.start()   ----> Run time Exception : illegal thread state as once a thread is dead, it can not be started again
    }
}
