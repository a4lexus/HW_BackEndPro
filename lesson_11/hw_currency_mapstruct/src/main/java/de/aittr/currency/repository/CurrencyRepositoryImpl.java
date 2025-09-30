package de.aittr.currency.repository;

import de.aittr.currency.model.Currency;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CurrencyRepositoryImpl implements CurrencyRepository {

    private static final List<Currency> CURRENCIES = new ArrayList<>(List.of(
            new Currency("USD", "доллар США", "США", 1.0),
            new Currency("EUR", "Евро", "Евросоюз", 0.95),
            new Currency("JPY", "Японская Йена", "Япония", 92.0),
            new Currency("RUB", "Рубль", "РФ", 95.0)

    ));


    @Override
    public List<Currency> findAll() {
        return new ArrayList<>(CURRENCIES);
    }

    @Override
    public List<Currency> findAllByCode(String code) {
        return null;
    }

    @Override
    public List<Currency> findAllByName(String name) {
        return null;
    }

}
