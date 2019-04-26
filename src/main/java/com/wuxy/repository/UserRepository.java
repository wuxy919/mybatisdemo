package com.wuxy.repository;

import com.wuxy.entity.User;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-24 18:28
 **/
public interface UserRepository {

    /**
     * 新增用户
     * @param user
     * @return
     */
    public int save(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int deleteById(int id);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public int update(User user);

    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    public User findById(int id);

    /**
     * 查询全部用户
     * @return
     */
    public List<User> findAll();

    /**
     * 通过username查询User
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 通过age查询User
     * @param age
     * @return
     */
    public User findByAge(Integer age);

    /**
     * 通过uername和age查询User
     * @param username
     * @param age
     * @return
     */
    public User findByUsernameAndAge(String username, int age);

    /**
     * 通过uUser封装对象查询User
     * @param user
     * @return
     */
    public User findByUser(User user);

    /**
     * 统计User总数
     * @return
     */
    public int count();

    /**
     * 统计User总数
     * @return
     */
    public Integer getCount();

    /**
     * 通过id查询username
     * @param id
     * @return
     */
    public String findNameById(int id);

    public List<User> findByIds(User user);

}
