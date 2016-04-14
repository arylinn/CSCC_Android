package com.Amber;


public class Main {

    public static void main(String[] args) {
        Contact person1 = new Contact("Amber", "kennedya4@ohiodominican.edu");
        Contact person2 = new BusinessContact("Sue", "Sue123@gmail.com", "614-123-1234");

        person1.display();
        person2.display();

    }

}