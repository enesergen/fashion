package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.MakeCombineRequestDto;
import com.enesergen.fashionbackend.fashion.dto.MakeCombineResponseDto;
import com.enesergen.fashionbackend.fashion.entity.ClotheType;
import com.enesergen.fashionbackend.fashion.entity.Clothes;
import com.enesergen.fashionbackend.fashion.entity.Weather;
import com.enesergen.fashionbackend.fashion.repository.ClothesRepository;
import com.enesergen.fashionbackend.fashion.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CombineServiceImp implements CombineService {
    private final UserRepository userRepository;
    private final ClothesRepository clothesRepository;

    @Override
    public MakeCombineResponseDto makeCombine(MakeCombineRequestDto requestDto) {
        var user = userRepository.findByEmail(requestDto.getUsername());
        if (user.isPresent()) {
            var caps = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.CAPS);
            var dress = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.DRESS);
            var handbag = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.HANDBAG);
            var jacket = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.JACKET);
            var pant = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.PANT);
            var shirt = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.SHIRT);
            var shoes = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.SHOES);
            var short_ = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.SHORT);
            var skirts = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.SKIRTS);
            var sunglasses = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.SUNGLASSES);
            var sweater = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.SWEATER);
            var sweatshirt = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.SWEATSHIRT);
            var tshirt = clothesRepository
                    .getClothesByUser_IdAndClotheType(user.get().getId(), ClotheType.TSHIRT);
            if(requestDto.getWeather().equals(Weather.SUMMER)){

            }

        } else {
            throw new UsernameNotFoundException("Username not found");
        }
        return null;
    }
}
