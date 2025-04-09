interface interfaceOne
{
	public void show();

}
interface interfaceTwo
{
	public void display();
}
class A implements interfaceOne,interfaceTwo
{
	@Override
	public void show()
	{
		System.out.println("Show something");
	}
	@Override
	public void display()
	{
		System.out.println("Display nothing");
	
	}
}
public class Test
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.show();
		obj.display();
	
	}
}
