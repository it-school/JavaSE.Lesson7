package com.itschool;

import com.itschool.Classes.Task1.UkrainianAddress;
import com.itschool.Classes.Task2.Author;
import com.itschool.Classes.Task2.Book;
import com.itschool.Classes.Task2.Text;
import com.itschool.Classes.Task2.Title;
import com.itschool.Classes.Task3.Figure;
import com.itschool.Classes.Task3.Point;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

//  Task 1
        System.out.println("Task 1\n");
        UkrainianAddress address = new UkrainianAddress();
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


        UkrainianAddress ukrainianAddress1 = new UkrainianAddress("65055", "Ukraine", "Odessa", "Shevchenko", "3", 223);
        System.out.println(ukrainianAddress1);

        UkrainianAddress ukrainianAddress2 = new UkrainianAddress("65074", "Odessa", "Ac.Filatov st.", "31", 34);
        System.out.println(ukrainianAddress2);


        // Task 2
        System.out.println("\nTask 2\n");
        Book book1 = new Book(new Author("Jack", "London"), new Title("Sea wolf"), ukrainianAddress2, new Text("Once upon a time..."));

        Book book2 = new Book();
        Author autor = new Author("Jack", "London");
        Title title = new Title ("White silence");
        Text text = new Text("In the last century...");
        book2.setAutor(autor);
        book2.setTitle(title);
        book2.setPublisher(ukrainianAddress1);
        book2.setText(text);

        System.out.println(book1);
        System.out.println(book2);


        // Task 3
        System.out.println("\nTask 3\n");
        Figure figure = new Figure("Triangle", 3);
        figure.getPoints()[0] = new Point("A", 1, 2);
        figure.getPoints()[1] = new Point("B", 3, 2);
        figure.getPoints()[2] = new Point("C", 5, 6);

        System.out.println(figure.toString());
        System.out.println("Side length beetwen point " + figure.getPoints()[0] + " and " + figure.getPoints()[1] + " is: " + figure.getLengthSide(figure.getPoints()[0], figure.getPoints()[1]));
    }
}
