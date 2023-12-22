package main;

public class Pair <T,V>{
	T element1;
	V element2;
	
	public Pair(T element1, V element2) {
		this.element1 = element1;
		this.element2 = element2;
	}

	@Override
	public String toString() {
		return "Pair [element1= " + element1 + ", element2= " + element2 + "]";
	}
	

}
