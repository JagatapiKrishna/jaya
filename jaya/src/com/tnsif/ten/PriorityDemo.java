package com.tnsif.ten;

public class PriorityDemo extends Thread {
    public void run() {
        System.out.println("The running thread name is: " + Thread.currentThread().getName());
        System.out.println("The running thread priority is: " + Thread.currentThread().getPriority());
    }
}
