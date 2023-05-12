package com.okcopy.spring.mssql.listener;

import com.okcopy.spring.mssql.model.Tutorial;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

//TODO: specify here properly the topic name and groupId.
//TODO: You should create more classes with different topics and groupId
@KafkaListener(topics = "topicName", groupId = "foo")
public class KafkaListenerExample {
    //TODO: set a properly class to serialize the object contained in kafka message
    public void listener(@Payload Tutorial object) {
        object.setPublished(true);
    }

}
