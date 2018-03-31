package com.sourcey.materiallogindemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by geetikag on 30/3/2018 AD.
 */

public class LoginMap {
    private static Map<String,String> login = new HashMap<>();

    public static boolean  addUser(String username, String pass){
        if(login.containsKey(username))
            return false;
        else
            login.put(username,pass);
        return true;
    }
    public static String  getPassword(String user){
        if(login.containsKey(user))
            return login.get(user);

        return "";
    }

}
