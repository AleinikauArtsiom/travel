package com.example.travelpet.api.service;

import com.example.travelpet.model.entity.Favourite;
import com.example.travelpet.model.entity.repository.FavouriteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavouriteService {
    private FavouriteRepository favouriteRepository;

    public List<Favourite> getAllFavourites() {
        return favouriteRepository.findAll();
    }

    public Favourite getFavouriteById(Long favouriteId) {
        return favouriteRepository.getReferenceById(favouriteId);
    }

    public Favourite createFavourite(Favourite favourite) {
        return favouriteRepository.save(favourite);
    }

    //TODO:
    public Favourite updateFavourite(Long favouriteId, Favourite favourite) {
      return null;
    }

    public void deleteFavourite(Long favouriteId) {
        favouriteRepository.deleteById(favouriteId);
    }
}
