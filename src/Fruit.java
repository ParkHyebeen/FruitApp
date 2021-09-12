import java.util.Comparator;

public class Fruit{
	int no;
	String name;
	int price;
	
	Fruit(){};
	
	public Fruit(int i, String string, int j) {
		super();
		
		this.no = i;		
		this.name = string;
		this.price = j;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int i) {
		this.no = i;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int j) {
		this.price = j;
	}

	@Override
	public String toString() {
		return "Fruit [no = " + no + ", name = " + name + ", price = " + price + "]";
	}
	
}
	
class FruitComparator implements Comparator<Fruit>{
		
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
		
}
	
class FruitComparatorDesc implements Comparator<Fruit>{
		
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
		
		
}
