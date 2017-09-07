package com.mann.josh.nmacs.event;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, String> {
    public List<Event> findByEventYear(Integer year);
    public List<Event> findByLocalState(String state);
}
