package com.wuxy.test;

import com.wuxy.entity.Goods;
import com.wuxy.repository.GoodsRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: wuxy
 * @create: 2019-04-25 18:50
 **/
public class Test4 {
    public static void main(String[] args) {
        // 加载 MyBatis 配置文件
        InputStream is = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GoodsRepository goodsRepository = sqlSession.getMapper(GoodsRepository.class);
        Goods goods = goodsRepository.findById(3);
        System.out.println(goods);
        sqlSession.close();
    }
}
