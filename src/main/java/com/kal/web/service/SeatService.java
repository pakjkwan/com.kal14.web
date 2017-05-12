package com.kal.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.kal.web.domain.Seat;


public interface SeatService {
	public int findNumberOfSeats(Seat seat) throws Exception;
	public Seat findSeat(Map<String, Seat> map) throws Exception;
	public List<Seat> findSeats(Map<String, Seat> map) throws Exception;
}