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
        // 打印对象的信息
        System.out.println("女孩名字:"+g.getName()+",女孩的男朋友的名字是："+g.getBoyfriend().getName());
    }
}
