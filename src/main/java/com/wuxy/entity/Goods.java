package com.wuxy.entity;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-25 14:14
 **/
public class Goods {
    private int id;
    private String name;
    private List<Customer> customers;

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

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
