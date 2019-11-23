/**
 *   Nuclear Outage datasource
 *   https://api.eia.gov/category/?api_key=cb63dd5c0e63edacebf16a18f012596b&category_id=2889994
 */
package eia.opendata.nuke.dao;

import java.util.List;

import eia.opendata.nuke.model.NuclearPowerPlant;

/**
 * @author Sabine
 *
 */
public class NuclearPowerPlantDAO {
   public NuclearPowerPlantDAO() {
      super();
   }

   // Nuclear Outage datasource
   // https://api.eia.gov/category/?api_key=cb63dd5c0e63edacebf16a18f012596b&category_id=2889994
   public static final String API_KEY = "cb63dd5c0e63edacebf16a18f012596b";
   public static final String CATEGORY_ID = "2889994";
    
   private NuclearPowerPlant nuclearPowerPlant = new NuclearPowerPlant();
   
   public String getNuclearPowerPlantData() {
	   String nuclearPowerPlantData = "https://api.eia.gov/category/?api_key=" + API_KEY + "&category_id=" + CATEGORY_ID;
	   
	   
	   return nuclearPowerPlantData;
   }
    
}
