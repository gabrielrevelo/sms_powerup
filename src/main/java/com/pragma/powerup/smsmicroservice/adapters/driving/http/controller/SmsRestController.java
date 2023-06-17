package com.pragma.powerup.smsmicroservice.adapters.driving.http.controller;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.request.SmsRequestDto;
import com.pragma.powerup.smsmicroservice.adapters.driving.http.handlers.ISmsHandler;
import com.pragma.powerup.smsmicroservice.configuration.Constants;
import com.pragma.powerup.smsmicroservice.configuration.response.SuccessfulApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
@RequiredArgsConstructor
public class SmsRestController {

    private final ISmsHandler smsHandler;

    @Operation(summary = "Send a new SMS")
    @PostMapping()
    @SecurityRequirement(name = "jwt")
    public ResponseEntity<SuccessfulApiResponse<Void>> sendSms(@Valid @RequestBody SmsRequestDto smsRequestDto) {
        smsHandler.sendSms(smsRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new SuccessfulApiResponse<>(Constants.SMS_SENT_MESSAGE));
    }
}
