package day8_28;

public class Dog {
	
	
	public String name;

	@Override
	public int hashCode() {
		
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
	
		return name.equals(((Dog)obj).name);
	}
	
	

}
