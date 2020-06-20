package com.example.arabakg.model;

public class BrandModel {

    private Integer id_brand;
    private String name;

    public BrandModel(Integer id_brand, String name) {
        this.id_brand = id_brand;
        this.name = name;
    }

    public Integer getId_brand() {
        return id_brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
