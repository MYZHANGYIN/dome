package com.ktjiao.crm.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("输出一条消息。");
    }

    @Test
    public void out() {
        System.out.println("输出信息方法");
    }

    @Test
    public void  test(){
        System.out.println("测试方法");
    }
}
