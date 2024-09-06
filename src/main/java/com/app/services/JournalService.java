package com.app.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Journal;
import com.app.repositories.JournalRepository;

@Service
public class JournalService {
	
	@Autowired
	private JournalRepository journalrepo;
	
	public void saveJournal(String event) {
		Journal journal=new Journal();
		journal.setEventDescription(event);
		journal.setTimestamp(LocalDateTime.now());
		journalrepo.save(journal);
	}
	
	public List<Journal> getAllJournals(){
		return journalrepo.findAll();
	}

}
