package com.Amber;

/**
 * Created by Amber on 2/25/2016.
 */
public class Contact {
    //instnce feilds
    private String name;
    private String email;

    public String getEmail()
    {
        return email;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Contact(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
}
