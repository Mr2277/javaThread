package com.test.one;

public class ThreadB extends Thread{
    private MyList myList;
    public ThreadB(MyList myList){
        this.myList=myList;
    }

    @Override
    public void run() {
        //
        while (true){
            System.out.println(myList.size());
            if(myList.size()==5){
                throw new IndexOutOfBoundsException();
            }
        }
    }
}
