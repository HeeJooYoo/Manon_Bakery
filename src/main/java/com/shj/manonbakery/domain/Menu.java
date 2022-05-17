package com.shj.manonbakery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Menu {
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_NUMBER")
    private Long product_number; // int 아닌가?..

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PRODUCT_NAME")
    private String product_name;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "PRODUCT_IMG")
    private String product_img;//이미지 저장이름이 string일테니 stirng?

    @Column(name = "INTRODUCTION")
    private String introduction;

    //Getter Setter
    public Long getProduct_number() {
        return product_number;
    }

    public void setProduct_number(Long product_number) {
        this.product_number = product_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
