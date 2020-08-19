package com.example.springkafkaexpert.producerjson;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    private final Sender sender;

    @PostMapping
    public void getMapping(@RequestBody Student student) {


        sender.send(student);

    }
}
