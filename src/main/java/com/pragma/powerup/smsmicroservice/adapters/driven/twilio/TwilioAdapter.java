package com.pragma.powerup.smsmicroservice.adapters.driven.twilio;

import com.pragma.powerup.smsmicroservice.domain.spi.ITwilioServicePort;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;

public class TwilioAdapter implements ITwilioServicePort {
    @Value("${twilio.account_sid}")
    private String ACCOUNT_SID;
    @Value("${twilio.auth_token}")
    private String AUTH_TOKEN;

    @Override
    public void sendSms(String phoneNumber, String message, String body) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message twilioMessage = Message.creator(
                new PhoneNumber(phoneNumber),
                new PhoneNumber("+13614231603"),
                body
        ).create();
        
        System.out.println(twilioMessage.getSid());
    }
}