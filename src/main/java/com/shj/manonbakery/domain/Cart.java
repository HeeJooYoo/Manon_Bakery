package com.shj.manonbakery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract  class Cart {
    @Id @GeneratedValue
    @Column(name = "COOKIE_ID")
    private String cookie_id; // 구글링해보니 string으로 저장하긴함.

    @Column(name = "TOTAL_PRICE")
    private int total_price;
}
