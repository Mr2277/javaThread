package com.test.one;

public class ThreadA extends Thread {
    private MyList myList;
    public ThreadA (MyList myList){
        this.myList=myList;
    }
    @Override
    public void run() {
        //
        for(int i=0;i<10;i++){
            myList.add();
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
