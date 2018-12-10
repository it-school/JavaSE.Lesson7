package com.itschool.Classes.Task3;

public class Figure
{
    String title;
    int sidesNumber;
    Point[] points;

    public Figure()
    {
        sidesNumber = 3;
        points = new Point[sidesNumber];
    }

    public Figure(String title, int sidesNumber)
    {
        this.title = title;
        this.sidesNumber = sidesNumber;
        points = new Point[sidesNumber];
    }

    public Figure(int sidesNumber)
    {
        this.sidesNumber = sidesNumber;
        points = new Point[sidesNumber];
    }

    public Figure(String title, Point p1, Point p2, Point p3, Point p4)
    {
        this.title = title;
        points = new Point[4];

        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;

    }

    public Point[] getPoints()
    {
        return points;
    }

    public void setPoints(Point[] points)
    {
        this.points = points;
    }

    @Override
    public String toString()
    {
        String result = title + "\t";

        for (Point p : points)
        {
            result += " " + p;
        }

        return result;
    }

    public double getLengthSide(Point p1, Point p2)
    {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}
