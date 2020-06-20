package com.example.arabakg.model;


public class PoputkaModelUpdate {

    private Integer id;
    private String timestamp;
    private String data_otpravleniya;
    private String updated;
    private Integer kolichechestvo_mesta;
    private Integer cena_uslugi;
    private String commentariy;
    private Integer mestopolojenie;
    private Integer napravlenie;


    public PoputkaModelUpdate(Integer id,
                              String timestamp,
                              String data_otpravleniya,
                              String updated,
                              Integer kolichechestvo_mesta,
                              Integer cena_uslugi,
                              String commentariy,
                              Integer mestopolojenie,
                              Integer napravlenie

    ) {
        this.id = id;
        this.timestamp = timestamp;
        this.data_otpravleniya = data_otpravleniya;
        this.updated = updated;
        this.kolichechestvo_mesta = kolichechestvo_mesta;
        this.cena_uslugi = cena_uslugi;
        this.commentariy = commentariy;
        this.napravlenie = napravlenie;
        this.mestopolojenie = mestopolojenie;
    }

    public Integer getId() {return id;}
    public String getTimestamp() {
        return timestamp;
    }
    public String getData_otpravleniya() {
        return data_otpravleniya;
    }
    public String getUpdated() {
        return updated;
    }
    public Integer getKolichechestvo_mesta() {
        return kolichechestvo_mesta;
    }
    public Integer getCena_uslugi() { return cena_uslugi; }
    public String getCommentariy() {
        return commentariy;
    }
    public Integer getMestopolojenie() {
        return mestopolojenie;
    }
    public Integer getNapravlenie() {
        return napravlenie;
    }


}
