package com.camelot.p44camelotbmw.userdetails;

import org.springframework.security.core.userdetails.User;

public class UsersHelper extends User {
    
    private static final long serialVersionUID = 1L;
    
    public UsersHelper(UsersPojo user) {
        super(user.getUsername(), user.getPassword(), user.getListOfGrantedAuthorities());
    }
}