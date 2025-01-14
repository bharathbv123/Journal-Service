package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Journal;
import com.app.services.JournalService;

@RestController
@RequestMapping("/journals")
public class JournalController {
	
	@Autowired
	private JournalService journalService;
	
	@GetMapping
	public ResponseEntity<List<Journal>> getAllJournals(){
		return ResponseEntity.ok(journalService.getAllJournals());
	}

}
