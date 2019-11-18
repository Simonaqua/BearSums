package com.company;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Scanner;

public class BearSum {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numOfCheck = s.nextInt();
        int i;
        int j;
        for (j =0 ; j<numOfCheck ; j++){
            HashSet<Integer> sol = new HashSet<Integer>();
            int numToCheck = s.nextInt();
            int amountOfNum = s.nextInt();
            int[] arr = new int[amountOfNum];
            int found = 0;
            if (amountOfNum == 0) {
                System.out.println("!OK");
            }
            while (found == 0 && amountOfNum != 0) {
                for (i = 0; i < amountOfNum; i++) {

                    int curr = s.nextInt();
                    if (found == 0) {
                        if (sol.contains(curr))
                            found = curr;
                        else
                            sol.add(numToCheck - curr);
                    }
                }
                if(i == amountOfNum && found == 0) {
                    System.out.println("!OK");
                    found = 1;
                }
                else if (numToCheck-found > found)
                    System.out.println(found +" " + (numToCheck-found));
                else{
                    System.out.println((numToCheck-found) +" " + found);
            }
            }
            }

        }


    }

