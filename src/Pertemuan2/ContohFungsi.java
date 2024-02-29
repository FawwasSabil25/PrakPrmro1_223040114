package Pertemuan2;

public class ContohFungsi {
    /*membuat fungsi bernama tambah yang berfungsi utk menambahkan int a dan int b
	 * mengembalikkan nilai hasil tambah
	 */
	public static int tambah(int a, int b) {
		return a + b;
	}
	
	/*membuat fungsi bernama kali yang berfungsi utk mengalikan int a dan int b
	 * mengembalikan nilai hasil perkalian
	 */
	public static int kali(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		
		/*
		 * melabeli nilai hasil dari fungsi tambah dengan "hasilpenjumlahan"
		 * memanggil fungsi tambah sekaligus menginput nilai int a dan int b
		 * memanggil nilai hasil dari fungsi yang sudah dilabeli sebagai "hasilpenjumlahan"
		 */
		int hasilpenjumlahan = tambah(5,3);
		System.out.println("Hasil penjumlahan : "+ hasilpenjumlahan);
		
		/*
		 * melabeli nilai hasil dari fungsi kali dengan "hasilperkalian"
		 * memanggil fungsi kali sekaligus menginput nilai int a dan int b
		 * memanggil nilai hasil dari fungsi yang sudah dilabeli dengan "hasilperkalian"
		 */
		int hasilperkalian = kali(4,6);
		System.out.println("Hasil Perkalian : "+ hasilperkalian);
		
	}
}
