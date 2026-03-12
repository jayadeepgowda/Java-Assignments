package module5;
//Write a program to demonstrate thread life cycle states

class LifeCycleDemo extends Thread {
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread execution completed");
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycleDemo t = new LifeCycleDemo();
        System.out.println("Thread state before start: " + t.getState());

        t.start();
        System.out.println("Thread state after start: " + t.getState());

        Thread.sleep(500);
        System.out.println("Thread state during sleep: " + t.getState());

        t.join();
        System.out.println("Thread state after completion: " + t.getState());
    }
}

