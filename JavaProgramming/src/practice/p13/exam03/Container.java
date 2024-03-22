package practice.p13.exam03;

public class Container <K,V>{
	private K k;
	private V v;
	
	public K getkey( ) {
		return k;
		
		
	}
	public V getValue( ) {
		return v;
	}
	public void set(K k , V v) {
		this.k = k;
		this.v = v;
	}
	
	
}
