package com.asyf.demo.controller;

import com.asyf.demo.common.Result;
import com.asyf.demo.common.mq.HelloSender;
import com.rabbitmq.client.Channel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Date;

/**
 * http://localhost:15672/#/
 *
 * @Author yjz
 * @Date 2021/8/18 10:17
 */
@RestController
@RequestMapping(value = "/mq2")
@Api(tags = "mq示例2")
@Slf4j
public class MqDemo2Controller {

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


    @RequestMapping(value = "declareQueueTest", method = RequestMethod.GET)
    @ApiOperation(value = "声明队列测试")
    public Object declareQueueTest(String msg) {
        for (int i = 0; i < 100; i++) {
            amqpAdmin.declareQueue(new Queue("declareQueueTest"));
        }
        return Result.success(new Date());
    }

    @PostConstruct
    public void init() throws Exception {
        log.info("init执行");
        String queueName = "hello.queue1";
        amqpAdmin.declareQueue(new Queue(queueName));
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        // 指定要创建的并发消费者数量
        // 默认值为1
        container.setConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.NONE);

//        container.setMessageListener(new MessageListener() {
//            @Override
//            public void onMessage(Message message) {
//                String msg = new String(message.getBody());
//                log.info("2接收消息:{}", msg);
//                try {
//                    //模拟消费时间
//                    Thread.sleep(1000 * 3);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                log.info("2处理消息完成:{}", msg);
//
//            }
//        });

        container.setMessageListener(new ChannelAwareMessageListener() {

            @Override
            public void onMessage(Message message, Channel channel) throws IOException {
                String msg = new String(message.getBody());
                log.info("2接收消息:{}", msg);
                try {
                    //模拟消费时间
                    Thread.sleep(1000 * 60 * 31);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("2处理消息完成:{}", msg);
                // 消费消息时，出现异常，没有返回ack给rabbitmq，则这个消息的状态会变为unacked
                // 等该程序与rabbitmq都断开连接时 这个unacked的消息会重入队列
                // int a = 1 / 0;
                long deliveryTag = message.getMessageProperties().getDeliveryTag();
//                channel.basicAck(deliveryTag, false);
            }
        });
        container.setQueueNames(queueName);
        container.start();
    }
}
