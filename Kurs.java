import java.util.ArrayList;

public class Kurs {
	
	private String name;
	private int price;
	private String educator;
	
	
	public Kurs(String name, int price,String educator) {
		
		this.educator=educator;
		this.name=name;
		this.price=price;
				
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getEducator() {
		return educator;
	}
	public void setEducator(String educator) {
		this.educator = educator;
	}
	
	
	

}
