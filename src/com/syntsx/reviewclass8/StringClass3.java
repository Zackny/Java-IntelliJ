package com.syntsx.reviewclass8;

public class StringClass3 {
    public static void main(String[] args) {
        String batch = "Batch 12";
        String course = "SDET";

        String company="     Syntax    Tech";
        System.out.println( company.trim());
        String name="nasir gopi krishan kashtabai rama";
        System.out.println(name.replaceAll(" ",""));


        if("Batch 12".equals(batch) && "SDET".equals(course)){
            System.out.println("You get the link to lecture");
        }else{
            System.out.println("Watch my yt video");
        }



    }
}
