package com.msb.pojo;

public class Test {
    public static void main(String[] args) {
        // 创建实现类的对象（接口不能创建对象）
        Chinese ch = new Chinese();
        System.out.println(ch.AGE);// 访问常量  18
        ch.say();// 调用方法  中国人打招呼：你好！

        // 通过接口实现多态   接口=实现类
        Speak s = new Chinese();
        System.out.println(s.AGE);// 18
        // 表面上调用的是接口的say方法，实际上走入到了实现类的say方法中
        s.say();// 中国人打招呼：你好！
    }
}
