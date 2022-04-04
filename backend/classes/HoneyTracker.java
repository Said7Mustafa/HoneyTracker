package classes;

import java.io.Serializable;

import methods.DateTime_Comparing;
import methods.UniqueRandomNumber;

public class HoneyTracker implements Serializable{
	private static final long serialVersionUID = 111L;
	
	private Honey front;
	private Honey rear;
	private int size;
	
	
	
	public HoneyTracker() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public void enqueue(String title, String date, String time, String description) {
		Honey current = front;
		Honey beforeCurrent = new Honey();
		Honey newtask = new Honey(); 
		
		newtask.setTitle(title);
		newtask.setDate(date);
		newtask.setTime(time);
		newtask.setDescription(description);
		newtask.setNext(null);

		newtask.setIdentifier(UniqueRandomNumber.randomNumber(front));
		
		if (isEmpty()) {
			front = rear = newtask;
			size++;
		}
		
		else {
			while (current != null) { 
				if (DateTime_Comparing.dateComparing(date, current.getDate()) == -1) {
					if (current == front) {
						newtask.setNext(front);
						front = newtask;
						break;
					}
					else {
						beforeCurrent.setNext(newtask);
						newtask.setNext(current);
						break;
					}
				}
				else if (DateTime_Comparing.dateComparing(date, current.getDate()) == 0) {
					if (DateTime_Comparing.timeComparing(time, current.getTime()) == -1) {
						if (current == front) {
							newtask.setNext(front);
							front = newtask;
							break;
						}
						else {
							beforeCurrent.setNext(newtask);
							newtask.setNext(current);
							break;
						}
					}
					else if (current == rear) {
						rear.setNext(newtask);
						newtask.setNext(null);
						rear = newtask;
						break;
					}
				}
				else if (current == rear) {		
					rear.setNext(newtask);
					newtask.setNext(null);
					rear = newtask;
					break;
				}
				beforeCurrent = current;
				current = current.getNext();
			}
			size++;
		
		}
		
	}
	
	public void enqueueManual(int identifier ,String title, String date, String time, String description) {
		Honey current = front;
		Honey beforeCurrent = new Honey();
		Honey newtask = new Honey(); 
		
		newtask.setTitle(title);
		newtask.setDate(date);
		newtask.setTime(time);
		newtask.setDescription(description);
		newtask.setNext(null);
		newtask.setIdentifier(identifier);
		
		if (isEmpty()) {
			front = rear = newtask;
			size++;
		}
		
		else {
			while (current != null) { 
				if (DateTime_Comparing.dateComparing(date, current.getDate()) == -1) {
					if (current == front) {
						newtask.setNext(front);
						front = newtask;
						break;
					}
					else {
						beforeCurrent.setNext(newtask);
						newtask.setNext(current);
						break;
					}
				}
				else if (DateTime_Comparing.dateComparing(date, current.getDate()) == 0) {
					if (DateTime_Comparing.timeComparing(time, current.getTime()) == -1) {
						if (current == front) {
							newtask.setNext(front);
							front = newtask;
							break;
						}
						else {
							beforeCurrent.setNext(newtask);
							newtask.setNext(current);
							break;
						}
					}
					else if (current == rear) {
						rear.setNext(newtask);
						newtask.setNext(null);
						rear = newtask;
						break;
					}
				}
				else if (current == rear) {		
					rear.setNext(newtask);
					newtask.setNext(null);
					rear = newtask;
					break;
				}
				beforeCurrent = current;
				current = current.getNext();
			}
			size++;
		
		}
	}
	
	public void dequeue() {
		if (size != 0) {
			if (size == 1)
				front = rear = null;
			else 
				front = front.getNext();
			size--;	
		}else
			System.out.println("is empty");
	}
	
	public HoneyTracker updateCalendar() {
		HoneyTracker updated = new HoneyTracker();
		Honey current =  front;

		while (current != null) {
			updated.enqueue(current.getTitle(), current.getDate(), 
					current.getTime(), current.getDescription());
			current = current.getNext();
		}
		
		return updated;
	}
	
	public void delete(int identifier) {
		Honey current =  front;
		Honey prev = null;
		while (current != null) {
			if (current.getIdentifier() == identifier)
				break;
			prev = current;
			current = current.getNext();
		}
		if (current != null) {
			if (current == front) {
				if(size == 1)
					front = rear = null;
				else
					front = front.getNext();
			} 
			else if (current == rear){
				prev.setNext(null);
				rear = prev;
			}
			else
				prev.setNext(current.getNext());
			size--;
		}
	}
	
	private boolean isEmpty() {
		return size == 0;
	}

	public Honey getFront() {
		return front;
	}

	
	public int getSize() {
		return size;
	}
	
	
	
	
}
