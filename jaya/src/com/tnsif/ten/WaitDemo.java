package com.tnsif.ten;

//package com.tnsif.multithreading;

class Shared {
    synchronized void waitMethod() {
        System.out.println("Thread is going to wait...");
        try {
            wait();  // Current thread releases lock and waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread resumed after notify!");
    }

    synchronized void notifyMethod() {
        System.out.println("Notifier is going to notify...");
        notify();  // Wakes up one waiting thread
    }
}

public class WaitDemo {
    public static void main(String[] args) {
        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.waitMethod());
        
        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            obj.notifyMethod();
        });

        t1.start();
        t2.start();
    }
}
