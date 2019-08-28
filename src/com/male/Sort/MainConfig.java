package com.male.Sort;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:Beans.xml")
@ComponentScan(basePackages = {"com.male.Sort"})
public class MainConfig {
}
