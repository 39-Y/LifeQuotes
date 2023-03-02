package org.example.domain;

import java.util.HashMap;
import java.util.Map;

public class Req {
    public static String getAction(String commend){
        String[] splits = commend.split("\\?",2);
        return splits[0];
    }
    public static Map getParam(String commend){
        Map map = new HashMap<>();

        String[] split= commend.split("[?]", 2);
        String[] params = split[1].split("[&]");

        for(String param: params){
            String[] key_value = param.split("[=]",2);
            map.put(key_value[0], key_value[1]);
        }
        return map;
    }
    public static int getId(String commend){
        String id = (String) getParam(commend).get("id");
        return Integer.parseInt(id);
    }
}
