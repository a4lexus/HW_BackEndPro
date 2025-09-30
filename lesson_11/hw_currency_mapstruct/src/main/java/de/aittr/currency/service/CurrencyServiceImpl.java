package de.aittr.currency.service;

import de.aittr.currency.dto.CurrencyResponseDto;
import de.aittr.currency.mapper.CurrencyMapper;
import de.aittr.currency.repository.CurrencyRepository;
import org.springframework.stereotype.Service;

import javax.swing.plaf.ComponentInputMapUIResource;
import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyMapper mapper;
    private final CurrencyRepository repository;

    public CurrencyServiceImpl(CurrencyMapper mapper, CurrencyRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<CurrencyResponseDto> getAllCurrencies() {
        return mapper.toResponseDto(repository.findAll());
    }

    @Override
    public List<CurrencyResponseDto> getCurrencyByCode(String code) {
        List<CurrencyResponseDto> allCurrencies = getAllCurrencies();
        allCurrencies.sort((c1,c2) -> c1.getCode().compareTo(c2.getCode()));
        return allCurrencies;
    }

    @Override
    public List<CurrencyResponseDto> getCurrencyByName(String name) {
        List<CurrencyResponseDto> allCurrencies = getAllCurrencies();
        allCurrencies.sort((c1,c2)-> c1.getName().compareTo(c2.getName()));
        return allCurrencies;
    }
}
