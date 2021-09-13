/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Hashtable;

public class App
{
    public static void main( String[] args )
    {
        Hashtable<String, String> userPass = new Hashtable<String, String>();

        userPass.put("noobmaster69", "thor_is_bad_at_fortnite");
        userPass.put("username", "Passwerd");
        userPass.put("epicgamer99", "ePiC_gaMer_135");

        String inputUsername = Input.GetString("What is the username? ");
        String inputPassword = Input.GetString("What is the password? ");

        if (userPass.containsKey(inputUsername) && userPass.get(inputUsername).equals(inputPassword)) {
            System.out.printf("Welcome, %s!", inputUsername);
        }
        else {
            System.out.print("I don't know you.");
        }
    }
}