package com.example.KafkaPOC.service;

import com.example.KafkaPOC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private static final String TOPIC = "kafkatest";
    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    public String producer(Employee employee) {
        kafkaTemplate.send(TOPIC, employee);
        return "Published successfully";
    }

    @KafkaListener(topics = TOPIC,
            containerFactory = "employeeKafkaListenerFactory")
    public void consumer(Employee employee) {
        System.out.println("Consumed JSON Message: " + employee);
    }
}
