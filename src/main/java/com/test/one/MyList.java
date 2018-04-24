package com.test.one;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<String> list=new ArrayList<String>();
    public void add(){
        list.add("ddd");
    }
    public int size(){
        return list.size();
    }
}
