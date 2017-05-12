package com.kal.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.kal.web.domain.Seat;
import com.kal.web.mapper.SeatMapper;
import com.kal.web.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService{
@Autowired SeatMapper mapper;

	@Override 
	public int findNumberOfSeats(Seat seat) throws Exception {
		int temp = 0;
		temp=mapper.findNumberOfSeats(seat);
		return temp;
	}

	@Override
	public Seat findSeat(Map<String, Seat> map) throws Exception {
		Seat seat = new Seat();
		seat=mapper.findSeat(map);
		return seat;
	}

	@Override
	public List<Seat> findSeats(Map<String, Seat> map) throws Exception {
		List<Seat> seat = new ArrayList<Seat>();
		return seat;
	}
}