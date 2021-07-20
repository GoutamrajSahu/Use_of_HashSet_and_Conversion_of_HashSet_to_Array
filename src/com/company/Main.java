package com.company;
import java.util.*;;


public class Main {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        HashSet<String> resNames = new HashSet<>();
        for(int i=0; i<names1.length;i++){
            resNames.add(names1[i]);
        }

        for(int i=0; i<names2.length;i++){
            resNames.add(names2[i]);
        }
        //--------------------------------------Conversion of HashSet to Array-----------------------------------//
        String[] resArray = new String[resNames.size()];
        int i = 0;
        for(String ele: resNames){
            resArray[i++] = ele;
        }
        //-----------------------------------------------------------------------------------------------------//
        return resArray;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", Main.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}