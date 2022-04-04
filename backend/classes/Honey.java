package classes;

import java.io.Serializable;

public class Honey implements Serializable {
	private static final long serialVersionUID = 111L;
	private String title;
	private String date;
	private String time;
	private String description;
	private Honey next;
	
	private int identifier;
	
	public Honey() {
		title = null;
		date = null;
		time = null;
		description = null;
		next = null;
		identifier = 0;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Honey getNext() {
		return next;
	}

	public void setNext(Honey next) {
		this.next = next;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}
}
