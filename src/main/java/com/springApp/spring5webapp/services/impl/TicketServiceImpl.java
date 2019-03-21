package com.springApp.spring5webapp.services.impl;


import com.springApp.spring5webapp.model.Ticket;
import com.springApp.spring5webapp.repositories.TicketRepository;
import com.springApp.spring5webapp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;


    @Override
    public List<Ticket> getAllTicket(){
        List<Ticket> ticketList = ticketRepository.findAll();
        return ticketList;
    }
}