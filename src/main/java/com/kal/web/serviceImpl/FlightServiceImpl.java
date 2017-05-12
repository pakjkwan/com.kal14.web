package com.kal.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kal.web.domain.Flight;
import com.kal.web.mapper.FlightMapper;
import com.kal.web.service.FlightService;
@Service
public class FlightServiceImpl implements FlightService{
	@Autowired FlightMapper mapper;

	@Override
	public void addFlight(Flight flight) {
		mapper.addFlight(flight);
	}

	@Override
	public int findNumberOfFlights(Flight flight) {
		int number=0;
		number=mapper.findNumberOfFlights(flight);
		return number;
	}

	@Override
	public Flight findFlight(Flight flight) {
		Flight findOne=new Flight();
		findOne=mapper.findFlight(flight);
		return findOne;
	}

	@Override
	public List<Flight> findFlights(Map<String, Flight> paramMap) {
		List<Flight> list=new ArrayList<>();
		list=mapper.findFlights(paramMap);
		return list;
	}

	@Override
	public void updateFlight(Flight flight) {
		mapper.updateFlight(flight);
		
	}

	@Override
	public void deleteFlight(Flight flight) {
		mapper.deleteFlight(flight);
	}
	


}