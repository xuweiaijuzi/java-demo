package com.asyf.demo.common.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    private static Logger logger = LoggerFactory.getLogger(HelloSender.class);

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String message) {
        // 消息后处理对象,设置一些消息的参数信息
        MessagePostProcessor messagePostProcessor = new MessagePostProcessor() {

            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                //1.设置message的信息
                // 第二个方法：消息的过期时间 ,5秒之后过期
                message.getMessageProperties().setExpiration("15000");
                //2.返回该消息
                return message;
            }
        };

        rabbitTemplate.convertAndSend("topicExchange", "key.1", message);
//        rabbitTemplate.convertAndSend("topicExchange", "key.1", message, messagePostProcessor);
        //logger.info(String.format("send message: %s", message));
        System.out.println(Thread.currentThread().getName() + " 发送消息:" + message);
    }

}