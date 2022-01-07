/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.doggenetics2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-00-00
 * purpose: 
 */
public class DogGenetics {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int percentageLeft = 100;
        int breedsLeft = 5;
        
        List<Integer> breedPercentages = new ArrayList<>();
        
        String[] dogBreeds = {
            "Irish Wolfhound",
            "Xoloitzcuintli",
            "Australian Stumpy Tail Cattle Dog",
            "Pembroke Welsh Corgi",
            "Cardigan Corgi",
            "Alaskan Klee Kai",
            "Brussels Griffon",
            "Catalburun",
            "Bergamasco Shepherd",
            "Lowchen",
            "Puli",
            "Russian Borzoi",
            "Affenpinscher",
            "Neapolitan Mastiff"
        };
        
        System.out.println("WELCOME TO DOG GENETICS");
        System.out.println("-----------------------\n");
        System.out.println("What's your furbaby's name?");
        
        String name = scanner.nextLine();
        
        System.out.println("\nGenerating results...\n");
        
        System.out.printf("Oh my! %s is a mix weird mix of:%n", name);
        
        
        // Create max 5 percentages in List
        while (percentageLeft > 0) {
            
            int percentage;
            
            if (breedsLeft == 1) {
                percentage = percentageLeft;
            } else {
                percentage = random.nextInt(percentageLeft) + 1;
            }
            
            breedPercentages.add(percentage);
            percentageLeft -= percentage;
            
            breedsLeft--;
        }
        
        
        // Order list in descending order
        Collections.sort(breedPercentages, Collections.reverseOrder());

        
        // Display results
        for (int percentage : breedPercentages) {
            
            boolean notRepeadBreed = true;
            
            while (notRepeadBreed) {
                
                int index = random.nextInt(dogBreeds.length);

                if (dogBreeds[index] != "") {
                    System.out.printf(" %2d%% %s%n" , percentage, dogBreeds[index]);
                    dogBreeds[index] = "";
                    notRepeadBreed = false;
                } 
            }
        }
        
        System.out.println("\nThat's one weird dog!");
    }
    
}
