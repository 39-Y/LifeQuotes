package org.example.service;

import org.example.Entity.Quotes;
import org.json.JSONArray;

public class SystemService {
    public String getListToString(){
        return Quotes.getList().toString();
    }
    public JSONArray getListToJsonArray(){
        return new JSONArray(Quotes.getList());
    }
}
