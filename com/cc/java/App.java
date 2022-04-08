package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        

        Cat cat = new Cat();
       
        cat.name = "Grizabella";
        cat.furColor = "white";
        cat.age = 29;

        output("Name: " + cat.name);
        output("Fellfarbe: " + cat.furColor);
        output("Alter " + cat.age);
       // output(Integer.toString(cat.age));

        output("-----------------");

        Cat cat1 = new Cat();
        cat1.name = "Eminem";
        cat1.furColor = "momsspagetthi";
        cat1.age = 40;

        output("Name: " + cat1.name);
        output("Fellfarbe: " + cat1.furColor);
        output("Alter " + cat1.age);
        
        //output("Blick von aussen: " + cat1);
        //output("Blick von innen: " + cat1.tellYourAddress());
        //output("-----------------");




    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

