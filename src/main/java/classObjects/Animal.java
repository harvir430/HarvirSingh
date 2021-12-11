package classObjects;

public class Animal {
	String name="Romeo";
	int age=9;
	String color="Fawn";
	String breed="Labrador";
	public static void main(String[] args) {
		Animal animal=new Animal();
		Animal animal1=new Animal();
		Birds romeo= new Birds();
		romeo.fly();
		System.out.println(animal.name);
		System.out.println(animal.age);
		System.out.println(animal.color);
		System.out.println(animal.breed);
		System.out.println(animal1.name);
		System.out.println(animal1.age);
		System.out.println(animal1.color);
		System.out.println(animal1.breed);



	}
	public void eating() {
		System.out.println("romeo loves to eat");
	}
	public void sleepin() {
		System.out.println("romeo loves to sleeping");
	}
	public void guarding() {
		System.out.println("romeo loves to guarding");
	}

}
class Birds{
	void fly() {
		System.out.println("Moti is flying");
	}
	void speaks() {
		System.out.println("moti is speaking");
	}
}
