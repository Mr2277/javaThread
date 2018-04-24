package com.test.two;

public class mynotify extends Thread{
    private Object lock;
    @Override
    public void run() {
        synchronized (lock){
            System.out.println("before notify");
            lock.notify();
            System.out.println("after notify");
        }
    }

   public mynotify(Object lock){
        this.lock=lock;
   }
}
