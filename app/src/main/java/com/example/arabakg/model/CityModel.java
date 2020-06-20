package com.example.arabakg.model;


public class CityModel {
    private Integer id;
    private Integer gorod_id;
    private String name;


    public CityModel(
                    Integer id,
                      Integer gorod_id,
                      String name
    ) {
        this.id = id;
        this.gorod_id = gorod_id;
        this.name = name;

    }


    public Integer getGorod_id() {
        return gorod_id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }


}

