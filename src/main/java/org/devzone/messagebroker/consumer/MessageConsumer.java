package org.devzone.messagebroker.consumer;

import org.devzone.messagebroker.schema.KafkaMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @StreamListener(Processor.INPUT)
    public void consumeEmployeeDetails(KafkaMessage kafkaMessage) {
        logger.info("Let's process KafkaMessage details: {}", kafkaMessage);
    }

}
