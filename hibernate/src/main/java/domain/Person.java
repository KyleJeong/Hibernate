package domain;

public class Person {
	
	private int num;
	private int code;
	
	public Person(){
		
	}
	public Person(int num,int code){
		this.num = num;
		this.code = code;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	

}
