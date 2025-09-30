package de.aittr.currency.repository;

import de.aittr.currency.model.Currency;

import java.util.List;

public interface CurrencyRepository {
    List<Currency> findAll();
    List<Currency> findAllByCode(String code);
    List<Currency> findAllByName( String name);


}
