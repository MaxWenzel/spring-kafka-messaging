package org.devzone.messagebroker.producer;

import org.devzone.messagebroker.schema.KafkaMessage;
import org.devzone.messagebroker.schema.KafkaMessageKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MessageProducer {

    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private Processor processor;

    public void produceKafkaMessage(String sender, String receiver, String payload) {

        // creating message details
        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setId(UUID.randomUUID().toString());
        kafkaMessage.setSender(sender);
        kafkaMessage.setReceiver(receiver);
        kafkaMessage.setMessage(payload);

        KafkaMessageKey messageKey = new KafkaMessageKey();
        messageKey.setId(sender);

        Message<KafkaMessage> message = MessageBuilder.withPayload(kafkaMessage)
                .setHeader(KafkaHeaders.MESSAGE_KEY, messageKey)
                .build();

        processor.output()
                .send(message);
    }

}
