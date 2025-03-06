package com.devsuperior.exercicio1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.exercicio1.entites.Order;
import com.devsuperior.exercicio1.service.OrderService.OrderService;

@SpringBootApplication
public class Exercicio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Código do pedido: " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
		
	}

}
