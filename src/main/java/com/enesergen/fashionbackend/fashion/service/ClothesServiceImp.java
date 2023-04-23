package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.enesergen.fashionbackend.fashion.entity.ClotheType;
import com.enesergen.fashionbackend.fashion.entity.Clothes;
import com.enesergen.fashionbackend.fashion.entity.Color;
import com.enesergen.fashionbackend.fashion.repository.ClothesRepository;
import com.enesergen.fashionbackend.fashion.repository.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClothesServiceImp implements ClothesService {
    private final ClothesRepository clothesRepository;
    private final UserRepository userRepository;

    @Override
    public AddClothesResponseDto addClothes(AddClothesRequestDto requestDto) {
        var user = userRepository.findById(requestDto.getUserId());
        if (user.isPresent()) {
            var clothes = new Clothes(ClotheType.valueOf(requestDto.getClotheType()), requestDto.getUrl(), Color.valueOf(requestDto.getColor()), user.get());
            var result = clothesRepository.save(clothes);
            if (clothesRepository.existsById(result.getId())) {
                return new AddClothesResponseDto(true, "Clothes was added");
            }
        }
        return new AddClothesResponseDto(false, "Error");
    }

    @Override
    public DeleteClothesResponseDto deleteClothes(DeleteClothesRequestDto requestDto) {
        var clothes = clothesRepository.findById(requestDto.getId());
        clothes.ifPresent(clothesRepository::delete);
        if (clothes.isPresent()) {
            var result = clothesRepository.existsById(clothes.get().getId());
            return !result ? new DeleteClothesResponseDto(true, "clothes was deleted") : new DeleteClothesResponseDto(false, "Error");
        }
        return new DeleteClothesResponseDto(false, "Error");
    }

    @Override
    public UpdateClothesResponseDto updateClothes(UpdateClothesRequestDto requestDto) {
        var clothes = clothesRepository.findById(requestDto.getId());
        if (clothes.isPresent()) {
            clothes.get().setClotheType(ClotheType.valueOf(requestDto.getClothType()));
            clothes.get().setColor(Color.valueOf(requestDto.getColor()));
            clothesRepository.save(clothes.get());
            return new UpdateClothesResponseDto(true, "clothes was updated");
        }
        return new UpdateClothesResponseDto(true, "Error");
    }
}
