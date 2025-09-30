package de.aittr.currency.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CurrencyRequestDto {
    private String code;
    private String name;
    private String country;
}
