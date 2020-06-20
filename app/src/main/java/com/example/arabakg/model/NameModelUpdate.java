package com.example.arabakg.model;



public class NameModelUpdate {

    private String phone;
    private String name;


    public NameModelUpdate(
            String phone,
                     String name

    ) {
        this.phone = phone;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }


}
