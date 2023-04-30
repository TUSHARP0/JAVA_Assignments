package Fruit;
import java.util.Scanner;
public class FruitTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Basket");
		Fruit[] basket=new Fruit[sc.nextInt()];
		System.out.println("1. Add Fruit  2. Display Name  3. Display Fruit if Fresh  4. Mark Fruit  5. Mark sour fruit  6. Fruits Functions  7. Exit ");
		
		int ch=0;
		int counter=0;
		
		do {
			System.out.println("Enter your Choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Select Fruit");
				System.out.println("1. Add Mango  2. Add Orange  3. Add Apple");
				int a=sc.nextInt();
				switch(a) {
				case 1:if(counter<basket.length) {
					basket[counter++]=new Mango(sc.next(),sc.nextDouble(),sc.next());
				}
				else {
					System.out.println("Basket is Full");
				}
					break;
				
				case 2:if(counter<basket.length) {
					basket[counter++]=new Orange(sc.next(),sc.nextDouble(),sc.next());
					basket[counter-1].setFresh(false);
				}
				else {
					System.out.println("Basket is Full");
				}
					break;
					
				case 3:if(counter<basket.length) {
					basket[counter++]=new Apple(sc.next(),sc.nextDouble(),sc.next());
				}
				else {
					System.out.println("Basket is Full");
				}
					break;
				}
				break;
				
			case 2:
				for(Fruit b:basket) {
					if(b!=null) {
					System.out.println(b.getName());
				}
				}
				break;
				
			case 3:for(Fruit b:basket) {
				if(b!=null) {
				System.out.println(b);
			}
			}
				break;
				
			case 4:int index=0;
				for(Fruit b:basket) {
				if(b!=null) {
					if(b.isFresh()) {
						System.out.println("Index: "+index+" "+b);
						index++;
					}
				}
			}
				break;
				
			case 5:for(int i=0;i<basket.length;i++) {
				if(basket[i].getName().equalsIgnoreCase("Orange")) {
					basket[i].setFresh(false);
				}
			}
				break;
				
			case 6:int index1=0;
				for(Fruit b:basket) {
				if(b!=null) {
					if(b instanceof Mango) {
						System.out.print("Index: "+index1+" ");
						((Mango)b).pulp();
						index1++;
					}
					else if(b instanceof Orange) {
						System.out.print("Index: "+index1+" ");
						((Orange)b).juice();
						index1++;
					}
					else {
						System.out.print("Index: "+index1+" ");
						((Apple)b).jam();
						index1++;
					}
				}
			}
				break;
			
			case 7:
				System.out.println("Thanks for visiting");
				break;
				
			}
			
		}while(ch!=10);

	}

}
