package org.example.domain;

import org.example.Entity.Quote;
import org.example.Entity.Quotes;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class QuoteFile {
    static final String SAVE_FILE_PATH = "C:\\Users\\rla48\\quote_save.txt";
    static final String JSON_FILE_PATH = "C:\\Users\\rla48\\data.json";

    public static void save(byte[] bytes){
        fileSave(bytes, SAVE_FILE_PATH);
    }

    public static void build(byte[] bytes){
        fileSave(bytes, JSON_FILE_PATH);
        System.out.println("data.json 파일의 내용이 갱신되었습니다.");
    }

    public static void setQuotes() {
        if(!isSaveExist())
            return;
        JSONArray arr = fileLoad();
        for(int i= 0; i<arr.length(); i++ ){
            JSONObject obj = (JSONObject) arr.get(i);
            Quotes.add(new Quote(obj));
        }
    }
    private static void fileSave(byte[] bytes, String path){
        try {
            OutputStream output = new FileOutputStream(path);
            output.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static boolean isSaveExist(){
        File file = new File(SAVE_FILE_PATH);
        if(!file.exists())
            return false;
        return true;
    }
    private static JSONArray fileLoad() {
        String json = "";
        try {
            FileInputStream fileStream = null;
            fileStream = new FileInputStream( SAVE_FILE_PATH );
            byte[ ] readBuffer = new byte[fileStream.available()];
            while (fileStream.read( readBuffer ) != -1){}
            json =new String(readBuffer);
            fileStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return new JSONArray(json);
    }

}
