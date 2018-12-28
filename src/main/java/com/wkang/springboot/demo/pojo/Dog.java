package com.wkang.springboot.demo.pojo;

import com.wkang.springboot.demo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author kangwei
 * @date 2018/12/28
 */

@Component

public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("aha this is a dog");
    }
}
