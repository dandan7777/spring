package cn.tedu.config;

import cn.tedu.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("cn.tedu.entity")
public class Config {
    @Bean
    public User bean(){
        User u =new User();
        u.setName("曹操");
        u.setAge(12);
        u.setGender("男");
        return u;

    }

}
