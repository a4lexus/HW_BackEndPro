package de.aittr.currency.service;

import de.aittr.currency.dto.CurrencyResponseDto;

import java.util.List;

public interface CurrencyService {
     List<CurrencyResponseDto> getAllCurrencies();
     List<CurrencyResponseDto> getCurrencyByCode(String code);
     List<CurrencyResponseDto> getCurrencyByName(String name);

}
