package phonebook;

import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
public class PhoneBook {
    String number;
    String first;
    String last;

    private Scanner s = new Scanner(System.in);
        private Contact contact[] = new Contact[100];
        private int count;
        private String fileName;

        public PhoneBook(String fileName)
        {
            this.fileName = fileName;
            for (int j = 0; j < 100; j++) {
                contact[j] = new Contact(first, last, number);
            }
        }

        public boolean add(Contact c)
        {
            if(count <= 100)
            {
                contact[count] = c;
                count++;
                return true;
            }
            else
                System.out.println("The directory is full\n");
            return false;
        }
        public boolean remove(String fullName)
        {
            int index = -1;
            for(int i = 0; i < count; i++)
            {
                if (fullName.equals(contact[i].getFirstName()))
                {
                    index = i;
                    for(int j=index; j<count; j++)
                    {
                        contact[j] = contact[j+1];
                    }
                    count--;
                    return true;
                }
            }
            return false;
        }
        public Contact search(String fullName)
        {
            for(int i = 0; i <count; i++)
                if(fullName.equals(contact[i].getFirstName()))
                {
                    System.out.println("Name\t\t       Phone Number\n" +
                            "-------------------------------------");
                    System.out.print(contact[i].getFirstName() + " " +
                            contact[i].getLastName() + "\t\t");
                    System.out.println(contact[i].getNumber());
                    System.out.println("-------------------------------------\n");
                }
                else
                    System.out.println("Contact Not Found.\n");
            return null;
        }
        public void display()
        {
            System.out.println("Name\t\t       Phone Number\n" +
                    "-------------------------------------");
            for(int i = 0;  i < count; i++)
            {
                System.out.print(contact[i].getFirstName() + " " + contact[i].getLastName());
                System.out.format("%21s%n", contact[i].getNumber());
            }
            System.out.println("-------------------------------------\n");
        }
        public boolean load()
        {
            try {
                count = 0;
                int lineNumber = 3;
                Scanner s = new Scanner(new File(fileName));
                while(s.hasNext())
                {
                    if(lineNumber % 3 == 0 )
                        this.contact[count].setFirstName(s.next());
                    if(lineNumber % 3 == 1 )
                        this.contact[count].setLastName(s.next());
                    if(lineNumber % 3 == 2 )
                    {
                        this.contact[count].setNumber(s.next());
                        count++;
                    }
                    lineNumber++;
                }
                s.close();
                return true;
            }
            catch (FileNotFoundException c)
            {
                System.out.println("Unable to read file.");
                System.exit(0);
            }
            return false;
        }
        public boolean save()
        {
            try
            {
                FileWriter writer = new FileWriter(new File(fileName));
                for(int i = 0; i < count; i++)
                {
                    writer.write(contact[i].getFirstName());
                    writer.write("\n");
                    writer.write(contact[i].getLastName());
                    writer.write("\n");
                    writer.write(contact[i].getNumber());
                    writer.write("\n\n");
                }
                writer.close();
                return true;
            }
            catch (IOException c)
            {
                System.out.println("Unable to save.");
            }
            return false;
        }
    }
