package com.kal.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kal.web.domain.Flight;
import com.kal.web.domain.Schedule;
import com.kal.web.mapper.ScheduleMapper;
import com.kal.web.service.ScheduleService;
@Service
public class ScheduleServiceImpl implements ScheduleService{
	@Autowired ScheduleMapper mapper;

	@Override
	public void addSchedule(Flight flight) {
		mapper.addSchedule(flight);
	}

	@Override
	public int findNumberOfSchedules(Flight flight) {
		int count;
		count=mapper.findNumberOfSchedules(flight);
		return count;
	}

	@Override
	public Schedule findSchedule(Schedule schedule) {
		Schedule findOne=new Schedule();
		findOne=mapper.findSchedule(schedule);
		return findOne;
	}

	@Override
	public List<ScheduleMapper> findSchedules(Map<String, Schedule> paramMap) {
		List<ScheduleMapper> list=new ArrayList<>();
		list=mapper.findSchedules(paramMap);
		return list;
	}

	@Override
	public int updateSchedule(Flight flight) {
		mapper.updateSchedule(flight);
		return 0;
	}

	@Override
	public void deleteSchedule(Flight flight) {
		mapper.deleteSchedule(flight);
		
	}
	
}