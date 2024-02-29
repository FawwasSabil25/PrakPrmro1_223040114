package Pertemuan4;

public class Node {
    private int data; //untuk tipe data hanya mengganti int menjadi double atau sebaliknya
	private Node next;

	/* inisialisasi atribut node */
	public Node (int data2) { //mengganti int menjadi double atau sebaliknya
		this.data = data2;
	}
	
	/* setter & getter */
	/* getter Data */
	public int getData() { //mengganti int menjadi double atau sebaliknya
		return data;
	}
	
	/* setter data */
	public void setData(int data) { //mengganti int menjadi double atau sebaliknya
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
