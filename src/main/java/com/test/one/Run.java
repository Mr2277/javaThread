package com.test.one;

public class Run {
    public static void main(String[] args){
        MyList myList=new MyList();
        ThreadA threadA=new ThreadA(myList);
        ThreadB threadB=new ThreadB(myList);
        threadA.start();
        threadB.start();
    }
}
