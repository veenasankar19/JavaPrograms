package finalReview;

public class sumInsta {
	int a;
	int b;
	int sum;
	
	sumInsta(int a, int b){
		this.a=a;
		this.b=b;
		sum=a+b;         //this. is not required
	}
	public void display(){
	System.out.println("The sum of numbers is "+sum);	
	}

	public static void main(String[] args) {
		sumInsta s=new sumInsta(25,30);
		s.display();
	}

}
