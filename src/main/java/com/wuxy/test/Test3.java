package com.wuxy.test;

import com.wuxy.entity.Customer;
import com.wuxy.repository.CustomerRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: wuxy
 * @create: 2019-04-25 18:41
 **/
public class Test3 {
    public static void main(String[] args) {
        // 加载 MyBatis 配置文件
        InputStream is = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
        Customer customer = customerRepository.findById(1);
        System.out.println(customer);
        sqlSession.close();
    }
}
