package com.asyf.demo.controller;

import com.asyf.demo.common.Result;
import com.asyf.demo.common.mq.HelloSender;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @Author yjz
 * @Date 2021/8/18 10:17
 */
@RestController
@RequestMapping(value = "/mq")
@Api(tags = "mq示例")
@Slf4j
public class MqDemoController {

    //RabbitMQ系统管理组件，用来声明队列，交换器等
    @Autowired
    private AmqpAdmin amqpAdmin;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private ConnectionFactory connectionFactory;

    @Autowired
    private HelloSender helloSender;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ApiOperation(value = "接口测试")
    public Object demo(String msg) {
        helloSender.send(msg);
        return Result.success(new Date());
    }

    @PostConstruct
    public void init() throws Exception {
        log.info("init执行");
        String queueName = "hello2.queue2";
        amqpAdmin.declareQueue(new Queue(queueName));
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                String msg = new String(message.getBody());
                log.info("1接收消息:{}", msg);
            }
        });
        container.setQueueNames(queueName);
        container.start();
    }
}
