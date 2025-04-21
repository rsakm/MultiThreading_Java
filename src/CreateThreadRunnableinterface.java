
//// Step 1:  Implementing the Runnable Interface
public class CreateThreadRunnableinterface implements Runnable{

//// Step 2: Override the run() method
    @Override
    public void run() {
        System.out.println("Thread by implementing Runnable Interface.");

    }

    public static void main(String[] args) {

//        // Step 3: create an object of the class
        CreateThreadRunnableinterface t = new CreateThreadRunnableinterface();

//        // To start a thread we need start() method which is inside Thread class not inside the Runnable interface
//        // So we have to create an object of Thread class as well to start the thread
//        // step 4: create an object of the thread class and the pass the reference of the object created above in it
        Thread th = new Thread(t);

//        // step 5: Start the thread
        th.start();


    }
}
