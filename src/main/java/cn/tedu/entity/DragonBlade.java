package cn.tedu.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class DragonBlade implements Serializable {
    private String name = "1111";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DragonBlade{" +
                "name='" + name + '\'' +
                '}';
    }
}
