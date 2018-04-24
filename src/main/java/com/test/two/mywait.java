package com.test.two;

public class mywait extends Thread{
    private Object lock;
    public mywait(Object lock){
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("wait before");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait after");
        }
    }
}
