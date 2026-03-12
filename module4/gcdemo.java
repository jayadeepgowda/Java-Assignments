package module4;

//Write a short program to demonstrate Garbage Collection using System.gc()

public class gcdemo {

    @Override
    protected void finalize() {
        System.out.println("Garbage collector is cleaning up this object!");
    }

    public static void main(String[] args) {
        gcdemo obj1 = new gcdemo();
        gcdemo obj2 = new gcdemo();
        obj1 = null;
        obj2 = null;

        System.out.println("Objects are now null. Requesting Garbage Collection...");

        System.gc();
    }
}
