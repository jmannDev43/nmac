package com.mann.josh.nmacs.operator;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OperatorRepository extends CrudRepository<Operator, String> {
//    public List<Operator> findByEventReportNumber(String eventId);
}
