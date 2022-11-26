package com.asyf.demo;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableSwagger2
public class RabbitmqDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(RabbitmqDemoApplication.class, args);
        System.out.println("http://localhost:8080/doc.html");
    }


}
