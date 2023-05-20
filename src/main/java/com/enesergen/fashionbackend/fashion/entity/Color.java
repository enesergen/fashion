package com.enesergen.fashionbackend.fashion.entity;

public enum Color {
    BLACK("BLACK"),// siyah
    WHITE("WHITE"),// beyaz
    RED("RED"),// kırmızı
    LIME("LIME"),// yeşilimsi
    BLUE("BLUE"),//mavi
    YELLOW("YELLOW"),//sarı
    CYAN("CYAN"),//açık mavi
    MAGENTA("MAGENTA"),//mora yakın pembemsi
    SILVER("SILVER"),//gümüş
    GRAY("GRAY"),//gri
    MAROON("MAROON"),//koyu kırmızı kahverengi
    OLIVE("OLIVE"),//koyu yeşil
    GREEN("GREEN"),//yeşil
    PURPLE("PURPLE"),//mor
    TEAL("TEAL"),//koyu bir ton
    NAVY("NAVY");//lacivertimsi deniz koyu
    public final String label;
    private Color(String label){
        this.label=label;
    }
    public static Color valueOfLabel(String label){
        for(Color color:values()){
            if(color.label.equals(label)){
                return color;
            }
        }

        return null;
    }


}
