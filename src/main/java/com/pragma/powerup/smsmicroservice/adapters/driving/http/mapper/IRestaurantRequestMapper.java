package com.pragma.powerup.smsmicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.smsmicroservice.adapters.driving.http.dto.request.SmsRequestDto;
import com.pragma.powerup.smsmicroservice.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantRequestMapper {
    Restaurant toRestaurant(SmsRequestDto smsRequestDto);
}
