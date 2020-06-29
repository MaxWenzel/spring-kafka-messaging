package org.devzone.messagebroker.controller;

import org.devzone.messagebroker.model.MessageDTO;
import org.devzone.messagebroker.producer.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @PostMapping("/messages/{sender}")
    public ResponseEntity<Object> sendMessage(@PathVariable String sender, @RequestBody MessageDTO message) {
        logger.info("Received new message for Reciever {}", message.getReceiver());
        messageProducer.produceKafkaMessage(sender, message.getReceiver(), message.getMessage());
        return ResponseEntity.ok().build();
    }
}
