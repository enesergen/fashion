package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.*;
import com.enesergen.fashionbackend.fashion.entity.ClotheType;
import com.enesergen.fashionbackend.fashion.entity.Clothes;
import com.enesergen.fashionbackend.fashion.entity.Color;
import com.enesergen.fashionbackend.fashion.repository.ClothesRepository;
import com.enesergen.fashionbackend.fashion.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ClothesServiceImp implements ClothesService {
    private final ClothesRepository clothesRepository;
    private final UserRepository userRepository;

    @Override
    public AddClothesResponseDto addClothes(AddClothesRequestDto requestDto) {
        var user = userRepository.findByEmail(requestDto.getUsername());
        if (user.isPresent()) {
            var clothes = new Clothes(ClotheType.valueOf(requestDto.getClothesType()), requestDto.getUrl(), Color.valueOf(requestDto.getColor()), user.get());
            var result = clothesRepository.save(clothes);
            if (clothesRepository.existsById(result.getId())) {
                return new AddClothesResponseDto(true, "Clothes was added");
            }
        }
        return new AddClothesResponseDto(false, "Error");
    }

    @Override
    public DeleteClothesResponseDto deleteClothes(DeleteClothesRequestDto requestDto) {
        var user=userRepository.findByEmail(requestDto.getUsername());
        if(user.isPresent()){
            var clothes = clothesRepository.findById(requestDto.getClothesId());
            clothes.ifPresent(clothesRepository::delete);
            if (clothes.isPresent()) {
                var result = clothesRepository.existsById(clothes.get().getId());
                return !result ? new DeleteClothesResponseDto(true, "clothes was deleted") : new DeleteClothesResponseDto(false, "Error");
            }
        }

        return new DeleteClothesResponseDto(false, "Error");
    }

    @Override
    public UpdateClothesResponseDto updateClothes(UpdateClothesRequestDto requestDto) {
        var user=userRepository.findByEmail(requestDto.getUsername());
        if(user.isPresent()){
            var clothes = clothesRepository.findById(requestDto.getClothesId());
            if (clothes.isPresent()) {
                clothes.get().setClotheType(ClotheType.valueOf(requestDto.getClothesType()));
                clothes.get().setColor(Color.valueOf(requestDto.getColor()));
                clothesRepository.save(clothes.get());
                return new UpdateClothesResponseDto(true, "clothes was updated");
            }
        }

        return new UpdateClothesResponseDto(true, "Error");
    }

    @Override
    public List<GetMyAllClothesResponseDto> getMyAllClothes(GetMyAllClothesRequestDto requestDto) {
        var user=userRepository.findByEmail(requestDto.getUsername());
        if(user.isPresent()){
            var clothes=clothesRepository.getClothesByUser_Id(user.get().getId());
            if(clothes!=null){
                List<GetMyAllClothesResponseDto>list=new ArrayList<>();
                for(Clothes item:clothes){
                    list.add(new GetMyAllClothesResponseDto(item.getId(),
                            item.getClotheType(),
                            item.getColor(),
                            item.getUrl()));
                }
                return list;
            }
        }else{
            throw new UsernameNotFoundException("Username not found");
        }
        return null;
    }

    @Override
    public GetOneClothesResponseDto getOneClothes(GetOneClothesRequestDto requestDto) {
        var user=userRepository.findByEmail(requestDto.getUsername());
        if(user.isPresent()){
            var clothes=clothesRepository.findById(requestDto.getClothesId());
            if(clothes.isPresent()){
                return new GetOneClothesResponseDto(clothes.get().getId(),
                        clothes.get().getClotheType(),
                        clothes.get().getColor());
            }
        }else{
            throw new UsernameNotFoundException("Username not found");
        }
        return null;
    }
}
