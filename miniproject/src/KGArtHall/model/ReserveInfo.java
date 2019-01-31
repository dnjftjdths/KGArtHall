package KGArtHall.model;

import java.util.Date;

public class ReserveInfo {
	private String id;
	private String name;
	private Date date;
	private int number;
	private int reserveno;
	
	public ReserveInfo(){}
	
	public ReserveInfo(String id, String name, Date date, int number, int reserveno) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.number = number;
		this.reserveno = reserveno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	
	public int getNumber() {
		return number;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getReserveno() {
		return reserveno;
	}
	public void setReserveno(int reserveno) {
		this.reserveno = reserveno;
	}
	
}
