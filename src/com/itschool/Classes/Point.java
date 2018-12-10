package com.itschool.Classes;

public class Point
{
    String title;
    int x;
    int y;

    public Point()
    {
    }

    public Point(String title, int x, int y)
    {
        this.title = title;
        this.x = x;
        this.y = y;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return title + '(' + x + ", " + y + ')';
    }
}
