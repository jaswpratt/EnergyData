/**
 *   Nuclear Outage datasource
 *   https://api.eia.gov/category/?api_key=cb63dd5c0e63edacebf16a18f012596b&category_id=2889994
 */
package eia.opendata.nuke.dao;

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
    
}
