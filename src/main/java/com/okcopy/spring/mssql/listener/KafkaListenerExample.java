package com.okcopy.spring.mssql.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;


//TODO: specify here properly the topic name and groupId.
//TODO: You should create more classes with different topics and groupId

@KafkaListener(topics = "topicName", groupId = "foo")
@Slf4j
public class KafkaListenerExample {

    //TODO: set a properly class to serialize the object contained in kafka message
    public void listener(@Payload String message) {
        //TODO: write the logic in this point
        log.info(message);
    }

}
