package org.example.codeExercises;

import java.util.Scanner;

public class UserActivitySelector {
    public static void main(String[] args){
        System.out.println("Please, enter action name: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        switch(userInput){
            case "login":
                System.out.println("Please, enter your username");
                break;
            case "sign_up":
                System.out.println("Welcome!");
                break;
            case "terminate_program":
                System.out.println("Thank you! Good bye!");
                break;
            case "main_menu":
                System.out.println("Main menu");
                break;
            case "about_app":
                System.out.println("This app is created by me with support of " +
                        "\u00AEIT-Bulls.com");
                break;
            default:
                System.out.println("Please, enter one of these values: login, sign_up, " +
                        "terminate_program, main_menu, about_app");
        }
        sc.close();
    }


    /* email from erp -> power automate -> triggers powershell runbook
    premium connectors for power automate
    explain a scenario in which a power automate flow was created
    explain how azure runbook works
    how is runbook configured
    customization of out of box forms of SharePoint lists
    make column in sharepoint list read-only - go to list settings and select the columns you
    want to change permissions for and choose from the options.
    what are different integration connectors used for power automate
        - O365 connector, Schedule connector, Control connector, Data Operation connector

     how to generate certificate with power automate
     convert excel sheet data to sharepoint list
     anything specific for excel sheet to search for
     how to delete records from sharepoint list with power automate
     when new item is added to list, how to set permissions for read-write to that item for
        specific group
     */
}
