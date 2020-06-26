package org.devzone.messagebroker.controller;

import org.devzone.messagebroker.producer.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @PostMapping("/messages/{sender}/{receiver}/{payload}")
    public ResponseEntity<Object> sendMessage(@PathVariable String sender, @PathVariable String receiver,
                                              @PathVariable String payload) {
        logger.info("Received new message");
        messageProducer.produceKafkaMessage(sender, receiver, payload);
        return ResponseEntity.ok().build();
    }
}
