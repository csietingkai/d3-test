package sk.bsmk.d3js.model;

public class YearData {

	private int year;
	private int month;
	private int money;

	public YearData(int year, int month, int money) {
		super();
		this.year = year;
		this.month = month;
		this.money = money;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}
