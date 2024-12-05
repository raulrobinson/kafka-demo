package com.rasysbox.ws;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class KafkaConsumerService {

    private final BlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();

    @KafkaListener(topics = "${kafka.topic}", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Consumed message: " + message);
        messageQueue.offer(message); // Store the message in the queue.
    }

    public String pollMessage() {
        return messageQueue.poll(); // Retrieve the message from the queue.
    }
}

