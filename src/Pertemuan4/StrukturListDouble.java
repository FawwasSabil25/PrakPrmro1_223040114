package Pertemuan4;

public class StrukturListDouble {
    private Node HEAD;
	
	//add head
	public void addHead(double data) { //int digantikan menjadi double
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			HEAD = newNode;
		}else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	//add mid
	public void addMid(double data, int position) { //int digantikan menjadi double
		Node newNode = new Node(data);
		Node curNode = null;
		Node posNode = null;
		int i;
		
		if(isEmpty()) {
			HEAD = newNode;
		}else {
			curNode = HEAD;
			if(position == 1) {
				newNode.setNext(curNode);
				HEAD = newNode;
			}else {
				i = 1;
				while((curNode != null)&&(i < position)) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}
				posNode.setNext(newNode);
				newNode.setNext(curNode);
			}
		}
	}
	
	//add tail
	public void addTail(double data) { //int digantikan menjadi double
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		}else {
			Node posNode = null;
			Node curNode = HEAD;
			
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			
			posNode.setNext(newNode);
		}
	}
	
	
	
	private boolean isEmpty() {
		return HEAD == null;
	}
	
	//latihan 3
	public void displayElement() {
		Node curNode = HEAD;
		
		while(curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}
}
