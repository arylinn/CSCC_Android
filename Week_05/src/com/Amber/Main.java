package com.Amber;


public class Main{
    public static void main (String[] args){
        AddressBook myAddressBook = new AddressBook();
        myAddressBook.newContact("Amber", "arylinn93@gmail.coom");
        myAddressBook.newContact("Eric", "gullett@yahoo.com");
        myAddressBook.newContact("Tina", "christina.kennedy@gmail.com");
        myAddressBook.newContact("Bella", "pearsoni@ohiodominican.edu");

        String bellasEmail = myAddressBook.searchByName("Izabella");
        System.out.println("Bella's email is " + bellasEmail);

    }
}