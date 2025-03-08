package com.devsuperior.exercicio1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.exercicio1.entites.Order;
import com.devsuperior.exercicio1.service.ShippingService.ShippingService;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total (Order order) {
		double basic = order.getBasic();
		double tax = order.getDiscount() / 100.0;
		double withDiscount = basic - basic * tax;
		
		return withDiscount + shippingService.shipment(order);
		
	
		
	}
}
