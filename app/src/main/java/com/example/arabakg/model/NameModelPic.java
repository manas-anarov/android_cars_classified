


package com.example.arabakg.model;



public class NameModelPic {
    private String phone;
    private String name;
    String model_pic;


    public NameModelPic(
                     String phone,
                     String name,
                     String foto,
                     Integer fotoid,
                     String model_pic
    )
    {
        this.phone = phone;
        this.name = name;
        this.model_pic = model_pic;
    }

    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public String getModel_pic() {
        return model_pic;
    }

}
