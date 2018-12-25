package com.wkang.springboot.demo.service;

import com.wkang.springboot.demo.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author kangwei
 * @date 2018/12/25
 * @Service 该标准注入了@Component 默认情况下会被扫描到装配到IoC容器中
 */

@Service
public class UserService {

    public void printUser(User user) {
        System.out.println("编号:" + user.getId());
        System.out.println("姓名:" + user.getName());
        System.out.println("备注:" + user.getNote());
    }

}
