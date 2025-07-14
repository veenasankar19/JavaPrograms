package privateAccessModifier;

import defaultAccessModifier.ParentClass;

public class TestClassForDefaultAM {

	public static void main(String[] args) {
		ParentClass p1=new ParentClass();
		p1.display();    //outside package defaultAccessModifier, the class ParentClass and its method display are not accessible

	}

}
