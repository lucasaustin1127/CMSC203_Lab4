import java.util.Scanner;
public class TelevisionDemo
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int channel;
		Television screenLarge = new Television("Sony", 95);
		screenLarge.power();
		
		System.out.println ("A " + screenLarge.getScreenSize() + " in. " + screenLarge.getManufacturer() + " has been powered on.");
		System.out.print ("Which channel would you like to select?");
		channel = userInput.nextInt();
		
		screenLarge.setChannel(channel);
		screenLarge.increaseVolume();
		
		System.out.println ("Channel: " + screenLarge.getChannel() + " Volume: " + screenLarge.getVolume());
		System.out.println ("The initial volume level is too high. Lowering now.");
		
		screenLarge.decreaseVolume();
		screenLarge.decreaseVolume();
		screenLarge.decreaseVolume();
		screenLarge.decreaseVolume();
		screenLarge.decreaseVolume();
		screenLarge.decreaseVolume();
		
		System.out.println ("Channel: " + screenLarge.getChannel() + " Volume: " + screenLarge.getVolume());
		System.out.println ();
		
		Television television = new Television("Sharp", 19);
		
		television.power();
		
		System.out.println ("A " + television.getScreenSize() + " inch " + television.getManufacturer() + " has been turned on.");
		
		television.decreaseVolume();
		television.decreaseVolume();
		
		System.out.print ("Which channel would you like to select?");
		channel = userInput.nextInt();
		
		television.setChannel(channel);
		
		System.out.println ("Channel: " + television.getChannel() + " Volume: " + television.getVolume());
		
		userInput.close();
	}
}