package com.example.coolweather.db;

/**
 * Created by Administrator on 2017/12/23.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }

}
