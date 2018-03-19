package com.vijeth.listener;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@EnableJms
public class JmsMessageListener {
    @JmsListener(destination="Send2Recv")
    public void processMessage(String text) {
        System.out.println("Received: " + text);
    }
}