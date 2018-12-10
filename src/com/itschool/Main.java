package com.itschool;

import com.itschool.Classes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UkrainianAddress address = new UkrainianAddress();
/*

        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Input correct index: ");
        }while (!address.setIndex(sc.nextLine()));
        //System.out.println(address.getIndex());

        do
        {
            System.out.println("Input correct country name: ");
        }while (!address.setCountry(sc.nextLine()));
       // System.out.println(address.getCountry());

        do
        {
            System.out.println("Input correct house number: ");
        }while (!address.setHouse(sc.nextLine()));
        //System.out.println(address.getHouse());

        System.out.println(address.toString());
*/

        UkrainianAddress ukrainianAddress = new UkrainianAddress("65055", "Ukraine", "Odessa", "Shevchenko", "3", 223);
        System.out.println(ukrainianAddress);


        UkrainianAddress ukrainianAddress2 = new UkrainianAddress("65055", "Odessa", "Shevchenko", "3", 223);
        System.out.println(ukrainianAddress2);

        Book book1 = new Book(new Author("Jack", "London"), new Title("Sea wolf"), ukrainianAddress2, new Text("Once upon a time..."));

        Book book2 = new Book();
        Author autor = new Author("Jack", "London");
        Title title = new Title ("White silence");
        Text text = new Text("In the last century...");
        book2.setAutor(autor);
        book2.setTitle(title);
        book2.setPublisher(ukrainianAddress);
        book2.setText(text);

        System.out.println(book1);
        System.out.println(book2);

    }
}
