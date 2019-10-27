package com.gyf;

import com.gyf.controller.UserController;
import com.gyf.dbconfig.DBConfig1;
import com.gyf.dbconfig.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@MapperScan(basePackages = "com.gyf.mapper")
//@ComponentScan(basePackages = {"com.gyf.controller","com.gyf.service","com.gyf.test1","com.gyf.test2","com.gyf.datasource"})
@ComponentScan(basePackages = "com.gyf")
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
