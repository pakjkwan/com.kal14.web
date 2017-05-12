package com.kal.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kal.web.domain.Flight;
import com.kal.web.domain.Route;

public interface RouteService {
	public void addRoute(Flight flight);
	public int findNumberOfRoutes(Flight flight);
	public Route findRoute(Route route);
	public List<Route> findRoutes(Map<String,Route> paramMap);
	public void updateRoute(Flight flight);
	public void deleteRoute(Flight flight);

}