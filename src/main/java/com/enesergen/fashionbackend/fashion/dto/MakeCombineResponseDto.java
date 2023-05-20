package com.enesergen.fashionbackend.fashion.dto;

import com.enesergen.fashionbackend.fashion.entity.Combine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class MakeCombineResponseDto {
    private List<Combine> combineList;
}
