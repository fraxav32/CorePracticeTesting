package BasicConcept;

public class MainRunner extends ObjectCreationForAbstract{

	public static void main(String[] args) {
		System.out.println( "call to class");
		
		int a = ConstructorRunner.abc;
		System.out.println(a);
		
		ConstructorRunner ab=new ConstructorRunner();
		ab.instanceMember();
		
		//Object can't be created for Abstract Method and Interface but can create reference variable 
		ObjectCreationForAbstract cd=new MainRunner();
		
		//Encapsulated data member into single class
		EncapsulationExample ee=new EncapsulationExample();
		ee.Agetter();
		ee.Asetter(40);
		ee.Agetter();
		

	}

	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("Implementaion of Method from Abstract class");
	}

}
