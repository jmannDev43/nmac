package com.mann.josh.nmacs.operator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperatorService {

    @Autowired
    private OperatorRepository operatorRepository;
}
