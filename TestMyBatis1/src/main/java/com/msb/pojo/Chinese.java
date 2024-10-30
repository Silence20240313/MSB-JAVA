package com.msb.pojo;

// 实现类实现了接口，实现具体的规则
public class Chinese implements Speak {

    // 重写
    @Override
    public void say() {
        System.out.println("中国人打招呼：你好！");
    }
}
