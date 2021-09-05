package day8_28;

public class User {
	
	
	public String name;
	//重写hashcode方法和equals方法
	@Override
	public int hashCode() {
		
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.name.equals(((User)obj).name);
	}
	
	
	

}
