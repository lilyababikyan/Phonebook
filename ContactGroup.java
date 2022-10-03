package phonebook;

public enum ContactGroup {
    FamilyGroup ("Family"),
    FriendGroup ("Friend"),
    CollegeGroup ("College"),
    OtherGroup ("Other");
    private final String group;
    ContactGroup(String group) {
        this.group = group;
    }
    public String getGroup(){
        return group;
    }
}

