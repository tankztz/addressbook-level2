package seedu.addressbook.data.tag;

import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.person.Person;

public class Tagging {
	
	public enum Status {
		ADD, DELETE;
	}
	
	private Status status;
	private final Person person;
	private final Tag tag;
	

	
	public Tagging(Status st, Person p, Tag t) {
		this.status = st;
		this.person = p;
		this.tag = t;
	}
	
	public String toString() {
		String str = "";
		if (status.equals(Status.ADD)) {
			str = "+ " + person.getName() + " " + tag;
		} else if (status.equals(Status.DELETE)) {
			str = "- " + person.getName() + " " + tag;
		}
		return str;
	}
}
