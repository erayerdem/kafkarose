package com.example.springkafkaexpert.producerjson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class Sender {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Value("${kafka.topic.json}")
    private String jsonTopic;

    @Autowired
    private KafkaTemplate<String, Student> kafkaTemplate;

    public void send(Student student) {
        LOGGER.info("sending car='{}'", student.toString());
        kafkaTemplate.send(jsonTopic, student);
    }
}