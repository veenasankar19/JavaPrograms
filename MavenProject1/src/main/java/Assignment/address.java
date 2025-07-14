package Assignment;

public class address {
	String addr;
	studentClass1 obj;
	address(String addr,studentClass1 obj){
		this.addr=addr;
		this.obj=obj;
	}
	public void displayy() {
		System.out.println("Address:"+addr);
		obj.display();
	}	
	

	public static void main(String[] args) {
		studentClass1 c=new studentClass1("Veena",25);
		address a=new address("Vaishnavam, Trivandrum",c);
		a.displayy();
	}

}
