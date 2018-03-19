package com.vijeth.sender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsMessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * Simplify the send by using convertAndSend
     * @param text
     */
    public void sendText(final String text) {
        this.jmsTemplate.convertAndSend(text);
    }

}
