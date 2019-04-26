package com.wuxy.repository;

import com.wuxy.entity.Goods;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-25 18:45
 **/
public interface GoodsRepository {
    public List<Goods> findAll();
    public Goods findById(int id);
    public void save(Goods customer);
    public void update(Goods customer);
    public void delete(int id);
}
