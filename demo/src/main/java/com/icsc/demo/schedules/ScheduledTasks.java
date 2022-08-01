package com.icsc.demo.schedules;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ScheduledTasks {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.sss");
	
	@Scheduled(fixedRate =5000)
	public void reportCurrentTime() {
		Date d = new Date();
		//sdf.format(d);
		log.info("The time is now {}" ,sdf.format(d));
	}
}
