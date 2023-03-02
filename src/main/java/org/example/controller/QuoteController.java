package org.example.controller;

import org.example.container.Sc;
import org.example.service.QuoteService;

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
        service.read();
    }

    public void remove(int num){
        service.remove(num);
    }
    public void update(int num){
        service.update(num);
    }
}
