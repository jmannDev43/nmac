package com.mann.josh.nmacs.operator;

import com.mann.josh.nmacs.event.Event;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "operators")
public class Operator {
    @Id
    @Column(name = "operator_id")
    private String operatorID;
    private Integer operatorNumber;
    private String operatorName;
    private String operatorType;
    private Integer altitude;
    private String flightPhase;
}
