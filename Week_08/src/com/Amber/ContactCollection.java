package com.Amber;

import java.util.*;

/**
 * Created by Amber on 3/24/2016.
 */
public class ContactCollection {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact newContact)
    {
        contacts.add(newContact);
    }

    public void displayContacts()
    {
        for(Contact contact: contacts)
        {
            contact.display();
        }
    }
}
