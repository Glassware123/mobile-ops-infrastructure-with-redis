package com.test.service;

import com.test.subscriber.Subscriber;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class SubscriberService {

    public boolean checkSubscriber=false;
    private static Jedis jedis = new Jedis("localhost", 6379);
    private static Subscriber subscriber = new Subscriber();

    @Async
    public void listenSubscriber() throws InterruptedException {
        while (true) {
            listen("creditChannel");
            listen("smsChannel");
            listen("minuteChannel");
            listen("internetChannel");
        }
    }

    private void listen(String channel) throws InterruptedException {

        jedis.subscribe(subscriber, channel);
        checkSubscriber=true;
    }

}
