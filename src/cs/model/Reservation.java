package cs.model;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
*
* @author Jiyu Xiao
*/
public class Reservation {

	private final IntegerProperty resid;
	private Calendar startdate;
	private Calendar returndate;
	private Set<Equipment> equip;
	private final IntegerProperty bid;
	private final StringProperty vid;
	private final StringProperty cname;
	private final StringProperty cphonenum;
	
	/**
	 * Default constructor
	 */
	public Reservation() {
		this.resid = new SimpleIntegerProperty (-1);
		this.startdate = Calendar.getInstance();
		this.returndate = Calendar.getInstance();
		this.equip = new HashSet<Equipment>();
		this.bid = new SimpleIntegerProperty (-1);
		this.vid = new SimpleStringProperty (null);
		this.cname = new SimpleStringProperty(null);
		this.cphonenum = new SimpleStringProperty(null);
	}
	
	public int getResid() {
		return resid.get();
	}
	
	public void setResid(int t){
		this.resid.set(t);
	}
	
	public Calendar getStartdate() {
		return startdate;
	}
	
	public void setStartdate(Calendar startd){
		this.startdate = startd;
	}
	
	
	public Calendar getReturndate(){
		return returndate;
	}
	
	public void setReturndate(Calendar returnd){
		this.returndate = returnd;
	}
	
	public Set<Equipment> getequip(){
		return equip;
	}
	
	public void setequip(Set<Equipment> e){
		this.equip = e;
	}
	
	public int getBid() {
		return bid.get();
	}
	
	public void setBid(int t){
		this.bid.set(t);
	}
	
	public String getVid() {
		return vid.get();
	}
	
	public void setVid(String t){
		this.vid.set(t);
	}
	
	public String getCname() {
		return cname.get();
	}
	
	public void setCname(String n){
		this.cname.set(n);
	}
	
	public String getCphonenum() {
		return cphonenum.get();
	}
	
	public void setCphonenum(String n){
		this.cphonenum.set(n);
	}

}
