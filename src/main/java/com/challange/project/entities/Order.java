package com.challange.project.entities;

/*
 * José Augusto Scherer - 2025/09/02
 */

public class Order {

    private Integer code;
    private double basic;
    private double discount;

    public Order() {
    }

    public Order(Integer code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public double getBasic() {
        return basic;
    }

    public double getDiscount() {
        return discount;
    }

    public double total() {
        return basic - (basic * discount);
    }
}
