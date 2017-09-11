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
    public List<EventCount> getEventsByYear(@PathVariable Integer year) {
        return eventCountService.getEventCountsByYear(year);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/eventCounts/year/{year}/state/{state}")
    public List<EventCount> getEventsByYear(@PathVariable Integer year, @PathVariable String state) {
        return eventCountService.getEventCountsByYearAndState(year, state);
    }
}
