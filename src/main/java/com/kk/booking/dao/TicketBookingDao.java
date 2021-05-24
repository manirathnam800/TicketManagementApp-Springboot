package com.kk.booking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kk.booking.model.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {

}
