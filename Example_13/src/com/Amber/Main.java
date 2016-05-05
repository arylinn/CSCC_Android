package com.Amber;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Amber on 4/7/2016.
 */

class contact  {
    String name;
    String email;

    contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return ("Name: " + name + ", Email:" + email);
    }

}

class ContactCollections implements Iterable<contact>
{
    List<contact> contacts = new ArrayList<>();

    public void addContact(contact newContact)
    {

        contacts.add(newContact);
    }

    public List<contact> getContacts()
    {

        return getContacts();
    }

    @Override
    public Iterator<contact> iterator() {

        return contacts.iterator();
    }

    @Override
    public void forEach(Consumer<? super contact> action) {

    }

    @Override
    public Spliterator<contact> spliterator() {
        return null;
    }
}
public class Main {
    public static void main (String[] args)
    {
        contact bob = new contact("Bob", "bob@bob.com");
        contact arthur = new contact("Arthur", "aneuman1@cscc.edu");
        contact aurther2 = new contact("Arthur", "arthur@aruthr.com");

        ContactCollections contacts = new ContactCollections();
        contacts.addContact(bob);
        contacts.addContact(arthur);
        contacts.addContact(aurther2);

        for (contact Contact : contacts) {
            System.out.println(Contact);
        }
    }
}
