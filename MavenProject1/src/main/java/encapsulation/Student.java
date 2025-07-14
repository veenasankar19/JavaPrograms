package encapsulation;

public class Student {
	private int a;
	private String name;
	
	public void setMethod1(int a)
	{
		this.a=a;	
	}
	public void setMethod2(String name)
	{
		this.name=name;	
	}
	public int getMethod1()
	{
		return a;
	}
	public String getMethod2()
	{
		return name;
	}

}
