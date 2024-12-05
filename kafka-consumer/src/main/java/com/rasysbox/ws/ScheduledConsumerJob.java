package com.rasysbox.ws;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledConsumerJob {

    private final KafkaConsumerService kafkaConsumerService;

    public ScheduledConsumerJob(KafkaConsumerService kafkaConsumerService) {
        this.kafkaConsumerService = kafkaConsumerService;
    }

    @Scheduled(fixedRate = 10000) // Every 10 seconds.
    public void checkForMessages() {
        String message = kafkaConsumerService.pollMessage();
        if (message != null) {
            System.out.println("Job found a message: " + message);
        } else {
            System.out.println("No messages found in the last 10 seconds.");
        }
    }
}

