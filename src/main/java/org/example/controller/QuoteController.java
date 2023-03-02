package org.example.controller;

import org.example.Entity.Quote;
import org.example.Entity.Quotes;
import org.example.container.Sc;
import org.example.service.QuoteService;

import java.util.List;

public class QuoteController {
    private QuoteService service = new QuoteService();

    public void post() {
        System.out.print("명언: ");
        String quote = Sc.get().nextLine();
        System.out.print("작가: ");
        String author = Sc.get().nextLine();
        System.out.printf("%d번 명언이 등록되었습니다.\n",service.post(quote, author));

    }

    public void read() {
        List<Quote> quotes = service.read();
        if(quotes.size() == 0){
            System.out.println("등록된 명언이 없습니다.");
            return;
        }
        System.out.println("번호 / 작가 / 명언 \n ----------------------");
        for(int i = quotes.size()-1; i>=0; i-- ){
            System.out.printf("%d / %s / %s \n", quotes.get(i).getId(), quotes.get(i).getAuthor(), quotes.get(i).getQuote());
        }
    }

    public void remove(int id){
        int result = service.remove(id);
        if(result<0)
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", result);
        else
            System.out.printf("%d번 명언이 삭제되었습니다.\n", id);
    }


    public void update(int id){
        Quote q = service.findById(id);
        if(q != null){
            System.out.println("명언(기존) : "+q.getQuote());
            System.out.print("명언 : ");
            String newQuote = Sc.get().nextLine();
            System.out.println("작가(기존) : "+q.getAuthor());
            System.out.print("작가 : ");
            String newAuthor = Sc.get().nextLine();
            q.setAuthor(newAuthor);
            q.setQuote(newQuote);
        }
        else
            System.out.println(id+"번 명언은 존재하지 않습니다.");
    }
}
