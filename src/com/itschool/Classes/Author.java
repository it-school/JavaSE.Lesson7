package com.itschool.Classes;

public class Author
{
    @Override
    public String toString()
    {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Author()
    {
    }

    public Author(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    String name;
    String surname;
}
