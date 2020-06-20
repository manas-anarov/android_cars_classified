package com.example.arabakg.model;

public class Napravlenie
{
    private Integer id;

    private Integer gorod_type;

    private String oblast;

    private String name;

    private String name_two;

    private String gorod_id;

    private String rayon;

    public Integer getId ()
    {
        return id;
    }

    public void setId (Integer id)
    {
        this.id = id;
    }

    public Integer getGorod_type ()
    {
        return gorod_type;
    }

    public void setGorod_type (Integer gorod_type)
    {
        this.gorod_type = gorod_type;
    }

    public String getOblast ()
    {
        return oblast;
    }

    public void setOblast (String oblast)
    {
        this.oblast = oblast;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName_two ()
    {
        return name_two;
    }

    public void setName_two (String name_two)
    {
        this.name_two = name_two;
    }

    public String getGorod_id ()
    {
        return gorod_id;
    }

    public void setGorod_id (String gorod_id)
    {
        this.gorod_id = gorod_id;
    }

    public String getRayon ()
    {
        return rayon;
    }

    public void setRayon (String rayon)
    {
        this.rayon = rayon;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", gorod_type = "+gorod_type+", oblast = "+oblast+", name = "+name+", name_two = "+name_two+", gorod_id = "+gorod_id+", rayon = "+rayon+"]";
    }
}
