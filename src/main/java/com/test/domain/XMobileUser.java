package com.test.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "XMobileUser")
public class XMobileUser {

    public XMobileUser() {

    }

    public XMobileUser(String phoneNumber, String accountNumber, Double credit, Integer SMS, Integer minutes, Integer internet) {
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.credit = credit;
        this.SMS = SMS;
        this.internet = internet;
        this.minutes = minutes;
    }

    @Id
    private String id;

    @Field("phone_number")
    private String phoneNumber;

    @Field("account_number")
    private String accountNumber;

    @Field("credit")
    private Double credit;

    @Field("sms")
    private Integer SMS;

    @Field("internet")
    private Integer internet;

    @Field("minutes")
    private Integer minutes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

        public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Integer getSMS() {
        return SMS;
    }

    public void setSMS(Integer SMS) {
        this.SMS = SMS;
    }

    public Integer getInternet() {
        return internet;
    }

    public void setInternet(Integer internet) {
        this.internet = internet;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }
}
