/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.model;

/**
 *
 * @author Dell PC
 */
public class Worship {
    private int wid;
    private String pujaName;
    private String pujaBy;
    private String pujaTime;
    
    
    public Worship(){
    
}
    
    public Worship(int wid,String pujaName,String pujaBy,String pujaTime){
        this.wid=wid;
        this.pujaName=pujaName;
        this.pujaBy=pujaBy;
        this.pujaTime=pujaTime;
    }
    
    public int getWid(){
        return wid;
    }
    
    public void setWid(int wid){
        this.wid=wid;
    }
    
    public String getPujaName(){
        return pujaName;
    }
    
    public void setPujaName(String pujaName){
        this.pujaName=pujaName;
    }
    
    public String getPujaBy(){
        return pujaBy;
    }
    
    public void setPujaBy(String pujaBy){
        this.pujaBy=pujaBy;
    }
    
    public String getPujaTime(){
        return pujaTime;
    }
    
    public void setPujaTime(String pujaTime){
        this.pujaTime=pujaTime;
    }
    
    
}