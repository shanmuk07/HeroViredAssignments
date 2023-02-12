package pkg_09_02_23;

import java.util.*;
import java.io.*;
class ResidentialSociety{
	String societyName,location,secretoryName;
	ResidentialSociety(String societyName,String location,String secretoryName){
		this.societyName = societyName;
		this.location = location;
		this.secretoryName = secretoryName ;
	}
	void viewDetailsSociety() {
    	System.out.println("Society Name : "+this.societyName + " Location : " + this.location + " Secretory Name : "+ this.secretoryName);
    }
}

class building extends ResidentialSociety {
	String buildingName;
	int totalNumberOfApartments;
	building(String buildingName,int totalNumberOfApartments,String societyName,String location,String secretoryName) {
		super( societyName, location, secretoryName);	
		this.buildingName = buildingName;
		this.totalNumberOfApartments = totalNumberOfApartments;
	}
	void viewDetailsBuilding() {
    	System.out.println("Building name : "+this.buildingName + " total Number of Apartments : " + this.totalNumberOfApartments);
    }
}

class apartment extends building{
    int apartmentNumber;
    String ownerName;
    String electricMeterNumber;
    apartment(int apartmentNumber, String ownerName, String electricMeterNumber,String buildingName,int totalNumberOfApartments,String societyName,String location,String secretoryName){
    	super( buildingName, totalNumberOfApartments, societyName, location, secretoryName);
    	this.apartmentNumber = apartmentNumber;
    	this.ownerName = ownerName;
    	this.electricMeterNumber = electricMeterNumber;
    }
    void viewDetails() {
    	System.out.println("Apartment Number : "+this.apartmentNumber + " Owner Name : " + this.ownerName+" Electric Meter Number : "+this.electricMeterNumber);
    }
}

public class BuildingAndApartments {

	public static void main(String[] args) {
		
		List<String[]> li = read("sample.csv");
		apartment a1[] = new apartment[10];
    	apartment a2[] = new apartment[10];
    	apartment a3[] = new apartment[10];
    	int i = 0, j = 0, k =0 ;
    	for(String[] ele:li) {
    		if(ele[1].compareTo("A")== 0) {
    			a1[i] = new apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],10,"Galaxy-Apartment Residential Society"," Banjara Hills, Hyderabad","Shanmukh");
    					i++;
    		}else if(ele[1].compareTo("B") == 0) {
    			a2[j] = new apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],10,"Galaxy-Apartment Residential Society"," Banjara Hills, Hyderabad","Sai ganesh");
				j++;
    		}else {
    			a3[k] = new apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],10,"Galaxy-Apartment Residential Society"," Banjara Hills, Hyderabad","Satya");
				k++;
    		}
    	}
    	int t;
    	System.out.println("Apartment Details \n ");
    	for(t = 0 ; t < i ; t++)
    		a1[t].viewDetails();
    	for(t = 0 ; t < j ; t++)
    		a2[t].viewDetails();
    	for(t = 0 ; t < k ; t++)
    		a3[t].viewDetails();
    	System.out.println("Building Details \n ");
    	for(t = 0 ; t < i ; t++)
    		a1[t].viewDetailsBuilding();
    	for(t = 0 ; t < j ; t++)
    		a2[t].viewDetailsBuilding();
    	for(t = 0 ; t < k ; t++)
    		a3[t].viewDetailsBuilding();
    	System.out.println("Society Details \n ");
    	for(t = 0 ; t < i ; t++)
    		a1[t].viewDetailsSociety();
    	for(t = 0 ; t < j ; t++)
    		a2[t].viewDetailsSociety();
    	for(t = 0 ; t < k ; t++)
    		a3[t].viewDetailsSociety();
	}
	public static List<String[]> read(String File){
		ArrayList<String[]> li = new ArrayList<>();
		try {
	         File file = new File(File);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(",");
	            li.add(tempArr);
	         }
	         br.close();
	         } catch(IOException ioe) {
	            
	         }
		return li;

	}

}
