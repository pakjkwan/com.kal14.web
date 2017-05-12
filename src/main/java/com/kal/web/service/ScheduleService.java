package com.kal.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kal.web.domain.Flight;
import com.kal.web.domain.Schedule;
import com.kal.web.mapper.ScheduleMapper;

public interface ScheduleService {
	public void addSchedule(Flight flight);
	public int findNumberOfSchedules(Flight flight);
	public Schedule findSchedule(Schedule schedule);
	public List<ScheduleMapper> findSchedules(Map<String,Schedule> paramMap);
	public int updateSchedule(Flight flight);
	public void deleteSchedule(Flight flight);
}