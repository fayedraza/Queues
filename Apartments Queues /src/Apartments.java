//Created by Fayed Raza


public class Apartments {

Floor head;
 int x;

 //purpose is to add or remove floors using queues

 
   //this method is used by the createFloor method
	private void addfirstfloor(int occupant) {
		Floor floors = new Floor(occupant);
		
		floors.next = head;
		
		head = floors;
		x++;
		System.out.println("A new floor has been added with a capacity of " +occupant+" people");
	}
	
	
	//createFloor method is the add method
	//adds it to the top of the queue
	public void createFloor(int occupant) {
		if(x != 0) {
		Floor floors = new Floor(occupant);
		floors.next = null;
		Floor level = head;
            while(level.next != null) 
			 level = level.next; 
			  
				
			   level.next = floors;
		
		System.out.println("A new floor has been added with a capacity of " +occupant+" people");
	}else {
		addfirstfloor(occupant); 
	}
		
	}
	
	
	//this method is used by other methods to see if the queue exists
	public Boolean isEmpty() {
		return head == null;
	}
	
	//remove the first floor of the queue
	public void removeFirstFloor() {
		Floor level = head;
		if(!(isEmpty())) {
			head=head.next;
			System.out.println("First floor has been removed as of now");
		}else {
			System.out.println("Apartment building does not exist");
		}
	}
	
	
	//returns the latest floor of the queue
public void peak() {
	
	if(isEmpty()) {// checks if the queue is empty 
		System.out.println("Apartment building does not exist");
		return;
	}
	
	Floor level = head;

	loop: while(level != null) {
	if(level.next == null) {
		System.out.println("The last floor has " +level.people + " occupants");
		break loop;
	}
	level = level.next;
	
}
}


//prints all of the floors and its occupants
public void printAllFloor() {
	if(isEmpty()) {// checks if the queue is empty 
		System.out.println("Apartment building does not exist");
		return;
	}
	
	
	int y=1;
	Floor level = head;
	System.out.println("Amount of People");
	while(level != null) {
		System.out.println("Floor " + y + ": "+level.people + " occupants" );
		level = level.next;
		y++;
	}
	
}


	public static void main (String[]args) {
		Apartments b1 = new Apartments();
		Apartments b2 = new Apartments();
		
		b1.createFloor(7);
		b1.createFloor(9);
		b1.createFloor(19);
		b1.createFloor(29);
		b1.removeFirstFloor();
		b1.peak();
		
		b1.printAllFloor();
		System.out.println();
		b2.peak();
	
	}
}
