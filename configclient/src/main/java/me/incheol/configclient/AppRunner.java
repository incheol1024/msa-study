package me.incheol.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("${my.favorite.food}")
    String food;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("========================================");
        System.out.println(food);
        System.out.println("========================================");
    }
}
