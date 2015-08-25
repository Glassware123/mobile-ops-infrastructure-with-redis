package com.test.service;

import com.test.domain.XMobileUser;
import com.test.subscriber.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repository.XMobileRepository;
import redis.clients.jedis.Jedis;


import java.util.List;

@Service
public class XMobileService {


    private static Jedis jedis = new Jedis("localhost", 6379);

    @Autowired
    public XMobileRepository xMobileRepository;

    @Autowired
    public SubscriberService subscriberService;

    public void controlCredit() {

        List<XMobileUser> xMobileUsers = xMobileRepository.findAll();
        for (XMobileUser xMobileUser : xMobileUsers) {
            if (xMobileUser.getCredit() < 1) {
                jedis.publish("creditChannel", xMobileUser.getPhoneNumber());
            }
        }
    }

    public void controlSMS() {
        List<XMobileUser> xMobileUsers = xMobileRepository.findAll();
        for (XMobileUser xMobileUser : xMobileUsers) {
            if (xMobileUser.getSMS() < 10) {
                jedis.publish("smsChannel", xMobileUser.getPhoneNumber());
            }
        }
    }

    public void controlInternet() {
        List<XMobileUser> xMobileUsers = xMobileRepository.findAll();
        for (XMobileUser xMobileUser : xMobileUsers) {
            if (xMobileUser.getInternet() < 100) {
                jedis.publish("internetChannel", xMobileUser.getPhoneNumber());
            }
        }
    }

    public void controlMinute() {
        List<XMobileUser> xMobileUsers = xMobileRepository.findAll();
        for (XMobileUser xMobileUser : xMobileUsers) {
            if (xMobileUser.getMinutes() < 60) {
                jedis.publish("minuteChannel", xMobileUser.getPhoneNumber());
            }
        }
    }

    public void findByPhoneNumber(){

    }
}
