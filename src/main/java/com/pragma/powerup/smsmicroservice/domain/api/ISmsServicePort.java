package com.pragma.powerup.smsmicroservice.domain.api;

public interface ISmsServicePort {

    void sendSms(String phone, String securityCode);
}
