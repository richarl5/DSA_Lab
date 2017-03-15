package com.dsa.lab4;

import java.util.HashMap;
import java.util.ResourceBundle;
/**
 * Created by Home on 15/03/2017.
 */
public class I18nManager {
    private static I18nManager ourInstance = new I18nManager();
    private HashMap<String, ResourceBundle> cache;

    public static I18nManager getInstance() {
        return ourInstance;
    }

    private I18nManager() {this.cache = new HashMap<String,ResourceBundle>();}

    public String getData(String key, String language) throws Exception {
        String valor;
        ResourceBundle data = this.cache.get(language);
        if (data == null){
            data = ResourceBundle.getBundle("com.dsa.lab4." + language);
            valor = data.getString(key);
            this.cache.put(language,data);
        }
        else valor = data.getString(key);
        return valor;
    }
}
