package com.kal.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.kal.web.domain.Flight;
import com.kal.web.domain.Route;
@Repository
public interface RouteMapper {
	public void addRoute(Flight flight);
	public int findNumberOfRoutes(Flight flight);
	public Route findRoute(Route route);
	public List<Route> findRoutes(Map<String,Route> paramMap);
	public void updateRoute(Flight flight);
	public void deleteRoute(Flight flight);

}