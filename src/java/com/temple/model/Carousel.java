/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.model;


public class Carousel {
   
    private int id;
   
    private String file;
     private String status;

    public Carousel() {
    }

    public Carousel(int id,  String file,String status) {
        this.id = id;
        
        this.file = file;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
