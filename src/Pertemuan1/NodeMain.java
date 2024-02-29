package Pertemuan1;

public class NodeMain {
    public static void main(String[] args) {
        
        //membuat 2 node n1 & n2

		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(5);
		Node n4 = new Node(7);
		Node n5 = new Node(9);
		/*
		 *	untuk a, hanya ditambahkan berikut
		 *	Node n3 = new Node(9);
		 *	Node n4 = new Node(8);
		 *
		 *	untuk b, perlu diubah dari n1
		 *	Node n1 = new Node(2);
		 *	Node n2 = new Node(3);
		 *	Node n3 = new Node(5);
		 *	Node n4 = new Node(7);
		 *	Node n5 = new Node(9);
		 */
		
		//membuat relasi node n1 & n2
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		/*
		 *	untuk a, perlu menghubungkan n2 dengan n3, dan n3 dengan n4
		 *	n2.setNext(n3);
		 *	n3.setNext(n4);
		 *
		 *	untuk b, perlu membuat hubungan dari n1 sampai n5
		 *	n1.setNext(n2);
		 *	n2.setNext(n3);
		 *	n3.setNext(n4);
		 *	n4.setNext(n5);
		 */

		
		//menampilkan node n1 & n2 dengan pointer p
		Node p = n1;
		while(p != null) {
			System.out.printf("%d", p.getNilai());
			p = p.getNext();
		}
    }
}


/*
 * jawaban tes
 * 1.	atribut next dalam Node merupakan penghubung antar node dalam struktur data linked list. dimana
 * 		setNext digunakan untuk mengatur refrensi node berikutnya. dan getNext digunakan untuk
 * 		mengambil referensi ke node berikutnya dari node saat ini
 * 
 * 2.	perintah 'n1.setNext(n2)' dimana n1 dihubungkan dengan n2 sehingga perintahnya adalah x.setNext(y)
 * 
 * 3.	p di latihan 2 dianggap sebagai pointer untuk melacak ke dalam linked list. awalnya p menjadi 
 * 		node awal (n1) kemudian dalam setiap loop nilai dari p diambil menggunakan 'p.getNilai' lalu 
 * 		diupdate untuk ke node berikutnya pakai 'p.getNext'
 * 
 * 4.	dari membuat node sesuai data perlu diubah serta relasi antar node yang perlu diubah seperti diatas
 */