package com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.request.SmsRequestDto;
import com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers.ISmsHandler;
import com.pragma.powerup.smsmicroservice.adapters.driving.http.mapper.IRestaurantRequestMapper;
import com.pragma.powerup.smsmicroservice.domain.api.ISmsServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsHandlerImp implements ISmsHandler {

    private final ISmsServicePort smsServicePort;
    private final IRestaurantRequestMapper restaurantRequestMapper;

    @Override
    public void sendSms(SmsRequestDto smsRequestDto) {
        smsServicePort.sendSms(smsRequestDto.getPhone(), smsRequestDto.getSecurityCode());
    }
}
