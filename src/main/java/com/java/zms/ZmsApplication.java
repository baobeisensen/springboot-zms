package com.java.zms;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan({"com.java.zms.Dao","com.java.zms.Service"})
@MapperScan({"com.java.zms.Dao"})
public class ZmsApplication {
   static Logger log  = LoggerFactory.getLogger(ZmsApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(ZmsApplication.class, args);
    }
}
