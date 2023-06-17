package com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.request.SmsRequestDto;

public interface ISmsHandler {
    void sendSms(SmsRequestDto smsRequestDto);
}
