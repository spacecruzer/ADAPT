package com.teja;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class controller {
	@Autowired
	customer customer;
	
	@Autowired
	private RabbitTemplate template;
 @Autowired
 private repo repo;
	@PostMapping("/m")
	public customer createOrder(@RequestBody customer customer ,@RequestParam("exchangename")String exchange, @RequestParam("routingkey")String key) {
		template.convertAndSend(exchange,
				key,customer);
		return customer;
		
	}
	@GetMapping("/get")
    public List<customer> get() {
		return repo.findAll();
	}
}
