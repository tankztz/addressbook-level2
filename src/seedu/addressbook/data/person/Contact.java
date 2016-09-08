package seedu.addressbook.data.person;


public class Contact {
    public final String value;
    private boolean isPrivate;
    
    public Contact(String contact, boolean isPrivate) {
        this.isPrivate = isPrivate;
        contact = contact.trim();
        this.value = contact;
    }
    
    public boolean equals(Object other) {
        return other == this
                || (other instanceof Contact
                && this.value.equals(((Contact) other).value));
    }
    
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
    public String toString() {
        return value;
    }
}
