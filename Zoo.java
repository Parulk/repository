package com.kronos.test;

public class Zoo {

	public static void main(String[] args) {
		
//		Animal animal1 = new Animal(12,"M",20);
//		animal1.eat();
//		animal1.sleep();
		
		Animal bird1 = new Bird(3, "F",12);
//		bird1.eat();
//		bird1.sleep();
//		bird1.fly();
//		bird1.move();
		
		Animal fish1= new Fish(4,"M",16);
//		fish1.eat();
//		fish1.sleep();
//		fish1.swim();
//		fish1.move();
		
		Animal sparrow1= new Sparrow(1, "f",12);
		moveAnimals(sparrow1);
		
		Flyable fly1 = new Bird(12, "M",30);
		fly1.fly();
		moveAnimals(bird1);
		moveAnimals(fish1);
		
		
	}
	
	public static void moveAnimals(Animal animal)
	{
		animal.move();
	}
	

}
