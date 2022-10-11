package com.example.dinninghall;

import com.example.dinninghall.entity.Waiter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import java.net.URISyntaxException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DinningHallApplication {

    public static void main(String[] args) throws URISyntaxException {
        SpringApplication.run(DinningHallApplication.class, args);
        
        // final Thread waiter1 = new Thread(new Waiter("waiter1"));
        // final Thread waiter2 = new Thread(new Waiter("waiter2"));
        
        // waiter1.start();
        // waiter2.start();

        for (int i = 0; i < 5; i++) {
            new Thread(new Waiter("waiter"+i)).start();;
        }
    }

}
