package com.mann.josh.nmacs.event_count;

import com.mann.josh.nmacs.event_count.EventCount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventCountRepository extends CrudRepository<EventCount, String> {
    public List<EventCount> findByEventYear(Integer year);
    public List<EventCount> findByEventYearAndLocalCountryAndLocalState(Integer year, String country, String state);
}
