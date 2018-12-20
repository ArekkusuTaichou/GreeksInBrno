package com.kolydas.greeksinbrno.Models;

public class Model {

    private String name;
    private String title;
    private String web;
    private String email;
    private String phone;
    private String desc;

    public Model(String name, String title, String web,String email,String phone,String desc) {
        this.name = name;
        this.title = title;
        this.web = web;
        this.email=email;
        this.phone=phone;
        this.desc=desc;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getWeb() {
        return web;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public String getDesc(){
        return  desc;
    }

}
