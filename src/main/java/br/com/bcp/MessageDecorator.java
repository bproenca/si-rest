package br.com.bcp;

import org.springframework.messaging.Message;

public class MessageDecorator {

	public String decorate(Message<?> message){
		return "___" + message.getPayload() + "___";
	}
	
}
