package com.test.two;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object o=new Object();
        mywait wait=new mywait(o);
        mynotify noti=new mynotify(o);
        wait.start();
        Thread.sleep(1000);
        noti.start();
    }
}
