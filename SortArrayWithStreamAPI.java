package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] numbers = input.nextLine().split(" ");
        String words = input.nextLine();

        if (words.equals("Ascending")){
            Arrays.stream(numbers).sorted((n,m) -> n.compareTo(m)).forEach(element ->{
                System.out.print(element+ " ");
            });
        }else if (words.equals("Descending")){
            Arrays.stream(numbers).sorted((n,m) -> m.compareTo(n)).forEach(element -> {
                System.out.print(element+ " ");
            });
        }
    }
}
