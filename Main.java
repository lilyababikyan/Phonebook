package phonebook;

import java.util.Scanner;

public class Main {
        private static final Scanner s = new Scanner(System.in);
        private static String first = "";
        private static String last = "";
        private static String number = "";
        private static String mail = "";
        private static String numberType = "";
        private static String contactGroup = "";
        private static int menu()
        {
            System.out.println("What would you like to do?"+
                    "1) Display all contacts "+
                    "2) Add a contact "+
                    "3) Remove a contact "+
                    "4) Search a contact "+
                    "5) Update a contact "+
                    "6) Exit");
            System.out.print("Your choice: ");
            return s.nextInt();
        }
        private static Contact userInfo()
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
            contactGroup= s.next();
            System.out.println("contact added.\n");
            Contact contact = new Contact(first, last, number, mail, numberType, contactGroup);
            return contact;
        }
        private static String userFullNameRemove()
        {
            System.out.print("Enter FirstName to Remove: ");
            return s.next();
        }

        private static String userFullNameSearch()
        {
            System.out.print("Enter FirstName to Search: ");
            return s.next();
        }
        private static String userFullNameUpdate()
        {
            System.out.print("Enter First Name of Contact: ");
            return s.next();
        }
        private static Contact updateContact()
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
            enum NumberType{Home, Mobile, Work };
            numberType = s.next();
            System.out.print("New Contact group: ");
            enum contactGroup {Family, Friend, College, other}
            contactGroup = s.next();
            System.out.println("Contact Successfully saved.");
            Contact contact = new Contact(first, last, number, mail, numberType, contactGroup);
            return contact;
        }
        public static void main(String[] args)
        {
            PhoneBook phoneBook = new PhoneBook("contact.txt");
            if(phoneBook.load())
            {
                System.out.println("Welcome. AdressBook is loaded.\n");
            }

            /**
             * case 1 will display the menu
             * case 2 will add a new contact
             * case 3 will remove an existing contact
             * case 4 will search for an existing contact
             * case 5 will look for a contact and then it will remove it to update it with a new info
             * case 6 will exit the program saving all the new changes
             */
            while(true)
            {
                loop:switch(menu())
                {
                    case 1:
                        phoneBook.display();
                        break;
                    case 2:
                        phoneBook.add(userInfo());
                        break;
                    case 3:
                        if(phoneBook.remove(userFullNameRemove()))
                        {
                            phoneBook.display();
                        }
                        else
                        {
                            System.out.println("Unable to Remove. Contact Not found.");
                        }
                        break;
                    case 4:
                        phoneBook.search(userFullNameSearch());
                        break;
                    case 5:
                        if(phoneBook.remove(userFullNameUpdate()))
                        {
                            phoneBook.add(updateContact());
                        }
                        else
                            System.out.println("Not Found");
                        break;
                    case 6:
                        if (phoneBook.save()){
                            System.out.println("Changes are saved.");
                            System.exit(0);
                        }
                        break loop;
                    default:
                        System.out.print("Please choose a valid menu number!\n");
                }
            }
        }
    }