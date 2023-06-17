package com.pragma.powerup.smsmicroservice.domain.usecase;

import com.pragma.powerup.smsmicroservice.configuration.Constants;
import com.pragma.powerup.smsmicroservice.domain.api.ISmsServicePort;
import com.pragma.powerup.smsmicroservice.domain.spi.ITwilioServicePort;

public class SmsUseCase implements ISmsServicePort {

    private final ITwilioServicePort twilioClient;

    public SmsUseCase(ITwilioServicePort twilioClient) {
        this.twilioClient = twilioClient;
    }

    @Override
    public void sendSms(String phone, String securityCode) {
        twilioClient.sendSms(phone, securityCode, String.format(Constants.SMS_TEMPLATE, securityCode));
    }
}
