package com.mann.josh.nmacs.event;

import com.mann.josh.nmacs.operator.Operator;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "report_number")
    private String reportNumber;
    private Date eventDate;
    @Column(name = "event_year")
    private Integer eventYear;
    private String eventLocalTime;
    private String localCity;
    @Column(name = "local_state")
    private String localState;
    private String localAirport;
    private String eventDesc;
    private float latitude;
    private float longitude;
    private String population;
    @ManyToOne
    @JoinColumn(name = "operator_id_1")
    private Operator operator1;
    @ManyToOne
    @JoinColumn(name = "operator_id_2")
    private Operator operator2;
}
