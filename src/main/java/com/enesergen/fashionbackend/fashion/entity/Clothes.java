package com.enesergen.fashionbackend.fashion.entity;

import com.enesergen.fashionbackend.fashion.core.entity.EntityBase;
import jakarta.persistence.*;
import lombok.*;

import javax.swing.plaf.synth.ColorType;

@Entity
@Table(name = "clothes")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Clothes extends EntityBase {
    @Enumerated(EnumType.STRING)
    private ClotheType clotheType;
    private String url;
    @Enumerated(EnumType.STRING)
    private Color color;
    @ManyToOne
    private User user;


}
