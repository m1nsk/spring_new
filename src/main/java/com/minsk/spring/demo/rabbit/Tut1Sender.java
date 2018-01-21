package com.minsk.spring.demo.rabbit;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Tut1Sender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    public void send() {
        String message = "Hello World!";
        this.template.convertAndSend(queue.getName(), message);
        System.out.println(" [x] Sent '" + message + "'");
    }

    public void sendVisit(String visit) {
        this.template.convertAndSend(queue.getName(), visit);
        System.out.println(" [x] Sent '" + visit + "'");
    }
}
