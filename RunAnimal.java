import java.util.Scanner;

public class RunAnimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Bird bird = new Bird();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String input = sc.nextLine();
	
		if(input.equalsIgnoreCase("B")) {
			System.out.print("Birds "); bird.eat(); System.out.print("and "); bird.sleep();
			System.out.print("\n"); bird.makeSound();
			
		}else if (input.equalsIgnoreCase("C")){
			
			System.out.print("Cats "); cat.eat(); System.out.print("and "); cat.sleep();
			System.out.print("\n"); cat.makeSound();
			
		}else if (input.equalsIgnoreCase("D")){
			System.out.print("Dogs "); dog.eat(); System.out.print("and "); dog.sleep();
			System.out.print("\n"); dog.makeSound();
			
		}else{
			System.out.print("Invalid.");
		}
	}
}