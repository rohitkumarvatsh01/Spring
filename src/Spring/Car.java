package Spring;

public class Car {
	public static void main(String[] args) {
		
		Station obj1=new PetrolStation();
		System.out.println(obj1.giveMeFuel());
		
		Station obj2=new DieselStation();
		System.out.println(obj2.giveMeFuel());
		
		/*
		PetrolStation p=new PetrolStation();
		System.out.println(p.giveMeFuel());
		
		DieselStation d=new DieselStation();
		System.out.println(d.giveMeFuel());
		*/
	}
}
