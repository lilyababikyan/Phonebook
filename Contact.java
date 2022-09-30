package phonebook;

public class Contact {
    private String number;
    private String firstName;
    private String lastName;
    private String mail;
    private String numberType;
    private String contactGroup;


    public Contact(String number, String firstName, String lastName, String mail, String numberType, String contactGroup) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.numberType = numberType;
        this.contactGroup = contactGroup;
    }

    public Contact(String first, String last, String number) {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumberType() {
        return numberType;
    }

    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.number + " " + this.mail + " " + this.contactGroup + this.numberType + " ";
    }
}
