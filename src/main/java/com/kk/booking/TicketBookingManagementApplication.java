package com.kk.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kk.booking.model.Ticket;
import com.kk.booking.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementApplication.class, args);
	
	TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
	
	Ticket ticket = new Ticket();
	
	ticket.setTicketId(1);
	ticket.setPassengerName("Manish");
	ticket.setSourceLocation("Chennai");
	ticket.setDestinationLocation("California");
	ticket.setEmail("manirathnam511@gmail.com");
	
	ticketBookingService.createTicket(ticket);
	
	}

}
