package com.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.log.entity.Log;
import com.log.repo.LogRepository;

@RestController
public class LogController {

	@Autowired
	private LogRepository logRepository;
	
	@PostMapping("/saveLog")
	public Object saveLog(@RequestBody Log log) {
		return logRepository.save(log);
	}
}
