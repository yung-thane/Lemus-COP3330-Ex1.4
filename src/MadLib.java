/*
 * UCF COP3330 Fall 2021 Assignment 1.4 Solution
 * Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){

        System.out.print("Enter a noun: ");
        Scanner nounInp = new Scanner(System.in);
        String noun = nounInp.nextLine();

        System.out.print("Enter a verb: ");
        Scanner verbInp = new Scanner(System.in);
        String verb = verbInp.nextLine();

        System.out.print("Enter an adjective: ");
        Scanner adjInp = new Scanner(System.in);
        String adj = adjInp.nextLine();

        System.out.print("Enter an adverb: ");
        Scanner adverbInp = new Scanner(System.in);
        String adverb = adverbInp.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!",verb,adj,noun,adverb);



    }
}
