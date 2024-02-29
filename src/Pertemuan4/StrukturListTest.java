package Pertemuan4;

public class StrukturListTest {
    
	public static void main(String[] args) {
		
		StrukturList myList = new StrukturList();
		
		myList.addTail(3);
		myList.addTail(4);
		myList.addMid(7, 2);
		myList.addMid(8, 2);
		myList.addHead(5);
		myList.displayElement();

	}

}
