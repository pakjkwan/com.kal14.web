package com.kal.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kal.web.domain.Flight;
import com.kal.web.domain.Route;
import com.kal.web.mapper.RouteMapper;
import com.kal.web.service.RouteService;
@Service
public class RouteServiceImpl implements RouteService{
	@Autowired RouteMapper mapper;

	@Override
	public void addRoute(Flight flight) {
		mapper.addRoute(flight);
	}

	@Override
	public int findNumberOfRoutes(Flight flight) {
		int count;
		count=mapper.findNumberOfRoutes(flight);
		return count;
	}

	@Override
	public Route findRoute(Route route) {
		Route findOne=new Route();
		findOne=mapper.findRoute(route);
		return findOne;
	}

	@Override
	public List<Route> findRoutes(Map<String, Route> paramMap) {
		List<Route> list=new ArrayList<>();
		list=mapper.findRoutes(paramMap);
		return list;
	}

	@Override
	public void updateRoute(Flight flight) {
		mapper.updateRoute(flight);
	}

	@Override
	public void deleteRoute(Flight flight) {
		mapper.deleteRoute(flight);
	}



}