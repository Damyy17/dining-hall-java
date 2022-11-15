package com.example.dinninghall;

import com.example.dinninghall.entity.Waiter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DinningHallApplication {

    public static void main(String[] args){
        SpringApplication.run(DinningHallApplication.class, args);

        for (int i = 0; i < 5; i++) {
            Thread waiter = new Thread(new Waiter("waiter"+i));
            waiter.start();
        }
    }

}
