package com.example.arabakg.model;
/**
 * Created by samuray on 9/27/18.
 */

public class User {
    private int id;
    private String email;
    private String username;
    private String token;



    private String key;
    private String password;
    private String first_name;
    private String name;



    public User(int id,
                    String email,
                    String username,
                    String token,
                    String key,
                    String password,
                    String first_name,
                    String name
    ) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.token = token;
        this.key = key;
        this.password = password;
        this.first_name = first_name;
        this.name = name;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }



    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }


    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getFirst_name(){
        return first_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
