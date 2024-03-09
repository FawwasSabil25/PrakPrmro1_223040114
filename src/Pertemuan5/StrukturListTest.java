package Pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {

        StrukturList myList = new StrukturList();

        myList.addTail(2);
        myList.addTail(6);
        myList.addTail(3);
        myList.addTail(5);
        myList.addTail(1);

        System.out.println("\nList : ");
		myList.displayElement();

        myList.removeMid(3);

        System.out.println("\nList del mid (3) : ");
        myList.displayElement();
    }
}
            