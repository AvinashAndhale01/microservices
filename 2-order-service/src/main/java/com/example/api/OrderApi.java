package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.OrderDetails;
import com.example.service.OrderService;

@RestController
public class OrderApi {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/testDemo1")
	public String demo() {
		System.out.println("Order service working");
		return "Order service working";
	}
	
	@GetMapping("/testorder")
	public ResponseEntity<String> testOrder() {
		String url = "http://localhost:8100/test";
		// communicate with product catalogue
		RestTemplate template = new RestTemplate();
		String msg = template.getForObject(url, String.class);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}	

	@GetMapping("order/{pid}/{quantity}")
	public ResponseEntity<OrderDetails> order(@PathVariable int pid, @PathVariable int quantity) {
		OrderDetails orderDetails = orderService.order(pid, quantity);
		return new ResponseEntity<OrderDetails>(orderDetails, HttpStatus.OK);
	}
	
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("orderLoadBal/{pid}/{quantity}")
	public ResponseEntity<OrderDetails> orderWithLoadBal(@PathVariable  int pid,@PathVariable  int quantity){
		String url="http://product-catalogue/products/"+pid;
		OrderDetails orderDetails=restTemplate.getForObject(url, OrderDetails.class);
		return new ResponseEntity<OrderDetails>(orderDetails,HttpStatus.OK);
	}
}