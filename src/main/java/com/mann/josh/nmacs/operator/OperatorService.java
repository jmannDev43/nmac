package com.mann.josh.nmacs.operator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperatorService {

    @Autowired
    private OperatorRepository operatorRepository;

//    private List<String> operators = Arrays.asList(
//            "One", "Two", "Three"
//            );

//    public List<Operator> getEventOperators(String eventId) {
//        List<Operator> operators = new ArrayList<>();
//        operatorRepository.findByEventReportNumber(eventId).forEach(operators::add);
//        return operators;
//    }
}
