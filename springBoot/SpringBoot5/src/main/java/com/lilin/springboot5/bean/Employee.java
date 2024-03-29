package com.lilin.springboot5.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by LiLin on 2022/03/30/14:27
 */
@Profile("prod")

@Data
@Component
@ConfigurationProperties("person")
public class Employee implements Person {
    private String name;
    private Integer age;
}
