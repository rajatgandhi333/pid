package com.pid.rsg.service;

import com.pid.rsg.config.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    /***
     * This would be used to connect to cosmos database
     */
    private DBConfig dbConfig;


    @Autowired
    public DatabaseService(DBConfig dbConfig) {
        this.dbConfig = dbConfig;
    }
    

}
