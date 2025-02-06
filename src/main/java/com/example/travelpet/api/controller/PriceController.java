package com.example.travelpet.api.controller;

import com.example.travelpet.api.service.PriceService;
import com.example.travelpet.model.entity.Price;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/price")
public class PriceController {
    private PriceService priceService;

    @GetMapping("/getAll")
    public List<Price> getAllPrices() {
        return priceService.getAllPrices();
    }

    @GetMapping("/getById/{priceId}")
    public Price getPriceById(@PathVariable Long priceId) {
        return priceService.getPriceById(priceId);
    }

    @PostMapping("/create")
    public Price createPrice(@RequestBody Price price) {
        return priceService.createPrice(price);
    }
  /*
    @PutMapping("/update/{priceId}")
    public Price updatePrice(@PathVariable Long priceId, @RequestBody Price price) {
        return priceService.updatePrice(priceId, price);
    }*/

    @DeleteMapping("/delete/{priceId}")
    public void deletePrice(@PathVariable Long priceId) {
        priceService.deletePrice(priceId);
    }
}
