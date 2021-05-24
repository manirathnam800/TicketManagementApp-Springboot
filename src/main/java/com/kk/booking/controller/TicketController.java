package com.kk.booking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.booking.model.Ticket;
import com.kk.booking.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketController {

	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}


	@GetMapping(value="/ticket/all")
	public Iterable<Ticket> getTicketAll() {
		return ticketBookingService.geTicketAll();
	}
	

	@DeleteMapping(value="/ticket/{ticketId}")
	public void deleteTicketById(@PathVariable ("ticketId")Integer ticketId) {
		 ticketBookingService.deleteTicketById(ticketId);
	}
	
}
