package com.gyf.backoffice.model;

public class Customer {
    private String name;
    private Float price;
    private String pic;
    private String detail;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
