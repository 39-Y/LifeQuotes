package org.example.Entity;

import java.util.ArrayList;
import java.util.List;

public class Quotes {
    static private List<Quote> quoteList;
    static{
        quoteList = new ArrayList<>();
    }
    static public List<Quote> getList(){
        return quoteList;
    }
    static public Quote get(int i){
        return quoteList.get(i);
    }
    static public int add(Quote q){
        quoteList.add(q);
        return q.getId();
    }
    static public void set(int i,Quote q){
        quoteList.set(i,q);
    }
    static public void remove(int i){
        quoteList.remove(i);
    }


    public static int size() {
        return quoteList.size();
    }
}
