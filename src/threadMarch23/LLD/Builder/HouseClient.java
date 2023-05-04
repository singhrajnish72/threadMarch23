package threadMarch23.LLD.Builder;

public class HouseClient {

	public static void main(String[] args) {
		
		//Here for making simpleHouse object we have used constructor approach where we can see 
		//most of fields are null as we don't require to initialize those fields. 
		//backyard, carparking, electricity is not required for simple house.
		House simpleHouse = new House("brickHouse", "woodWindow","roof" ,null, 0, false, false, null);
		
		/*
		 * Due to above problem we create a builder interface having all the steps
		 * required to build house. Concerete class - There will be Builder class which
		 * will implement the interface. Director class - This class will control what
		 * are the steps required to build the house.
		 */
		
		CivilEngineer civilEngineer = new CivilEngineer();
		House house1 = civilEngineer.buildSimpleHouse();
		House house2 = civilEngineer.buildLuxuryHouse();
		System.out.println("House1:"+house1);
		System.out.println("House2:"+house2);

	} 

}
