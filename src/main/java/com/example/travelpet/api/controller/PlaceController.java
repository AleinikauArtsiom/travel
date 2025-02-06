package com.example.travelpet.api.controller;

import com.example.travelpet.api.service.PlaceService;
import com.example.travelpet.model.entity.Place;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/place")
public class PlaceController {
    private final PlaceService placeService;

    @GetMapping("/getAll")
    public List<Place> getAllPlaces() {
        return placeService.getAllPlaces();
    }

    @GetMapping("/getById/{id}")
    public Place getPlaceById(@PathVariable Long id) {
        return placeService.getPlaceById(id);
    }

    @PostMapping("/create")
    public Place createPlace(@RequestBody Place place) {
        return placeService.createPlace(place);
    }
//TODO:
    /*@PutMapping("/update/{id}")
    public Place updatePlace(@PathVariable Long id, @RequestBody Place place) {
        return placeService.updatePlace(id, place);
    }*/

    @DeleteMapping("/delete/{id}")
    public void deletePlace(@PathVariable Long id) {
        placeService.deletePlace(id);
    }
}
