package com.sunhu.web.other;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/24.
 */
@Component
@EnableAsync//启用异步
public class TestEnable {

    @Async
    public void show(){
        for (int i = 0; i < 10; i++) {
            System.out.println("============"+i);
        }
    }
}
