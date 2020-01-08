package com.example.mockitoonspringbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private NameService nameService;

    @Autowired
    public UserService(NameService nameService){
        this.nameService = nameService;
    }

    public String getUserName(String id){
        return nameService.getUserName(id);
    }

}
