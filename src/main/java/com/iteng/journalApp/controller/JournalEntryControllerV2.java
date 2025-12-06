package com.iteng.journalApp.controller;

import com.iteng.journalApp.Entity.JournalEntry;
import com.iteng.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping
    public List<JournalEntry> getAll(){ //localhost:8080/journal

        return List.of();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){ //localhost:8080/journal
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntryByid(@PathVariable Long myid){

        return null;
    }

    @DeleteMapping("id/{myid}")
    public JournalEntry DeleteJournalEntryByid(@PathVariable Long myid){

        return null;
    }

    @PutMapping
    public JournalEntry UpdatejournalEntryByid(@PathVariable Long id, @RequestBody JournalEntry myEntry ){

        return myEntry;
    }

}
