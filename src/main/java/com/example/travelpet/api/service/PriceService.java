package com.example.travelpet.api.service;

import com.example.travelpet.model.entity.Price;
import com.example.travelpet.model.entity.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceService {
    private PriceRepository priceRepository;

    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    public Price getPriceById(Long priceId) {
        return priceRepository.getReferenceById(priceId);
    }

    public Price createPrice(Price price) {
        return priceRepository.save(price);
    }
    //todo:
    public Price updatePrice(Long priceId, Price price) {
        return null;
    }

    public void deletePrice(Long priceId) {
        priceRepository.deleteById(priceId);
    }
}
