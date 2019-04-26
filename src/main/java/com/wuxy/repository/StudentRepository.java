package com.wuxy.repository;

import com.wuxy.entity.Student;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-25 11:28
 **/
public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(int id);
    public void save(Student student);
    public void update(Student student);
    public void delete(Student student);
}
