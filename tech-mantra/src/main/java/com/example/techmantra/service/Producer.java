package com.example.techmantra.service;

import com.example.techmantra.entity.UserActivity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;
@Service
public class Producer {
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private String topic = "test";
    public String produceMessage(UserActivity userActivity){
        ObjectMapper mapper = new ObjectMapper();
        try {
            kafkaTemplate.send(topic, mapper.writeValueAsString(userActivity));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "Message Published";
    }
}
