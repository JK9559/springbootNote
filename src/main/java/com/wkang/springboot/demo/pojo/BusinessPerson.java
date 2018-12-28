package com.wkang.springboot.demo.pojo;

import com.wkang.springboot.demo.definition.Animal;
import com.wkang.springboot.demo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author kangwei
 * @date 2018/12/28
 * @Autowired 会根据属性的类型找到对应的Bean进行注入。
 * @Qualifier(value = "dog") 指定了名称和Autowired组合在一起 消除歧义
 */
@Component
public class BusinessPerson implements Person {

    @Autowired
    @Qualifier(value = "dog")
    private Animal animal = null;

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimals(Animal animal) {
        this.animal = animal;
    }
}
