package com.kk.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kk.booking.dao.TicketBookingDao;
import com.kk.booking.model.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingDao  ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}

	public Optional<Ticket> getTicketById(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBookingDao.findById(ticketId);
	}


	public Iterable<Ticket> geTicketAll() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicketById(Integer ticketId) {
		  ticketBookingDao.deleteById(ticketId);
	}

	

}
