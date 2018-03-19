package com.vijeth;

import com.vijeth.sender.JmsMessageSender;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class SenderMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("sender-application-context.xml");
        JmsMessageSender jmsMessageSender = (JmsMessageSender)ctx.getBean("jmsMessageSender");
        jmsMessageSender.sendText("Hi Vijeth..!!");
        System.out.println("Message sent to JMS");
    }
}
