package com.Amber;

abstract class Contact {

    public String name;

    public Contact(String name){
        this.name = name;
    }

    public abstract void display();

}

class Faculty extends Contact{
    private String email;

    public Faculty(String name, String email){
        super(name);
        this.email = email;
    }

    @Override
    public void display() {
        System.out.println("Emailing Faculty: " + this.name);
        System.out.println("Emailing ..." + this.email);
    }
}

class Student extends Contact {
    private String phone;

    public Student(String name, String phoneNumber) {
        super(name);
        this.phone = phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("Calling Student: " + this.name);
        System.out.println("Calling ..." + this.phone);
    }

}

public class Main {

    public static void main(String[] args) {

        Faculty person1 = new Faculty("amber", "kennedya4@ohiodominican.edu");
        person1.display();

        Student person2 = new Student("Bob", "123-456-7890");
        person2.display();

    }

}