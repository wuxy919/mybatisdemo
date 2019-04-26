package com.wuxy.repository;

import com.wuxy.entity.Customer;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-25 14:16
 **/
public interface CustomerRepository {
    public List<Customer> findAll();
    public Customer findById(int id);
    public void save(Customer customer);
    public void update(Customer customer);
    public int saveGoods(int cid, int gid);
    public int clearGoods(int cid);
    public void deleteById(int id);
}
