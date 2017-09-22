package com.mann.josh.nmacs.event_count;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "event_counts")
public class EventCount {
    @Id
    private Integer id;
    @Column(name = "event_year")
    private Integer eventYear;
    @Column(name = "local_country")
    private String localCountry;
    @Column(name = "local_city")
    private String localCity;
    @Column(name = "local_state")
    private String localState;
    private float latitude;
    private float longitude;
    @Column(name = "event_count")
    private Integer eventCount;
}
