package org.example.controller;

import org.example.Entity.Quotes;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class SystemController {

    public void exit() {
        save();
    }

    public void build(){
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\rla48\\data.json");
            byte[] by= Quotes.getList().toString().getBytes();
            output.write(by);
            System.out.println("data.json 파일의 내용이 갱신되었습니다.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void save() {
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\rla48\\quote.txt");
            byte[] by=Quotes.getList().toString().getBytes();
            output.write(by);
            System.out.println("data.json 파일의 내용이 갱신되었습니다.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
