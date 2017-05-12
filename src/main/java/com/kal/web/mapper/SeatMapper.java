package com.kal.web.mapper;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.kal.web.domain.Seat;

@Repository
public interface SeatMapper {
	public int findNumberOfSeats(Seat seat) throws Exception;
	public Seat findSeat(Map<String,Seat> map) throws Exception;
	public List<Seat> findSeats(Map<String,Seat> map) throws Exception;
}