package KGArtHall.model;

import java.util.Calendar;

public class ConcertInfo {
	private Calendar startday;
	private Calendar endday;
	private String place;
	private int price;
	private String cast;
	public Calendar getStartday() {
		return startday;
	}
	public void setStartday(Calendar startday) {
		this.startday = startday;
	}
	public Calendar getEndday() {
		return endday;
	}
	public void setEndday(Calendar endday) {
		this.endday = endday;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	
	public ConcertInfo(){}
	public ConcertInfo(Calendar startday, Calendar endday, String place, int price, String cast) {
		this.startday = startday;
		this.endday = endday;
		this.place = place;
		this.price = price;
		this.cast = cast;
	}
}
