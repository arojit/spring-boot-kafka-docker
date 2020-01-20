package com.example.techmantra.service;

import com.example.techmantra.entity.UserActivity;
import com.example.techmantra.repository.UserActivityRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @Autowired
    UserActivityRepository userActivityRepository;

    @KafkaListener(topics = "user-log", groupId = "g_1")
    public void consume(String message){
        ObjectMapper mapper = new ObjectMapper();
        try {
            UserActivity userActivity = mapper.readValue(message, UserActivity.class);
            userActivityRepository.save(userActivity);
            Logger logger = LoggerFactory.getLogger(Consumer.class);
            logger.info(message + " - Record Inserted");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
