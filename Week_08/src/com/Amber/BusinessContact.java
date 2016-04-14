package com.Amber;

/**
 * Created by Amber on 4/14/2016.
 */
public class BusinessContact extends Contact {
    private String phoneNumber;

    BusinessContact(String name, String email, String phoneNumber){
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phone number: " + phoneNumber);
    }
}
