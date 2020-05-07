package com.example.KafkaPOC.controller;

import com.example.KafkaPOC.model.Employee;
import com.example.KafkaPOC.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping("/publish")
    public String post(@RequestBody Employee employee) {
        return kafkaService.producer(employee);
    }
}
