package com.rasysbox.ws;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduledJob {

    private final KafkaProducerService kafkaProducerService;

    public ScheduledJob(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @Scheduled(fixedRate = 60000) // Every 60 seconds.
    public void sendKafkaMessage() {
        String message = "Hello Kafka! Current time: " + LocalDateTime.now();
        kafkaProducerService.sendMessage(message);
    }
}

