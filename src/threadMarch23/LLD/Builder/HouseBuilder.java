package threadMarch23.LLD.Builder;

public class HouseBuilder {
	
	private String WallType;
	private String buildWindows;
	private String buildRoof;
	private String backYard;
	private String carParking;
	private int    noOfRooms;
	private boolean hasBalcony;
	private boolean hasElectricWiring;
	
	public HouseBuilder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public House build(HouseBuilder builder) {
		//use copy constructor of House
		//we can add validation before creating House object.
		return new House(builder);
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
	public HouseBuilder setWallType(String wallType) {
		this.WallType = wallType;
		return this;
	}
	/**
	 * @return the buildWindows
	 */
	public String getBuildWindows() {
		return buildWindows;
	}
	/**
	 * @param buildWindows the buildWindows to set
	 */
	public HouseBuilder setBuildWindows(String buildWindows) {
		this.buildWindows = buildWindows;
		return this;
	}
	/**
	 * @return the buildRoof
	 */
	public String getBuildRoof() {
		return buildRoof;
	}
	/**
	 * @param buildRoof the buildRoof to set
	 */
	public HouseBuilder setBuildRoof(String buildRoof) {
		this.buildRoof = buildRoof;
		return this;
	}
	/**
	 * @return the backYard
	 */
	public String getBackYard() {
		return backYard;
	}
	/**
	 * @param backYard the backYard to set
	 */
	public HouseBuilder setBackYard(String backYard) {
		this.backYard = backYard;
		return this;
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
	public HouseBuilder setCarParking(String carParking) {
		this.carParking = carParking;
		return this;
	}
	/**
	 * @return the noOfRooms
	 */
	public int getNoOfRooms() {
		return noOfRooms;
	}
	/**
	 * @param noOfRooms the noOfRooms to set
	 */
	public HouseBuilder setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
		return this;
	}
	/**
	 * @return the hasBalcony
	 */
	public boolean isHasBalcony() {
		return hasBalcony;
	}
	/**
	 * @param hasBalcony the hasBalcony to set
	 */
	public HouseBuilder setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
		return this;
	}
	/**
	 * @return the hasElectricWiring
	 */
	public boolean isHasElectricWiring() {
		return hasElectricWiring;
	}
	/**
	 * @param hasElectricWiring the hasElectricWiring to set
	 */
	public HouseBuilder setHasElectricWiring(boolean hasElectricWiring) {
		this.hasElectricWiring = hasElectricWiring;
		return this;
	}
}
