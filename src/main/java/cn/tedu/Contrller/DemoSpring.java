package cn.tedu.Contrller;

import cn.tedu.config.Config;
import cn.tedu.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class DemoSpring {
    public static void main(String[] args) {
//        实例化spring容器
        AnnotationConfigApplicationContext acac=
                new AnnotationConfigApplicationContext(
                        Config.class);
//        从容器中获取对象
        User user = acac.getBean("bean", User.class);
        System.out.println(user);

    }
}
