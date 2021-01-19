package com.ssafy.a407.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.a407.dto.ScheduleDto;
import com.ssafy.a407.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleService service;
	
	public static final Logger logger = LoggerFactory.getLogger(ScheduleController.class);
	
	
	/* * pgFlag - 0 : 개인 일정, 1 : 그룹 일정
		* email - 그룹 일정 시 null
		* gId - 개인 일정 시 null 						*/
	@PostMapping(value = "/create")
    private ResponseEntity register(@RequestBody ScheduleDto schedule) {
		System.out.println("[controller] Schedule create >> "+ schedule.toString());
		ResponseEntity entity = null;
		Map result = new HashMap();
		
		try {
			if(service.createSchedule(schedule) == 1) {
				result.put("success", "success");
				entity = new ResponseEntity(result, HttpStatus.OK);
			}else {
	        	result.put("success", "fail");
	        	entity = new ResponseEntity(result, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("success", "error"); 
	        entity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
		}		
		return entity;
	}

}
