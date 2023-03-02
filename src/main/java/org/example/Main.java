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
            else if ("목록".equals(commend)){
                read();
            }
            else if (commend.contains("삭제?id=")) {
                int idx = commend.charAt(commend.length()-1)-'0';
                remove(idx);
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

    static public void read(){
        if(lifeQuotes.size() == 1)
            System.out.println("등록된 명언이 없습니다.");

        System.out.println("번호 / 작가 / 명언 \n ----------------------");
        for(int i=lifeQuotes.size()-1; i>0; i-- ){
            if(lifeQuotes.get(i) == null)
                continue;
            System.out.printf("%d / %s / %s \n", i, lifeQuotes.get(i).author, lifeQuotes.get(i).quote);
        }
    }

    static public void remove(int idx){
        if(lifeQuotes.size()>idx && lifeQuotes.get(idx) != null){
            lifeQuotes.set(idx, null);
            System.out.printf("%d번 명언이 삭제되었습니다.\n", idx);
        }
        //else System.out.println(idx+"번 명언은 존재하지 않습니다.");
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