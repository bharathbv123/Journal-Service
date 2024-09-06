package com.app.services;

import org.apache.kafka.common.protocol.types.Field.Str;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JournalConsumer {
	
	@Autowired
	private JournalService journalService;
	
	@KafkaListener(topics = "user-events",groupId = "journal-group")
	public void listen(String eventMessage) {
		journalService.saveJournal(eventMessage);
		System.out.println("Logged User Event: "+eventMessage);
	}

}
