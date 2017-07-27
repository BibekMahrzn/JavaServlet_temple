/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.model;

/**
 *
 * @author DELL
 */
public class Login {
    private int lid;
    private String username;
    private String password;

    public Login() {
    }

    public Login(int lid, String username, String password) {
        this.lid = lid;
        this.username = username;
        this.password = password;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
