package com.wuxy.repository;

import com.wuxy.entity.Classes;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-25 13:38
 **/
public interface ClassesRepository {
    public List<Classes> findAll();
    public Classes findById(int id);
    public void save(Classes classes);
    public void update(Classes classes);
    public void deleteById(int id);
}
