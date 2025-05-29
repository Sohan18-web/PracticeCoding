package designPattern;

public class SingletonDesignPattern {
	
	//Constructor invoke/called when created object
	private  static SingletonDesignPattern single1;
	
	private SingletonDesignPattern() {
		
	}
	
	public static SingletonDesignPattern getSingletonDesignPattern() {
		
		if(single1==null) {
			single1=new SingletonDesignPattern();
			
			
		}
		return single1;
		}

	

}
