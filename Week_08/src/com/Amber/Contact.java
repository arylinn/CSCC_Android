package com.Amber;

/**
 * Created by Amber on 2/25/2016.
 */
public class Contact {
    private String name;
    private String email;

    Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name.toLowerCase());
        System.out.println("E-mail: " + email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        return this.name.equals(other.getName()) && this.email.equals(other.getEmail());
    }

    public boolean sendEmail(String messge) {
        return true;
    }
}
