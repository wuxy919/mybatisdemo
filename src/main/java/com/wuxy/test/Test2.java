package com.wuxy.test;

import com.wuxy.entity.Classes;
import com.wuxy.entity.Student;
import com.wuxy.repository.ClassesRepository;
import com.wuxy.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-25 11:32
 **/
public class Test2 {
    public static void main(String[] args) {
        // 加载 MyBatis 配置文件
        InputStream is = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取实现接口的代理对象
        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);

        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        Classes classes = classesRepository.findById(2);
//        System.out.println(classes);

//        Student student = studentRepository.findById(5);
//        student.setClasses(classes);
//        System.out.println(student);

//        Student student = new Student();
//        student.setName("tom");
//        student.setClasses(classes);
//        studentRepository.save(student);
//        studentRepository.update(student);
//        studentRepository.delete(student);

//        List<Student> list = studentRepository.findAll();
//        for (Student student : list) {
//            System.out.println(student);
//        }
//        System.out.println("添加之前------------");
//        List<Classes> list = classesRepository.findAll();
//        for (Classes classes : list) {
//            System.out.println(classes);
//        }
//        System.out.println("添加之后------------");
//        Classes classes = new Classes();
//        classes.setName("五班");
//        classesRepository.save(classes);
//        List<Classes> list1 = classesRepository.findAll();
//        for (Classes classes1 : list1) {
//            System.out.println(classes1);
//        }
        Classes classes = classesRepository.findById(5);
        List<Student> list = classes.getStudents();
        for (Student student : list) {
            studentRepository.delete(student);
        }

        classesRepository.deleteById(5);
        sqlSession.commit();
        sqlSession.close();
    }
}
