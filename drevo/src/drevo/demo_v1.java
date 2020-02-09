package drevo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class demo_v1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello , this program can help you create your tree of family ");	
		
		BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int date_of_birth;
		String date_of_dead;
		String mother_name;
		String dad_name;
		String ans;
		
		ArrayList<Person> all_people = new ArrayList<Person>();
		ArrayList<String> name_for_next_person  = new ArrayList<String>();
		
		do {
		
		System.out.print("Name ");
		name = scn.readLine();
		
		System.out.print("Date_of_birth ");
		date_of_birth = Integer.parseInt(scn.readLine());
		
		System.out.print("Date_of_dead ");
		date_of_dead = scn.readLine();
		
		System.out.print("mother name " );
		mother_name = scn.readLine();
		
		System.out.print("dad name ");
		dad_name = scn.readLine();
		
		all_people.add(new Person(name,date_of_birth,date_of_dead,mother_name,dad_name));
		
		name_for_next_person.add(mother_name);
		name_for_next_person.add(dad_name);
		
		System.out.println("Have you information about? " + name_for_next_person.get(0)+".Write yes or no");
		ans = scn.readLine();
		
		while(ans.equals("no")) {
			
			all_people.add(new Person(name_for_next_person.get(0),0,"?","?","?"));
			name_for_next_person.remove(0);
			System.out.println("Do you have information about " + name_for_next_person.get(0)+"write yes or no");
		
		if(name_for_next_person.size()==0) {
			break;
		}
		
		}
		if(name_for_next_person.size()==0) {
			break;
		}
		name_for_next_person.remove(0);
		}while( name_for_next_person.size()!=0 );
	}		
}