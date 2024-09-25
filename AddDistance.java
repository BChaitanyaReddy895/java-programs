import java.util.Scanner;
public class AddDistance
{
 	int feet;
 	int inches;
 	public void Read()
	{
 		Scanner sc=new Scanner(System.in);
 		System.out.print("Enter distance in feet: ");
 		feet = sc.nextInt();
 		System.out.print("Enter distance in inches: ");
 		inches = sc.nextInt();
 	}
 	public void Display()
 	{
 		System.out.println("Feet: " + feet + "\tInches: " + inches);
 	}
 	public void Addition(AddDistance D1, AddDistance D2)
 	{
		inches = D1.inches + D2.inches;
		feet = D1.feet + D2.feet + (inches / 12);
 		inches = inches % 12;
 	}
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("Enter the option 1/0: 1: for continue and 0 :for exit");
			Scanner sc=new Scanner(System.in);
			int val=sc.nextInt();
			switch(val)
 			{
 				case 1:
 					AddDistance D1 = new AddDistance();
 					AddDistance D2 = new AddDistance();
 					AddDistance D3 = new AddDistance();

 					//read first distance
 					System.out.println("Enter first distance: ");
 					D1.Read();
 					//read second distance
 					System.out.println("Enter second distance: ");
 					D2.Read();
 					//add distances
 					D3.Addition(D1, D2);

 					//print distance
 					System.out.println("Total distance is:");
 					D3.Display();
 					break;
				case 0:
					System.exit(0);
 				default:
					System.out.println("Enter the valid Input 1/0");
 			}
		}
	}
} 

