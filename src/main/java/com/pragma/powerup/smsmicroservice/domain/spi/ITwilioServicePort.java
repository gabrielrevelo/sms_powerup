package com.pragma.powerup.smsmicroservice.domain.spi;

public interface ITwilioServicePort {
    void sendSms(String phone, String securityCode, String body);
}
