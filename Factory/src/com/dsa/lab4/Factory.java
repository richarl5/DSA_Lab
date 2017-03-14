package com.dsa.lab4;

import java.util.HashMap;
/**
 * Created by Home on 14/03/2017.
 */
public class Factory {
    private static Factory ourInstance = new Factory();
    private HashMap<String, Command> cache;
    public static Factory getInstance() {
        return ourInstance;
    }

    private Factory() {
        this.cache = new HashMap<String,Command>();
    }

    public Command getComand (String cmd) throws Exception {
        Command command = this.cache.get(cmd);
        if(command == null){
            Class c = Class.forName("com.dsa.lab4." + cmd);
            command = (Command) c.newInstance();
            this.cache.put(cmd,command);
        }
        return command;
    }
}
