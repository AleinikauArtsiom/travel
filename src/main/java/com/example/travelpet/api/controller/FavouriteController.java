package com.example.travelpet.api.controller;

import com.example.travelpet.api.service.FavouriteService;
import com.example.travelpet.model.entity.Favourite;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favourite")
@RequiredArgsConstructor
public class FavouriteController {
    private FavouriteService favouriteService;

    @GetMapping("/getAll")
    public List<Favourite> getAllFavourites() {
        return favouriteService.getAllFavourites();
    }

    @GetMapping("/getById/{favouriteId}")
    public Favourite getFavouriteById(@PathVariable Long favouriteId) {
        return favouriteService.getFavouriteById(favouriteId);
    }

    @PostMapping("/create")
    public Favourite createFavourite(@RequestBody Favourite favourite) {
        return favouriteService.createFavourite(favourite);
    }

    //TODO:
    /*@PutMapping("/{favouriteId}")
    public Favourite updateFavourite(@PathVariable Long favouriteId, @RequestBody Favourite favourite) {
        return favouriteService.updateFavourite(favouriteId, favourite);
    }*/

    @DeleteMapping("/delete/{favouriteId}")
    public void deleteFavourite(@PathVariable Long favouriteId) {
        favouriteService.deleteFavourite(favouriteId);
    }
}
