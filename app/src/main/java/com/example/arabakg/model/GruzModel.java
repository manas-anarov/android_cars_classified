package com.example.arabakg.model;

public class GruzModel {

    private Integer id;
    private String timestamp;
    private String data_otpravleniya;
    private String updated;
    private Integer ves_gruza;
    private Integer cena_uslugi;
    private String commentariy;
    private Napravlenie napravlenie;
    private Mestopolojenie mestopolojenie;
    private Integer id_author;
    private String name;
    private String phone;
    private String image;


    public GruzModel(Integer id,
                     String timestamp,
                     String data_otpravleniya,
                     String updated,
                     Integer ves_gruza,
                     Integer cena_uslugi,
                     String commentariy,
                     Napravlenie napravlenie,
                     Mestopolojenie mestopolojenie,
                     Integer id_author,
                     String name,
                     String phone,
                     String image

        ) {
        this.id = id;
        this.timestamp = timestamp;
        this.data_otpravleniya = data_otpravleniya;
        this.updated = updated;
        this.ves_gruza = ves_gruza;
        this.cena_uslugi = cena_uslugi;
        this.commentariy = commentariy;
        this.napravlenie = napravlenie;
        this.mestopolojenie = mestopolojenie;
        this.id_author = id_author;
        this.name = name;
        this.phone = phone;
        this.image = image;
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
    public Integer getVes_gruza() {
        return ves_gruza;
    }
    public Integer getCena_uslugi() { return cena_uslugi; }
    public String getCommentariy() {
        return commentariy;
    }

    public Napravlenie getNapravlenie() {
        return napravlenie;
    }
    public Mestopolojenie getMestopolojenie() {
        return mestopolojenie;
    }
    public Integer getId_author() {
        return id_author;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getImage() {
        return image;
    }

}