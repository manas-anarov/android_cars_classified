//package com.example.samuray.myapplication.api;


package com.example.arabakg.model;





public class CarModel {
    private Integer id;

    private Integer brand;
    private String title;
    private String text;
    private Integer price;
    private String car_pic;
    private String car_pic2;
    private String car_pic3;
    private Integer currency;
    private Integer year;
    private Integer city;


    public CarModel(Integer id,
                    Integer brand,
                    String title,
                    String text,
                    Integer price,
                    String car_pic,
                    String car_pic2,
                    String car_pic3,
                    Integer currency,
                    Integer year,
                    Integer city
    ) {
        this.id = id;

        this.brand = brand;
        this.title = title;
        this.text = text;
        this.price = price;
        this.car_pic = car_pic;
        this.car_pic2 = car_pic2;
        this.car_pic3 = car_pic3;
        this.currency = currency;
        this.year = year;
        this.city = city;
    }

    public Integer getId() {return id;}
}