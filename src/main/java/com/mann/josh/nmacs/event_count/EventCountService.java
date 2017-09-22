package com.mann.josh.nmacs.event_count;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventCountService {
    @Autowired
    private EventCountRepository eventCountRepository;

    public List<EventCount> getEventCountsByYear(Integer year) {
        return eventCountRepository.findByEventYear(year);
    }

    public List<EventCount> getEventCountsByYearCountryState(Integer year, String country, String state) {
        return eventCountRepository.findByEventYearAndLocalCountryAndLocalState(year, country, state);
    }
}
