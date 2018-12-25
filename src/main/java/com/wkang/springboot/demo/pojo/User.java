package com.wkang.springboot.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author kangwei
 * @date 2018/12/25
 * @Component 表名这个类 将被Spring IoC容器扫描装配，其中配置的user是作为Bean的名称，如果不配置这个字符串
 * 那么IoC容器就会把类名的第一个字母作为小写，其他不变作为Bean的名称放入到IoC容器中。
 * @Value 是指定具体的值，使得Spring IoC给予相应的属性注入对应的值。
 */
@Component("user")
public class User {

    @Value("1")
    private Long id;
    @Value("user_name_1")
    private String name;
    @Value("user_note_1")
    private String note;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getNote() {
        return note;
    }
}
