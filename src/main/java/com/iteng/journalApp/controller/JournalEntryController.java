//package com.iteng.journalApp.controller;
//
//import com.iteng.journalApp.Entity.JournalEntry;
//import org.springframework.boot.convert.PeriodUnit;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//
//    private Map<Long , JournalEntry> JournalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){ //localhost:8080/journal
//        return new ArrayList<>(JournalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){ //localhost:8080/journal
//        JournalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myid}")
//    public JournalEntry getJournalEntryByid(@PathVariable Long myid){
//        return JournalEntries.get(myid);
//    }
//
//    @DeleteMapping("id/{myid}")
//    public JournalEntry DeleteJournalEntryByid(@PathVariable Long myid){
//        return JournalEntries.remove(myid);
//    }
//
//    @PutMapping
//    public JournalEntry UpdatejournalEntryByid(@PathVariable Long id, @RequestBody JournalEntry myEntry ){
//        return JournalEntries.put(id, myEntry);
//    }
//
//}
