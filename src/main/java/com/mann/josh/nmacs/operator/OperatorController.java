package com.mann.josh.nmacs.operator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperatorController {

    @Autowired
    private OperatorService operatorService;

//    @RequestMapping("/events/{eventId}/operators")
//    public List<Operator> getAllEvents(@PathVariable String eventId) {
//        return operatorService.getEventOperators(eventId);
//    }
}