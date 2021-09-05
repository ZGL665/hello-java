package day8_28;

public class Goods implements Comparable<Goods>{

	private String name;

	private int id;

	private String isbn;

	// 构造函数
	public Goods(String name, int id, String isbn) {
		this.name = name;
		this.id = id;
		this.isbn = isbn;
	}

	
	
	// set get方法
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String  getIsbn() {
		return isbn;
	}

	//重写compareTo方法
	@Override
	public int compareTo(Goods o) {
		
		//return this.id-o.id;
		return this.isbn.compareTo(o.isbn);
		
		
		
	}



	@Override
	public String toString() {
		
		return this.id+"-"+this.isbn+"-"+this.name;
	}

	
	
	
	
}
