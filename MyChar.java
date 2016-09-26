package net.ukr.geka3;

public class MyChar {
	private char ch;
	private int count = 1;

	public MyChar(char ch, int count) {
		super();
		this.ch = ch;
		this.count = count;
	}

	public MyChar() {
		super();

	}
	
	

	public MyChar(char ch) {
		super();
		this.ch = ch;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public char getCh() {
		return ch;
	}
	
	@Override
	public int hashCode(){
		return (int)this.ch;
	}
	
	@Override
	public boolean equals(Object o) throws IllegalArgumentException{
		if(this.getClass() != o.getClass()){
			throw new IllegalArgumentException();
		}
		MyChar mc = (MyChar) o;
		if(this.ch == mc.ch){
			return true;
		}else{
			return false;
		}
			
		
			
	}
	
	public void plusOne(){
		count++;
	}
	
	

}
