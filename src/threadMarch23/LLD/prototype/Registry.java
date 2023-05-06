package threadMarch23.LLD.prototype;

import java.util.Map;

public class Registry {
    
	Map<String,Student> map;

	public Registry() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the map
	 */
	public Map<String, Student> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, Student> map) {
		this.map = map;
	} 
}
