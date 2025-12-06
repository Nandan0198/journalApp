package com.iteng.journalApp.repository;

import com.iteng.journalApp.Entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}
