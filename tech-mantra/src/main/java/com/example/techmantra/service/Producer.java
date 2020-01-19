package com.example.techmantra.service;

import com.example.techmantra.entity.UserActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;
@Service
public class Producer {
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private String topic = "test";
    public String produceMessage(UserActivity userActivity){
        kafkaTemplate.send(topic, userActivity.toString());
        return "Message Published";
    }
}
