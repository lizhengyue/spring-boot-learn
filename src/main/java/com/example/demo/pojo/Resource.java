package com.example.demo.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.example.demo.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {
    private String name;
    private String website;
    private String language;

}
