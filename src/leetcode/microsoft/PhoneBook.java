package leetcode.microsoft;
import java.util.*;
class Person{
	String name;
	int phoneNumber;
	
	Person(String name,int phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getStringFromObject(){
		return this.name +  " : " + this.phoneNumber;
	}
}

public class PhoneBook {
	static HashMap<String,Person> mapContacts = new HashMap();
	
	public static void addContacts(HashMap<String,Integer> inputContacts){
		for(Map.Entry<String, Integer> entry : inputContacts.entrySet()){
			Person p = new Person(entry.getKey(),entry.getValue());
			mapContacts.put(entry.getKey(), p);
		}
	}
	public static Person lookupByName(String name){
		if(mapContacts.containsKey(name)){
			return mapContacts.get(name);
		}
		return null;
	}
	public static Person lookupByNumber(int number){
		for(Map.Entry<String, Person> entry : mapContacts.entrySet()){
			int phone = entry.getValue().phoneNumber;
			if(number == phone){
				return entry.getValue();
			}
		}
		return null;
	}
	public static void deleteContact(String name){
		mapContacts.remove(name);
	}
	public static void displayContactList(){
		for(Map.Entry<String, Person> entry : mapContacts.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue().phoneNumber);
		}
	}
	public static void main(String[] args) {
		HashMap<String,Integer> contacts = new HashMap<String,Integer>();
		contacts.put("vinuta", 997876543);
		contacts.put("hari", 909876543);
		contacts.put("anita", 987665445);
		addContacts(contacts);
		System.out.println("Displaying contacts...");
		displayContactList();
		System.out.println("...................................");
		System.out.println("lookup contacts......");
		System.out.println(lookupByName("hari").getStringFromObject());
		System.out.println(lookupByNumber(987665445).getStringFromObject());
		System.out.println("...................................");
		deleteContact("vinuta");
		System.out.println("Displaying contacts after deletion...");
		displayContactList();
	}
	
}
