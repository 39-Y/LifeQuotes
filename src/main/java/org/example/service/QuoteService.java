package org.example.service;

import org.example.Entity.Quote;
import org.example.Entity.Quotes;
import org.example.container.Sc;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class QuoteService {
    public int post(String quote, String author){
        return Quotes.add(new Quote(quote, author));
    }

    public void read() {
        if(Quotes.size() == 0)
            System.out.println("등록된 명언이 없습니다.");

        System.out.println("번호 / 작가 / 명언 \n ----------------------");
        for(int i=Quotes.size()-1; i>=0; i-- ){
            System.out.printf("%d / %s / %s \n", Quotes.get(i).getId(), Quotes.get(i).getAuthor(), Quotes.get(i).getQuote());
        }
    }

    public void remove(int num) {
    }

    public void update(int num) {
    }
}
