package com.itschool.Classes;

public class UkrainianAddress
{
    String index;
    String country;
    String city;
    String street;
    String house;
    int apartment;

    public String getIndex()
    {
        return index;
    }

    public boolean setIndex(String index)
    {
        if (index.length() == 5)
        {
            try
            {
                if (Integer.parseInt(index) > 0)
                {
                    this.index = index;
                    return true;
                }
            } catch (NumberFormatException exc)
            {
                //System.out.println("index is not number");
                //exc.printStackTrace();
            }
        }
        // System.out.println("Index is wrong!");
        this.index = "";
        return false;
    }

    public String getCountry()
    {
        return country;
    }

    public boolean setCountry(String country)
    {
        country = country.trim();
        if (country.length() > 0)
        {
            for (char c = 0; c < 65; c++)
            {
                if ((c == 32) || (c == 45))
                {
                    continue;
                }
                if (country.contains("" + c))
                {
                    return false;
                }
            }

            for (char c = 91; c < 97; c++)
            {
                if (country.contains("" + c))
                {
                    return false;
                }
            }

            for (char c = 123; c <= 255; c++)
            {
                if (country.contains("" + c))
                {
                    return false;
                }
            }
            country = (country.charAt(0) + "").toUpperCase() + country.substring(1);

            this.country = country;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getHouse()
    {
        return house;
    }

    public boolean setHouse(String house)
    {
        house = house.trim();
        if (house.length() > 0)
        {
            if (house.charAt(0) >= '0' && house.charAt(0) <= '9')
            {
                this.house = house;
                return true;
            }
        }
        return false;
    }

    public int getApartment()
    {
        return apartment;
    }

    public void setApartment(int apartment)
    {
        this.apartment = apartment;
    }

    public UkrainianAddress()
    {
        this.country = "";
        this.city = "";
        this.index = "";
        this.apartment = -1;
        this.house = "";
        this.street = "";
    }

    public UkrainianAddress(String index, String country, String city, String street, String house, int apartment)
    {
        this.setIndex(index);
        this.setCountry(country);
        this.setCity(city);
        this.setStreet(street);
        this.setHouse(house);
        this.setApartment(apartment);
    }

    public UkrainianAddress(String index, String city, String street, String house, int apartment)
    {
        this.setIndex(index);
        this.setCountry("Ukraine");
        this.setCity(city);
        this.setStreet(street);
        this.setHouse(house);
        this.setApartment(apartment);
    }
    @Override
    public String toString()
    {
        return "Ukrainian Address {" +
                "index='" + index + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", apartment=" + apartment +
                '}';
    }

}
