package com.example.travelpet.api.service;

import com.example.travelpet.model.entity.Place;
import com.example.travelpet.model.entity.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService {
    private final PlaceRepository placeRepository;

    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    public Place getPlaceById(Long id) {
        return placeRepository.getReferenceById(id);
    }

    public Place createPlace(Place place) {
        return placeRepository.save(place);
    }

    public Place updatePlace(Long id, Place placeDetails) {
        return null;
    }

    public void deletePlace(Long id) {
        placeRepository.deleteById(id);
    }
}
