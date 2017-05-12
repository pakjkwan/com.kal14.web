package com.kal.web.service;

import java.util.List;
import java.util.Map;


import com.kal.web.domain.Flight;

public interface FlightService {
	public void addFlight(Flight flight);
	public int findNumberOfFlights(Flight flight);
	public Flight findFlight(Flight flight);
	public List<Flight> findFlights(Map<String,Flight> paramMap); 
	public void updateFlight(Flight flight);
	public void deleteFlight(Flight flight);

}