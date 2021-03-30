package com.teja;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class consumer {
    @Autowired
    repo repo;
    @RabbitListener(queues = Rabbitconfig1.QUEUE)
    public void consumeMessageFromQueue(customer customer) {
        repo.save(customer);
    }

}
