package com.enesergen.fashionbackend.fashion.entity;

public enum Color {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    LIME("Lime"),
    BLUE("Blue"),
    YELLOW("Yellow"),
    CYAN("Cyan"),
    MAGENTA("Magenta"),
    SILVER("Silver"),
    GRAY("Gray"),
    MAROON("Maroon"),
    OLIVE("Olive"),
    GREEN("Green"),
    PURPLE("Purple"),
    TEAL("Teal"),
    NAVY("Navy");
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
