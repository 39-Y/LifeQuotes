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

        }
        sc.close();
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