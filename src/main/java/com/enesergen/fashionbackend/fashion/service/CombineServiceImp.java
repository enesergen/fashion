package com.enesergen.fashionbackend.fashion.service;

import com.enesergen.fashionbackend.fashion.dto.MakeCombineRequestDto;
import com.enesergen.fashionbackend.fashion.dto.MakeCombineResponseDto;
import com.enesergen.fashionbackend.fashion.entity.*;
import com.enesergen.fashionbackend.fashion.repository.ClothesRepository;
import com.enesergen.fashionbackend.fashion.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CombineServiceImp implements CombineService {
    private final UserRepository userRepository;
    private final ClothesRepository clothesRepository;

    public Clothes colorSelection(Color color, List<Clothes> clothes) {

        if (color.equals(Color.BLACK)) {// siyah her şey ile uyumlu
            //BLACK - WHITE - BLUE - GREEN
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE || item.getColor() == Color.GRAY || item.getColor() == Color.SILVER)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLUE || item.getColor() == Color.CYAN || item.getColor() == Color.NAVY || item.getColor() == Color.TEAL)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GREEN || item.getColor() == Color.OLIVE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.MAROON)
                    return item;
            }
        }
        if (color.equals(Color.WHITE)) {
            //mavi - kırmızı - siyah
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLUE || item.getColor() == Color.CYAN || item.getColor() == Color.NAVY || item.getColor() == Color.TEAL)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GREEN || item.getColor() == Color.OLIVE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK)
                    return item;
            }
        }
        if (color.equals(Color.RED)) {
            //Sarı Beyaz Yeşil Mavi Siyah
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW || item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE || item.getColor() == Color.SILVER || item.getColor() == Color.GRAY)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GREEN || item.getColor() == Color.OLIVE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLUE || item.getColor() == Color.CYAN || item.getColor() == Color.NAVY || item.getColor() == Color.TEAL)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK)
                    return item;
            }
        }
        if (color.equals(Color.LIME)) {
            //sarı kahverengi gri krem beyaz
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW || item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.TEAL || item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER)
                    return item;
            }
        }
        if (color.equals(Color.BLUE)) {
            //kırmızı sarı beyaz kahverengi gri pembe
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW || item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAGENTA || item.getColor() == Color.SILVER)
                    return item;
            }
        }
        if (color.equals(Color.YELLOW)) {
            //mavi lila mor gri siyah
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLUE || item.getColor() == Color.CYAN || item.getColor() == Color.NAVY || item.getColor() == Color.TEAL)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAGENTA)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.PURPLE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAGENTA || item.getColor() == Color.SILVER)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK)
                    return item;
            }
        }
        if (color.equals(Color.CYAN)) {
            //kırmızı sarı beyaz kahvregeni gri turuncu  pembe
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW || item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.TEAL || item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAGENTA)
                    return item;
            }
        }
        if (color.equals(Color.MAGENTA)) {
            //Kahve tonları kırmızı ve alt tonları
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAROON || item.getColor() == Color.RED)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.TEAL || item.getColor() == Color.NAVY)
                    return item;
            }

            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE || item.getColor() == Color.BLACK)
                    return item;
            }
        }
        if (color.equals(Color.SILVER)) {
            // fuşya kırmızı pembe mavi
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAGENTA)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.PURPLE)
                    return item;
            }

            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE || item.getColor() == Color.BLACK)
                    return item;
            }
        }
        if (color.equals(Color.GRAY)) {
            // fuşya kırmızı pembe mavi
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAGENTA)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.PURPLE)
                    return item;
            }

            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE || item.getColor() == Color.BLACK)
                    return item;
            }
        }
        if (color.equals(Color.MAROON)) {
            // turkuaz krem pembe yeşil bej
            for (Clothes item : clothes) {
                if (item.getColor() == Color.CYAN)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAGENTA || item.getColor() == Color.PURPLE)
                    return item;
            }

            for (Clothes item : clothes) {
                if (item.getColor() == Color.GREEN || item.getColor() == Color.OLIVE || item.getColor() == Color.TEAL)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER || item.getColor() == Color.WHITE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK)

                    return item;
            }
        }
        if (color.equals(Color.OLIVE)) {
            // sarı krem pembe turuncu siyah beyaz
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW || item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE || item.getColor() == Color.PURPLE)
                    return item;
            }

            for (Clothes item : clothes) {
                if (item.getColor() == Color.SILVER || item.getColor() == Color.GRAY)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER || item.getColor() == Color.WHITE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.TEAL || item.getColor() == Color.NAVY)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK)

                    return item;
            }
        }
        if (color.equals(Color.GREEN)) {
            // sarı kahverengi gri krem siyah beyaz
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW || item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.NAVY || item.getColor() == Color.TEAL)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.SILVER || item.getColor() == Color.GRAY)
                    return item;
            }

            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK || item.getColor() == Color.WHITE)

                    return item;
            }
        }
        if (color.equals(Color.PURPLE)) {
            // sarı kahverengi gri krem siyah beyaz
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.WHITE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.PURPLE || item.getColor() == Color.MAGENTA)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW || item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.MAROON)
                    return item;
            }

            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK || item.getColor() == Color.WHITE)

                    return item;
            }
        }
        if (color.equals(Color.TEAL)) {
            // kırmızı sarı beyaz kahverengi gri pembe
            // sarı kahverengi gri krem siyah beyaz
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.MAROON)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.YELLOW)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK || item.getColor() == Color.WHITE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.OLIVE || item.getColor() == Color.NAVY)
                    return item;
            }
        }
        if (color.equals(Color.NAVY)) {
            // cam böceği sarımsı yeşilimsi gri beyaz siyah açık sarı truncu  ve kırmızı
            for (Clothes item : clothes) {
                if (item.getColor() == Color.CYAN)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.LIME)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.GRAY || item.getColor() == Color.SILVER)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.BLACK || item.getColor() == Color.WHITE)
                    return item;
            }
            for (Clothes item : clothes) {
                if (item.getColor() == Color.RED || item.getColor() == Color.MAROON)
                    return item;
            }
        }
        return null;
    }

    public String isUrlNull(Clothes clothes) {
        if (clothes != null) {
            return clothes.getUrl();
        }
        return null;
    }

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
            List<Combine> combineList = new ArrayList<>();
            if (requestDto.getWeather().equals(Weather.SUMMER)) {

                if (dress != null) {
                    for (Clothes item : dress) {//caps pant yok t shirt yok dress= full elbise
                        var cHandbag = colorSelection(item.getColor(), handbag);
                        var cShoes = colorSelection(item.getColor(), shoes);
                        var cSunglasses = colorSelection(item.getColor(), sunglasses);
                        combineList.add(new Combine(
                                        null,
                                        isUrlNull(cSunglasses),
                                        null,
                                        item.getUrl(),
                                        isUrlNull(cHandbag),
                                        null,
                                        isUrlNull(cShoes)
                                )
                        );
                    }
                }

                if (tshirt != null) {
                    for (Clothes item : tshirt) {
                        var cCaps = colorSelection(item.getColor(), caps);
                        var cHandbag = colorSelection(item.getColor(), handbag);
                        var cJacket = colorSelection(item.getColor(), jacket);
                        var cPant = colorSelection(item.getColor(), pant);
                        var cShort = colorSelection(item.getColor(), short_);
                        var cSkirt = colorSelection(item.getColor(), skirts);
                        var cSunglasses = colorSelection(item.getColor(), sunglasses);
                        var cShoes = colorSelection(item.getColor(), shoes);

                        combineList.add(new Combine(isUrlNull(cCaps),
                                        isUrlNull(cSunglasses),
                                        isUrlNull(cJacket),
                                        item.getUrl(),
                                        isUrlNull(cHandbag),
                                        isUrlNull(cPant),
                                        isUrlNull(cShoes)
                                )
                        );

                    }
                }
                if (shirt != null) {
                    for (Clothes item : shirt) {
                        var cCaps = colorSelection(item.getColor(), caps);
                        var cHandbag = colorSelection(item.getColor(), handbag);
                        var cJacket = colorSelection(item.getColor(), jacket);
                        var cPant = colorSelection(item.getColor(), pant);
                        var cShort = colorSelection(item.getColor(), short_);
                        var cSkirt = colorSelection(item.getColor(), skirts);
                        var cSunglasses = colorSelection(item.getColor(), sunglasses);
                        var cShoes = colorSelection(item.getColor(), shoes);

                        combineList.add(new Combine(isUrlNull(cCaps),
                                isUrlNull(cSunglasses),
                                isUrlNull(cJacket),
                                item.getUrl(),
                                isUrlNull(cHandbag),
                                isUrlNull(cPant),
                                isUrlNull(cShoes)));
                    }
                }

            }
            if (requestDto.getWeather().equals(Weather.WINTER)) {

                if (sweater != null) {
                    for (Clothes item : sweater) {//sweat üst kabulu
                        var cCaps = colorSelection(item.getColor(), caps);
                        var cHandbag = colorSelection(item.getColor(), handbag);
                        var cShoes = colorSelection(item.getColor(), shoes);
                        var cPant = colorSelection(item.getColor(), pant);
                        var cJacket = colorSelection(item.getColor(), jacket);
                        combineList.add(new Combine(
                                        isUrlNull(cCaps),
                                        null,
                                        isUrlNull(cJacket),
                                        item.getUrl(),
                                        isUrlNull(cHandbag),
                                        isUrlNull(cPant),
                                        isUrlNull(cShoes)
                                )
                        );
                    }
                }
                if (sweatshirt != null) {
                    for (Clothes item : sweatshirt) {//sweatshirt üst kabulu
                        var cCaps = colorSelection(item.getColor(), caps);
                        var cHandbag = colorSelection(item.getColor(), handbag);
                        var cShoes = colorSelection(item.getColor(), shoes);
                        var cPant = colorSelection(item.getColor(), pant);
                        var cJacket = colorSelection(item.getColor(), jacket);
                        combineList.add(new Combine(
                                        isUrlNull(cCaps),
                                        null,
                                        isUrlNull(cJacket),
                                        item.getUrl(),
                                        isUrlNull(cHandbag),
                                        isUrlNull(cPant),
                                        isUrlNull(cShoes)
                                )
                        );
                    }
                }


            }
            return new MakeCombineResponseDto(combineList);
        } else {
            throw new UsernameNotFoundException("Username not found");
        }
    }
}
