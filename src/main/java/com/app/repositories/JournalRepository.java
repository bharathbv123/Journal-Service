package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Journal;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Integer>{

}
