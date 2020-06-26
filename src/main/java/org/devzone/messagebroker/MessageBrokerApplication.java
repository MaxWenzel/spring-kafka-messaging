package org.devzone.messagebroker;

import org.devzone.messagebroker.producer.MessageProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
@EnableBinding(Processor.class)
@EnableSchemaRegistryClient
public class MessageBrokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageBrokerApplication.class, args);
	}

}
