package com.enesergen.fashionbackend.fashion.repository;

import com.enesergen.fashionbackend.fashion.entity.ClotheType;
import com.enesergen.fashionbackend.fashion.entity.Clothes;
import com.enesergen.fashionbackend.fashion.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.synth.ColorType;
import java.util.List;
import java.util.Optional;
@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Long> {
    Optional<List<Clothes>> findByColor(Color color);

    Optional<Clothes> findByUrl(String url);

    Optional<List<Clothes>> findByClotheType(ClotheType clotheType);

    List<Clothes>findClothesByUser_Id(long id);


    List<Clothes>getClothesByUser_IdAndClotheType(long userId,ClotheType clotheType);
}
