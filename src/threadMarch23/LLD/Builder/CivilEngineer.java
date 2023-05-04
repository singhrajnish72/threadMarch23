package threadMarch23.LLD.Builder;

public class CivilEngineer {

	HouseBuilder houseBuilder = new HouseBuilder();
	
	public House buildSimpleHouse() {
		return houseBuilder.setWallType("brick")
				           .setBuildWindows("wooden")
				           .setBuildRoof("bamboo")
				           .setNoOfRooms(2)
				           .build(houseBuilder);
	}

	public House buildLuxuryHouse() {
		return houseBuilder.setWallType("stone")
		           .setBuildWindows("glass")
		           .setBuildRoof("cement")
		           .setNoOfRooms(4)
		           .setBackYard("luxury")
		           .setCarParking("SUV")
		           .setHasElectricWiring(true)
		           .setHasBalcony(true)
		           .build(houseBuilder);
	}
}
