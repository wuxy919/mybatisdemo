package com.wuxy.test;

import com.wuxy.entity.User;
import com.wuxy.repository.UserRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-24 17:47
 **/
public class Test {
    public static void main(String[] args) {
        // 加载 MyBatis 配置文件
        InputStream is = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 调用 MyBatis 原生接口执行SQL
        // statement 对应 UserMapper.xml 的 namespace 值 + "." + select标签id的值
//        String statement = "com.wuxy.mapper.UserMapper.get";
//        User user = sqlSession.selectOne(statement, 1);
//        System.out.println(user);

        // 调用自定义的 UserRepository 接口
        UserRepository userRepository = sqlSession.getMapper(UserRepository.class);
        // 新增用户
        User user = new User();
//        user.setId(3);
        user.setUsername("mic");
//        user.setPassword("222222");
        user.setAge(28);
//        int result = userRepository.save(user);
//        int result = userRepository.deleteById(2);
//        int result = userRepository.update(user);
//        List<User> list = userRepository.findAll();
//        for (User user1 : list) {
//            System.out.println(user1);
//        }
//        User user1 = userRepository.findById(1);
//        User user1 = userRepository.findByUsername("mic");
//        User user1 = userRepository.findByAge(28);
//        User user1 = userRepository.findByUsernameAndAge("mic", 28);
//        User user1 = userRepository.findByUser(user);
//        System.out.println(user1);
//        int result = userRepository.count();
//        Integer result = userRepository.getCount();
//        System.out.println(result);
        String name = userRepository.findNameById(1);
        System.out.println(name);
//        sqlSession.commit();
        sqlSession.close();
    }
}
