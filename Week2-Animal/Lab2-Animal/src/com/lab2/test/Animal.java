package com.lab2.test;

import java.util.PrimitiveIterator;

public class Animal
{
    private String Name;
    private String Breed;
    private String Colour;
    private int Age;
    private boolean Domestic;
    private boolean Old;
    private String Noise;

    //Constructor for the name
    public Animal(String Name)
    {
        this.Name= Name;

    }

    public Animal(String Name,String Breed, String Colour,int Age,boolean Domestic,boolean old) {
        this.Name = Name;
        this.Breed = Breed;
        this.Colour= Colour;
        this.Age= Age;
        this.Domestic= Domestic;
        this.Noise= Noise;

    }

    @Override
    public String toString() {
        return "Animal  " + "Name='" + Name + '\'' +
                ", Breed='" + Breed + '\'' +
                ", Colour='" + Colour + '\'' +
                ", Age=" + Age +
                ", Domestic=" + Domestic + ", Noise ="+
                '}';
    }


    //getter and setters for Name
    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    //getter and setter for Breed
    public String getBreed()
    {
        return Breed;
    }

    public void setBreed(String breed)
    {
        Breed = breed;
    }


    //getter and setter Colour
    public String getColour()
    {
        return Colour;
    }

    public void setColour(String colour)
    {
        Colour = colour;
    }


    //getter and setter age
    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        Age = age;
    }


    //getter and setter Domestic
    public boolean isDomestic()
    {
        return Domestic;
    }

    public void setDomestic(boolean domestic)
    {
        Domestic = domestic;
    }


    //Part 5
    public void makeNoise()
    {
        if (Breed =="Mouse")
        {
          System.out.println("Squeeeeeek");
        }
        if(Breed == "Cat")
        {
            System.out.println("Meeeowwww");
        }
        if(Breed == "Platypus")
        {
            System.out.println("grrrrrr");
        }
        if(Breed == "Squirel")
        {
            System.out.println("squuueuueue");
        }
    }



    // part 6
    public void makeNoise(boolean old)
    {
        if(old)
        {
            System.out.println("quiet");
        }
        else
        {
            makeNoise();
        }
    }

}
