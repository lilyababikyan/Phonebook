package phonebook;


import java.util.Scanner;
import java.lang.System;

/**
 * Type for testing Phonebook
 * @author Lilya
 */
public class Main {
    public static void main(String[] args) {

            PhoneBook.PhoneContacts contact = new PhoneBook.PhoneContacts();

    }

//        private static NumberType numberType(final int numberType){
//            switch (numberType) {
//                case 1 -> {
//                    return Home;
//                }
//
//                case 2 -> {
//                    return Mobile;
//                }
//
//                case 3 -> {
//                    return Work;
//                }
//            }
//            return null;
//        }

        String first = "";
        String last = "";
        String number = "";
        String mail = "";
        String numberType = "";
        String contactGroup = "";

    {
        new PhoneBook.PhoneContacts().menu();
        boolean exit = false;
        while (!exit) {

            Scanner s = new Scanner(System.in);
            int option;
            showOptions();

            switch (s.nextInt()) {

                case 1 -> {
                    new PhoneBook.PhoneContacts().add(new Contact());
                    {
                        System.out.print("First Name: ");
                        first = s.next();
                        System.out.print("Last Name: ");
                        last = s.next();
                        System.out.print("Phone Number: ");
                        number = s.next();
                        System.out.print("Mail: ");
                        mail = s.next();
                        System.out.print("Number type: ");
                        numberType = s.next();
                        System.out.print("Contact group: ");
                        contactGroup = s.next();
                        System.out.println("contact added.\n");
                        PhoneBook.PhoneContacts contacts = new PhoneBook.PhoneContacts(first, last, number, mail, numberType, contactGroup);

                    }
                }
                case 2 -> {
                    new PhoneBook.PhoneContacts().remove(new String());


                    {
                        System.out.print("Enter FirstName to Remove: ");
                        PhoneBook.PhoneContacts contacts = new PhoneBook.PhoneContacts(first, last, number, mail, numberType, contactGroup);

                    }
                }
                case 3 -> {
                    new PhoneBook.PhoneContacts().search(new String());

                    {
                        System.out.print("Enter FirstName to Search: ");
                        PhoneBook.PhoneContacts contacts = new PhoneBook.PhoneContacts(first, last, number, mail, numberType, contactGroup);

                    }
                }
                case 4 -> {
                    new PhoneBook.PhoneContacts().display();

                    {
                        System.out.print("Enter First Name of Contact: ");
                        PhoneBook.PhoneContacts contacts = new PhoneBook.PhoneContacts(first, last, number, mail, numberType, contactGroup);

                    }
                }
                case 5 -> {
                    new PhoneBook.PhoneContacts().load();

               {
                        System.out.print("New First Name: ");
                        first = s.next();
                        System.out.print("New Last Name: ");
                        last = s.next();
                        System.out.print("New Phone Number: ");
                        number = s.next();
                        System.out.print("New Mail: ");
                        mail = s.next();
                        System.out.print("New Number type: ");
                        numberType = s.next();
                        System.out.print("New Contact group: ");
                        contactGroup = s.next();
                        System.out.println("Contact Successfully saved.");
                        PhoneBook.PhoneContacts contacts = new PhoneBook.PhoneContacts(first, last, number, mail, numberType, contactGroup);
    //                                            return contacts;
               }
                }

            }
                   break;
            }
        }
    /*
     * Menu outlook
     *
     * case 1 will display the menu
     * case 2 will add a new contact
     * case 3 will remove an existing contact
     * case 4 will search for an existing contact
     * case 5 will look for a contact and then it will remove it to update it with a new info
     * case 6 will exit the program saving all the new changes
     */

    private void showOptions() {
        System.out.println("What would you like to do?");
        System.out.println("1) Add a contact");
        System.out.println("2) Remove a contact ");
        System.out.println("3) Search a contact ");
        System.out.println("4) Update a contact ");
        System.out.println("5) Exit");
        System.out.println("6) Display all contacts");
        System.out.print("Your choice: ");
    }

    private void menu() {
    }
}//Main

