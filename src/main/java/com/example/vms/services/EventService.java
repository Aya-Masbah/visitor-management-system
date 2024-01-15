package com.example.vms.services;

import com.example.vms.models.Event;
import com.example.vms.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Get All Events
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
