package com.itschool.Classes;

public class Book
{
    @Override
    public String toString()
    {
        return "Book{" +
                "autor=" + autor +
                ", title=" + title +
                ", publisher=" + publisher +
                ", text=" + text +
                '}';
    }

    public Book()
    {
    }

    public Book(Author autor, Title title, UkrainianAddress publisher, Text text)
    {
        this.autor = autor;
        this.title = title;
        this.publisher = publisher;
        this.text = text;
    }

    public Author getAutor()
    {
        return autor;
    }

    public void setAutor(Author autor)
    {
        this.autor = autor;
    }

    public Title getTitle()
    {
        return title;
    }

    public void setTitle(Title title)
    {
        this.title = title;
    }

    public UkrainianAddress getPublisher()
    {
        return publisher;
    }

    public void setPublisher(UkrainianAddress publisher)
    {
        this.publisher = publisher;
    }

    public Text getText()
    {
        return text;
    }

    public void setText(Text text)
    {
        this.text = text;
    }

    Author autor;
    Title title;
    UkrainianAddress publisher;
    Text text;
}
