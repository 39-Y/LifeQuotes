package org.example.service;

import org.example.Entity.Quote;
import org.example.Entity.Quotes;

import java.util.List;

public class QuoteService {
    public int post(String quote, String author){
        return Quotes.add(new Quote(quote, author));
    }

    public List<Quote> read() {
        return Quotes.getList();
    }

    public int findIdxById(int num){
        for(int i=0; i<Quotes.size(); i++){
            if(Quotes.get(i).getId() == num)
                return i;
        }
        return -1;
    }

    public Quote findById(int num){
        for(int i=0; i<Quotes.size(); i++){
            if(Quotes.get(i).getId() == num)
                return Quotes.get(i);
        }
        return null;
    }

    public int remove(int id) {
        int index = findIdxById(id);
        if(index>=0)
            Quotes.remove(index);
        return index;
    }
//    public void update(int index, String quote, String author) {
//        System.out.println(quote+"//"+author);
//        Quotes.get(index).setQuote(quote);
//        Quotes.get(index).setAuthor(author);
//    }
}

