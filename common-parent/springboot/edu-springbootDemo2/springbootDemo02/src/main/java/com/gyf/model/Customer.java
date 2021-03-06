package com.gyf.model;

public class Customer {
    private Integer id;
    private String name;
    private String tel;

    public Customer(Integer id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
