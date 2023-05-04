package threadMarch23.LLD.Builder;

public class House {
	
	private String WallType;
	private String buildWindows;
	private String buildRoof;
	private String backYard;
	private String carParking;
	private int    noOfRooms;
	private boolean hasBalcony;
	private boolean hasElectricWiring;
	
	//Monster Constructor
	public House(String WallType, String buildWindows, String buildRoof, String backYard, int noOfRooms,
			boolean hasBalcony, boolean hasElectricWiring, String carParking) {
		super();
		this.WallType = WallType;
		this.buildWindows = buildWindows;
		this.buildRoof = buildRoof;
		this.backYard = backYard;
		this.noOfRooms = noOfRooms;
		this.hasBalcony = hasBalcony;
		this.hasElectricWiring = hasElectricWiring;
		this.carParking = carParking;
	}

	//Copy Constructor
	public House(HouseBuilder builder) {
		this.WallType = builder.getWallType();
		this.buildWindows = builder.getBuildWindows();
		this.buildRoof = builder.getBuildRoof();
		this.backYard = builder.getBackYard();
		this.noOfRooms = builder.getNoOfRooms();
		this.hasBalcony = builder.isHasBalcony();
		this.hasElectricWiring = builder.isHasElectricWiring();
		this.carParking = builder.getCarParking();
	}

	public String getBuildWindows() {
		return buildWindows;
	}

	public void setBuildWindows(String buildWindows) {
		this.buildWindows = buildWindows;
	}

	public String getBuildRoof() {
		return buildRoof;
	}

	public void setBuildRoof(String buildRoof) {
		this.buildRoof = buildRoof;
	}

	public String getBackYard() {
		return backYard;
	}

	public void setBackYard(String backYard) {
		this.backYard = backYard;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public boolean isHasBalcony() {
		return hasBalcony;
	}

	public void setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}

	public boolean isHasElectricWiring() {
		return hasElectricWiring;
	}

	public void setHasElectricWiring(boolean hasElectricWiring) {
		this.hasElectricWiring = hasElectricWiring;
	}

	/**
	 * @return the carParking
	 */
	public String getCarParking() {
		return carParking;
	}

	/**
	 * @param carParking the carParking to set
	 */
	public void setCarParking(String carParking) {
		this.carParking = carParking;
	}

	/**
	 * @return the wallType
	 */
	public String getWallType() {
		return WallType;
	}

	/**
	 * @param wallType the wallType to set
	 */
	public void setWallType(String wallType) {
		WallType = wallType;
	}

	@Override
	public String toString() {
		return "House [WallType=" + WallType + ", buildWindows=" + buildWindows + ", buildRoof=" + buildRoof
				+ ", backYard=" + backYard + ", carParking=" + carParking + ", noOfRooms=" + noOfRooms + ", hasBalcony="
				+ hasBalcony + ", hasElectricWiring=" + hasElectricWiring + "]";
	}
	
	
}
