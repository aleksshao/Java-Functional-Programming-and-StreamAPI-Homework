package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FilterArray {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] words = input.nextLine().split(" ");

        List<String> sentence = Arrays.asList(words);
        sentence.stream().filter(x -> x.length() > 3).forEach(element -> {
            System.out.print(element+ " ");
        });
   }
}



