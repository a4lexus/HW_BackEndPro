package de.aittr.currency.mapper;

import de.aittr.currency.dto.CurrencyResponseDto;
import de.aittr.currency.model.Currency;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")

public interface CurrencyMapper {
    CurrencyResponseDto toResponseDto(Currency currency);
    List<CurrencyResponseDto> toResponseDto(List<Currency> currencies);
}
