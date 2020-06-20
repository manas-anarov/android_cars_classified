package com.example.arabakg.model;

public class KvpostovModel {
    private int kvvoditel;
    private int kvpoputka;
    private int kvgruzovik;
    private int kvgruz;


    public KvpostovModel(int kvvoditel,
                         int kvpoputka,
                         int kvgruzovik,
                         int kvgruz
    ){
        this.kvvoditel = kvvoditel;
        this.kvpoputka = kvpoputka;
        this.kvgruzovik = kvgruzovik;
        this.kvgruz = kvgruz;


    }
    public int getKvvoditel() {return kvvoditel;}
    public int getKvpoputka() {return kvpoputka;}
    public int getKvgruzovik() {return kvgruzovik;}
    public int getKvgruz() {return kvgruz;}


}
