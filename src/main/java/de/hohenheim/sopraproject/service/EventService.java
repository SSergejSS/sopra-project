package de.hohenheim.sopraproject.service;

import de.hohenheim.sopraproject.entity.Event;
import de.hohenheim.sopraproject.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

}
