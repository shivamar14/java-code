class bike
{
	void run()
	{
	 System.out.println("bike is running");
	}
}
class splender extends bike
{
	void run()
	{
	 System.out.println("splender bike is running");
	}
}
class shine extends bike
{
	void run()
	{
	 System.out.println("shine bike is running");
	}
}
class ma 
{
 public static void main(String[] args)
 {
	 splender b1 = new splender();
	 shine b2 = new shine();
	 splender.run();
	 shine.run();
 }
}
