package org.example.Entity;

import org.json.JSONObject;

public class Quote {
    static int main_id=0;
    int id;
    String quote;
    String author;


    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
        id = ++main_id;
    }

    public Quote(JSONObject object){
        this.quote = object.getString("quote");
        this.author = object.getString("author");
        id = object.getInt("id");
        main_id = id;
    }

    public int getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"quote\":\"" + quote + '\"' +
                ", \"author\":\"" + author + '\"' +
                '}';
    }
}
