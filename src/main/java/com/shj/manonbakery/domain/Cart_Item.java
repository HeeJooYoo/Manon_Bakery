package com.shj.manonbakery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//git에 추가안함
@Entity
public abstract class Cart_Item {
    @Id @GeneratedValue
    @Column(name = "CART_ITEM_NUMBER")
    private int cart_item_number; // long? int?

    @Column(name = "COOKIE_ID")
    private String cookie_id;

    @Column(name = "PRODUCT_NUMBER")
    private int product_number;

    @Column(name = "AMOUNT")
    private int amount;

    //Getter Setter

    public int getCart_item_number() {
        return cart_item_number;
    }

    public void setCart_item_number(int cart_item_number) {
        this.cart_item_number = cart_item_number;
    }

    public String getCookie_id() {
        return cookie_id;
    }

    public void setCookie_id(String cookie_id) {
        this.cookie_id = cookie_id;
    }

    public int getProduct_number() {
        return product_number;
    }

    public void setProduct_number(int product_number) {
        this.product_number = product_number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
