package com.example.arabakg.model;


public class MoneyModel {
    private Integer money_id;
    private String name;


    public MoneyModel(
            Integer money_id,
            String name
    ) {

        this.money_id = money_id;
        this.name = name;

    }


    public Integer getMoney_id() {
        return money_id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }


}

