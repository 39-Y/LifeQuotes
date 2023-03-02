package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Quote> lifeQuotes = new ArrayList<>();
    static Scanner sc;
    public static void main(String[] args) {
        lifeQuotes.add(null);
        sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true){
            System.out.print("명령) ");
            String commend = sc.nextLine();
            if("종료".equals(commend)){
                break;
            }
            else if("등록".equals(commend)){
                post();
            }

        }
        sc.close();
    }

    static public void post(){
        System.out.print("명언: ");
        String quote = sc.nextLine();
        System.out.print("작가: ");
        String author = sc.nextLine();
        lifeQuotes.add(new Quote(quote, author));
        System.out.printf("%d번 명언이 등록되었습니다.\n", lifeQuotes.size()-1);
    }



    static class Quote{
        String quote;
        String author;

        public Quote(String quote, String author) {
            this.quote = quote;
            this.author = author;
        }
    }
}