package com.example.coolweather.db;

/**
 * Created by Administrator on 2017/12/23.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int countyCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public int getCountyCode(){
        return countyCode;
    }
    public void setCountyCode(int countyCode){
        this.countyCode=countyCode;
    }
}
