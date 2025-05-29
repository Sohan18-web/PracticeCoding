package designPattern;

public class DesignPattern {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
			SingletonDesignPattern s1=SingletonDesignPattern.getSingletonDesignPattern();
			System.out.println(s1.hashCode());
			SingletonDesignPattern s2=SingletonDesignPattern.getSingletonDesignPattern();
			System.out.println(s2.hashCode());
			
	}
}
