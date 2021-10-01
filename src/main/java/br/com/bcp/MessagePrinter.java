package br.com.bcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

public class MessagePrinter {

	private Logger log = LoggerFactory.getLogger(MessagePrinter.class);
	
	public void print(Message<?> message){
		log.info("Print payload:{}", message.getPayload());
	}
	
}
