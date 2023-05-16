package com.enesergen.fashionbackend.fashion.entity;

public enum ClotheType {
    CAPS("Caps"),
    DRESS("Dress"),
    HANDBAG("Handbag"),
    JACKET("Jacket"),
    PANT("Pant"),
    SHIRT("Shirt"),
    SHOES("Shoes"),
    SHORT("Short"),
    SKIRTS("Skirts"),
    SUNGLASSES("Sunglasses"),
    SWEATER("Sweater"),
    SWEATSHIRT("Sweatshirt"),
    TSHIRT("Tshirt");
    public final String label;
    private ClotheType(String label){
        this.label=label;
    }
    public static ClotheType valueOfLabel(String label){
        for(ClotheType clotheType:values()){
            if(clotheType.label.equals(label)){
                return clotheType;
            }
        }
        return null;
    }
}
