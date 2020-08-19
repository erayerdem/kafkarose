package com.example.springkafkaexpert.consumerproducer;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {
    private final Sender sender;

    @GetMapping()
    public void createTopic() {
        sender.send("na");

    }
}
