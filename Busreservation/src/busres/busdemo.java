package busres;
import java.util.*;
import java.io.*;
public class busdemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<booking> bookings = new ArrayList<>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,45));
		int option;
		
		
		do {
            System.out.println("Enter 1 to view the bus information");
			System.out.println("Enter 2 to procced booking... ");
			System.out.println("Enter 3 to exit");
			Scanner sc=new Scanner(System.in);
			 option =sc.nextInt();
			switch (option) {
		case 1 :
			  for(Bus b:buses) {
				  b.Businformation();
			  }
		case  2 :
			  booking book = new booking();
			  if(book.isavailable(bookings,buses)) {
				  bookings.add(book);
				  System.out.println("Your booking is conformed");
			  }
			  else
				  System.out.println("Sorry Bus is full. Try another bus or date");
			break;
		case  3 :
		     break;
		 default :
		     break;
				
			}
		}
		while(option !=3);

	}

}
