package com.dsa.lab4;

import org.apache.log4j.Logger;
import java.util.HashMap;
/**
 * Created by Home on 14/03/2017.
 */
public class Factory {
    private static Factory ourInstance = new Factory();
    private static Logger log = Logger.getLogger(Factory.class);
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
            log.info("Creating new instance of: " + cmd);
        }
        else log.info("Running from cache instance: " + cmd);
        return command;
    }
}
