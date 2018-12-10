package com.itschool.Classes.Task2;

public class Text
{
    String text;

    @Override
    public String toString()
    {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }

    public Text()
    {
    }

    public Text(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
}
