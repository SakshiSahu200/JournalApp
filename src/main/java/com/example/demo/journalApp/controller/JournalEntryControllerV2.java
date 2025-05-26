package com.example.demo.journalApp.controller;

import com.example.demo.entity.JournalEntry;
import com.example.demo.repository.JournalEntryRepository;
import com.example.demo.service.JournalEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("journal")
public class JournalEntryControllerV2 {

    @Autowired
    JournalEntityService journalEntityService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntityService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntityService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
        return null;
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry myEntry ){
        return null;
    }
}

