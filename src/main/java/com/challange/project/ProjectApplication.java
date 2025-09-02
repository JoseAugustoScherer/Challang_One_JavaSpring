package com.challange.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.challange.project.entities.Order;
import com.challange.project.services.OrderService;

/*
 * José Augusto Scherer - 2025/09/02
 */

@SpringBootApplication
public class ProjectApplication
	implements 
		CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println( "Exemplo 1:" );

		Order order = new Order( 1034, 150.00, 20.00 );
		double total = orderService.total ( order );
		System.out.printf ( "\tPedido código: %d\n", order.getCode() );
		System.out.printf ( "\tValor Total: %.2f\n", total );

		System.out.println( "\nExemplo 2:" );

		Order order2 = new Order( 2282, 800.00, 10.00 );
		double total2 = orderService.total ( order2 );
		System.out.printf ( "\tPedido código: %d\n", order2.getCode() );
		System.out.printf ( "\tValor Total: %.2f\n", total2 );

		System.out.println( "\nExemplo 3:" );

		Order order3 = new Order( 1309, 95.90, 0.00 );
		double total3 = orderService.total ( order3 );
		System.out.printf ( "\tPedido código: %d\n", order3.getCode() );
		System.out.printf ( "\tValor Total: %.2f\n", total3 );
	}

}
