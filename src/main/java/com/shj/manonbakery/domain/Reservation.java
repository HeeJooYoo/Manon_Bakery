package com.shj.manonbakery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//확실치 않아서 깃에 추가안함.
@Entity
public abstract class Reservation {
    @Id @GeneratedValue
    @Column(name = "RESERVATION_NUMBER")
    private int reservation_number;

    @Column(name = "PHONE_NUMBER") //string? int?
    private int phone_number;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRODUCT_NUMBER")
    private int product_number;

    @Column(name = "AMOUNT")
    private int amount;

    @Column(name = "TOTAL_PRICE") //Cart에도 있는데 왜 FK가 안됐지?.. 기억이... 뭔가 차이점이 있었는데..
    private int total_price;

    //Getter Setter
    public int getReservation_number() {
        return reservation_number;
    }

    public void setReservation_number(int reservation_number) {
        this.reservation_number = reservation_number;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}
