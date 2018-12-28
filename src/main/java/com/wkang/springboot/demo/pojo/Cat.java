package com.wkang.springboot.demo.pojo;

import com.wkang.springboot.demo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author kangwei
 * @date 2018/12/28
 * @Primary 告诉了Spring IoC容器 当发现有多个类型的Bean时，优先使用Primary标注的进行注入
 * 但是如果同样类型的多个类都使用了这个标注 则依旧混乱 找不到相应的类型
 */
@Component
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("ha this is a cat");
    }
}
