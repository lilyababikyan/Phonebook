package phonebook;

public enum ContactGroup {
    FamilyGroup ("Family"),
    FriendGroup ("Friend"),
    CollegeGroup ("College"),
    OtherGroup ("Other");
    private final String ContactGroup;
    ContactGroup(String ContactGroup) {
        this.ContactGroup = ContactGroup;
    }

}

