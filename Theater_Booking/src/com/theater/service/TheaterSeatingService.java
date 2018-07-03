package com.theater.service;

import java.util.List;

import com.theater.layout.TheaterLayout;
import com.theater.layout.TheaterRequest;

public interface TheaterSeatingService {
    
    TheaterLayout getTheaterLayout(String rawLayout);
    
    List<TheaterRequest> getTicketRequests(String ticketRequests);
    
    void processTicketRequests(TheaterLayout layout, List<TheaterRequest> requests);

}
