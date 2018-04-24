package com.test.four;

public class ThreadA extends Thread {
    private Object lockA;
    private Object lockB;

    public ThreadA(Object lockA, Object lockB) {
        this.lockB = lockB;
        this.lockA = lockA;
    }

    @Override
    public void run() {
        //while (true) {
            synchronized (lockA) {
                synchronized (lockB) {
                    System.out.println("A");
                    lockB.notify();
                    try {
                       lockA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
          //  }
        }
    }
}
