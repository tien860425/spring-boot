package com.icsc.demo.listener;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.event.EventListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextClosedEvent;

@Slf4j
@Component
public class MyListener {

	@EventListener
	public void handleContextRefreshEvent(ContextRefreshedEvent cre) {
		log.info("handleContextRefreshEvent ...");
	}
	
	public void handleContextClosedEvent(ContextClosedEvent ctxStoppedEvt) {
		log.info("handleContextClosedEvent ...");
	}
}
