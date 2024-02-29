package Pertemuan3;

public class Node {
    private int data;
	private Node next;

	/* inisialisasi atribut node */
	
	public Node (int data) {
		this.data = data;
	}
	
	/* setter & getter */
	
	/* getter Data */

	public int getData() {
		return data;
	}
	
	/* setter data */
	
	public void setData(int data) {
		this.data = data;
	}
	
	/* getter next */
	
	public Node getNext() {
		return next;
	}
	
	/* setter next */
	
	public void setNext(Node next) {
		this.next = next;
	}
}
