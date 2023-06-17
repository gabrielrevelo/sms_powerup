package com.pragma.powerup.smsmicroservice.configuration;

import com.pragma.powerup.smsmicroservice.adapters.driven.twilio.TwilioAdapter;
import com.pragma.powerup.smsmicroservice.domain.api.ISmsServicePort;
import com.pragma.powerup.smsmicroservice.domain.spi.ITwilioServicePort;
import com.pragma.powerup.smsmicroservice.domain.usecase.SmsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    @Bean
    public ITwilioServicePort twilioClient() {
        return new TwilioAdapter();
    }

    @Bean
    public ISmsServicePort restaurantServicePort() {
        return new SmsUseCase(twilioClient());
    }
}
