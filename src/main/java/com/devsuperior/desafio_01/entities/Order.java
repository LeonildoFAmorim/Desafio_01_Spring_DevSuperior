package com.devsuperior.desafio_01.entities;

public class Order {
    private Integer code;
    private Double basic;
    private Double descount;

    public Order() {
    }

    public Order(Integer code, Double basic, Double descount) {
        this.code = code;
        this.basic = basic;
        this.descount = descount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDescount() {
        return descount;
    }

    public void setDescount(Double descount) {
        this.descount = descount;
    }
}
