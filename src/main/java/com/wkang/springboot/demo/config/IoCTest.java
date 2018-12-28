package com.wkang.springboot.demo.config;


import com.wkang.springboot.demo.definition.Person;
import com.wkang.springboot.demo.pojo.BusinessPerson;
import com.wkang.springboot.demo.pojo.User;
import javafx.util.converter.PercentageStringConverter;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author kangwei
 * @date 2018/12/25
 */
public class IoCTest {

    private static Logger log = Logger.getLogger(IoCTest.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = ctx.getBean(BusinessPerson.class);
        person.service();
    }

}
