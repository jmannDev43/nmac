package com.mann.josh.nmacs.event_count;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventCountController {

    @Autowired
    private EventCountService eventCountService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/eventCounts/year/{year}")
    public List<EventCount> getEventCountsByYear(@PathVariable Integer year) {
        return eventCountService.getEventCountsByYear(year);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/eventCounts/year/{year}/country/{country}/state/{state}")
    public List<EventCount> getEventCountsByYearCountryState(@PathVariable Integer year, @PathVariable String country, @PathVariable String state) {
        return eventCountService.getEventCountsByYearCountryState(year, country, state);
    }
}
