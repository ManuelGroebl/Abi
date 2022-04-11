package dataStructures;

public class Main {

	public static void main(String[] args) {
		
		ListImplementationTest tester = new ListImplementationTest();
		
		boolean allTestsPassed = true;
		
		allTestsPassed = allTestsPassed && tester.testInsert(true);
		allTestsPassed = allTestsPassed && tester.testRemove(true);
		allTestsPassed = allTestsPassed && tester.testIsEmpty(true);
		allTestsPassed = allTestsPassed && tester.testInsertOrder(true);
		allTestsPassed = allTestsPassed && tester.testRemoveOrder(true);
		allTestsPassed = allTestsPassed && tester.testGetNElements(true);
		
		if(allTestsPassed) {
			System.out.println("All tests passed!");
		}
		
		tester.testPrintAll();

	}

}
