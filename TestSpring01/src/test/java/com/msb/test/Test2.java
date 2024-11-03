package com.msb.test;

import com.msb.pojo.Boy;
import com.msb.pojo.Girl;

public class Test2 {
    public static void main(String[] args) {
        // 男孩
        Boy b = new Boy();
        b.setAge(27);
        b.setName("小刚");
        // 女孩
        Girl g = new Girl();
        g.setAge(25);
        g.setName("丽丽");
        g.setBoyfriend(b);

        // 业务-打印
        System.out.println("女孩" + g.getName() + "和男孩" + g.getBoyfriend().getName() + "在谈恋爱");
    }
}
