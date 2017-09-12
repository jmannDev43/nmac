package com.mann.josh.nmacs.event;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, String> {
    public List<Event> findByEventYearAndLocalState(Integer year, String state);

    @Query(
        value = "select * from events e where e.event_year = :year and e.local_state = :state and e.local_city = :city",
        nativeQuery = true
    )
    public List<Event> findByEventYearAndLocalStateAndLocalCity(@Param("year") Integer year, @Param("state") String state, @Param("city") String city);
}
