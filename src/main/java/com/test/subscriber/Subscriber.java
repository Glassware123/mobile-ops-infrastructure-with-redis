package com.test.subscriber;
import redis.clients.jedis.JedisPubSub;
public class Subscriber extends JedisPubSub {
    @Override
    public void onMessage(String channel, String message)
    {
        System.out.println("Message received from channel: "+channel+ " Msg: " + message);
    }
    @Override
    public void onPMessage(String pattern, String channel, String message) {
        System.out.println("onPmessage");
    }
    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        System.out.println("onSubscribe "+channel);

    }
    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        System.out.println("onUnsubscribe");
    }
    @Override
    public void onPUnsubscribe(String pattern, int subscribedChannels) {
        System.out.println("onPUnsubscribe");
    }
    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        System.out.println("onPSubscribe");
    }
}