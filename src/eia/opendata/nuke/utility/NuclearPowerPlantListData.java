/**
 * 
 */
package eia.opendata.nuke.utility;

import java.util.List;

import eia.opendata.nuke.dao.NuclearPowerPlantDAO;

/**
 * @author Sabine
 *
 */
public class NuclearPowerPlantListData {

	public NuclearPowerPlantListData() {
		super();
	}
	
	public String getNuclearPowerPlantListData() {
		NuclearPowerPlantDAO nuclearPowerPlantDAO = new NuclearPowerPlantDAO();
		String nuclearPowerPlantData = nuclearPowerPlantDAO.getNuclearPowerPlantData();
		return nuclearPowerPlantData;
		
	}

}
