package com.purple.mq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component(value="queueListenter")
public class QueueListenter implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			System.out.print(message.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
