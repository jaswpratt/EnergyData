package eia.opendata.nuke.model;

import java.util.TreeMap;

public class NuclearPowerPlant {
   public NuclearPowerPlant(){}
   
   private String series_id  = null;
   private String name = null;
   private String units  = null;
   private String f  = null;
   private String unitsshort  = null;
   private String description  = null;
   private String source  = null;
   private String iso3166  = null;
   private String lat  = null;
   private String lon  = null;
   private String geography  = null;
   private String start  = null;
   private String end  = null;
   private String last_updated  = null;
   private String latlon  = null;
   private TreeMap data  = null;
   
   /**
    * @return the series_id
    */
   public String getSeries_id() {
      return series_id;
   }
   
   /**
    * @param series_id the series_id to set
    */
   public void setSeries_id(String series_id) {
      this.series_id = series_id;
   }
   
   /**
    * @return the name
    */
   public String getName() {
      return name;
   }
   
   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }
   
   /**
    * @return the units
    */
   public String getUnits() {
      return units;
   }
   
   /**
    * @param units the units to set
    */
   public void setUnits(String units) {
      this.units = units;
   }
   
   /**
    * @return the f
    */
   public String getF() {
      return f;
   }
   
   /**
    * @param f the f to set
    */
   public void setF(String f) {
      this.f = f;
   }
   
   /**
    * @return the unitsshort
    */
   public String getUnitsshort() {
      return unitsshort;
   }
   
   /**
    * @param unitsshort the unitsshort to set
    */
   public void setUnitsshort(String unitsshort) {
      this.unitsshort = unitsshort;
   }
   
   /**
    * @return the description
    */
   public String getDescription() {
      return description;
   }
   
   /**
    * @param description the description to set
    */
   public void setDescription(String description) {
      this.description = description;
   }
   
   /**
    * @return the source
    */
   public String getSource() {
      return source;
   }
   
   /**
    * @param source the source to set
    */
   public void setSource(String source) {
      this.source = source;
   }
   
   /**
    * @return the iso3166
    */
   public String getIso3166() {
      return iso3166;
   }
   
   /**
    * @param iso3166 the iso3166 to set
    */
   public void setIso3166(String iso3166) {
      this.iso3166 = iso3166;
   }
   
   /**
    * @return the lat
    */
   public String getLat() {
      return lat;
   }
   
   /**
    * @param lat the lat to set
    */
   public void setLat(String lat) {
      this.lat = lat;
   }
   
   /**
    * @return the lon
    */
   public String getLon() {
      return lon;
   }
   
   /**
    * @param lon the lon to set
    */
   public void setLon(String lon) {
      this.lon = lon;
   }
   
   /**
    * @return the geography
    */
   public String getGeography() {
      return geography;
   }
   
   /**
    * @param geography the geography to set
    */
   public void setGeography(String geography) {
      this.geography = geography;
   }
   
   /**
    * @return the start
    */
   public String getStart() {
      return start;
   }
   
   /**
    * @param start the start to set
    */
   public void setStart(String start) {
      this.start = start;
   }
   
   /**
    * @return the end
    */
   public String getEnd() {
      return end;
   }
   
   /**
    * @param end the end to set
    */
   public void setEnd(String end) {
      this.end = end;
   }
   
   /**
    * @return the last_updated
    */
   public String getLast_updated() {
      return last_updated;
   }
   
   /**
    * @param last_updated the last_updated to set
    */
   public void setLast_updated(String last_updated) {
      this.last_updated = last_updated;
   }
   
   /**
    * @return the latlon
    */
   public String getLatlon() {
      return latlon;
   }
   
   /**
    * @param latlon the latlon to set
    */
   public void setLatlon(String latlon) {
      this.latlon = latlon;
   }
   
   /**
    * @return the data
    */
   public TreeMap getData() {
      return data;
   }
   
   /**
    * @param data the data to set
    */
   public void setData(TreeMap data) {
      this.data = data;
   }
}