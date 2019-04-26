package com.wuxy.entity;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-25 14:13
 **/
public class Customer {
    private int id;
    private String name;
    private List<Goods> goods;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", goods=" + goods +
                '}';
    }
}
