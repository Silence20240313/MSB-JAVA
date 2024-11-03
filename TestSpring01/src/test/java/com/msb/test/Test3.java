package com.msb.test;

import com.msb.pojo.Book;
import com.msb.pojo.Boy;
import com.msb.pojo.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        // 创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        Girl g = (Girl)context.getBean("girl");
        System.out.println(g.getAge());
        System.out.println(g.getName());
        System.out.println(g.getBoyfriend().getAge());
        System.out.println(g.getBoyfriend().getName());
    }
}
