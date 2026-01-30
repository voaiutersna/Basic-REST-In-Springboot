package com.skibidop.temp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty()


    private String name;
    private int age;

    public User(){
        this.name = null;
        this.age = 0;
    }

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }


}

//./mvnw spring-boot:run