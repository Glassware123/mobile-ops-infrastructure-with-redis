package com.test.service;

import com.test.subscriber.Subscriber;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class SubscriberService {

    Subscriber subscriber = new Subscriber();
    Jedis jedis = new Jedis("localhost", 6379);

    @Async
    public void listenSubscriber() {
        while (true) {
            listen();
        }
    }

    private void listen() {
        listen("smsChannel");
        listen("minuteChannel");
        listen("internetChannel");
        listen("creditChannel");
    }

    private void listen(String channel) {

        jedis.subscribe(subscriber, channel);
    }
}
