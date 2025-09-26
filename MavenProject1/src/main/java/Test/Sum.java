package Test;

public class Sum {
	int a,b;                    //instance variables a and b
	public Sum (int x, int y)
	{
		this.a=x;               //variables are called by this keyword
		this.b=y;
	}
	public int addition()      // return type will be called for all return types except void
	{
		return(a+b);
	}

	public static void main(String[] args) {
		Sum add = new Sum(10,20);
		int c=add.addition();
		System.out.println(c);

	}

}
