package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        

        Cat cat = new Cat("Grizabella","white", 29);

        output("Name: " + cat.name);
        output("Fellfarbe: " + cat.furColor);
        output("Alter " + cat.age);
       // output(Integer.toString(cat.age));

        output("-----------------");

        Cat cat1 = new Cat("Eminem","MomsSpaghetti", 40);
        
        
        cat1.setFurColor("grey");

        output("Name: " + cat1.getName());
        output("Fellfarbe: " + cat1.getFurColor());
        output("Alter " + cat1.getAge());

        //output("Blick von aussen: " + cat1);
        //output("Blick von innen: " + cat1.tellYourAddress());
        //output("-----------------");




    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

