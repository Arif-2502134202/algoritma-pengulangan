import java.util.Scanner;  

class Main {
	
	public static void pengulangan(){
		
		Scanner myObj = new Scanner(System.in);
		String nama ="";
		String nim = "";
				
		int panjangNama = 0;
		System.out.println(" ---------------------------------------------- ");	

		while ( panjangNama == 0 || panjangNama > 25 ){
			System.out.print(" Masukkan Nama Anda [1..25] : ");		
			nama = myObj.nextLine(); 
			panjangNama = nama.length();
		}

		int panjangNim = 0;

		while ( panjangNim != 10) {
			System.out.print(" Masukkan NIM Anda [Harus 10 karakter] : ");	
			nim = myObj.nextLine(); 	
			panjangNim = nim.length();
		}

		System.out.println(" ---------------------------------------------- ");	
		System.out.println(" Selamat Datang " + nama + " NIM : " + nim);
		System.out.println(" Mari Belajar macam-macam deret bilangan..!");
		System.out.println(" ---------------------------------------------- ");	

		int angka = 0;

		while (angka <5 || angka > 20 ){
			System.out.print(" Masukkan sembarang angka [ 5 - 20 ] : ");	
			angka = myObj.nextInt();
			myObj.nextLine();	
		}
		System.out.println(" ---------------------------------------------- ");	
		System.out.println(" Deret Bilangan :  ");	
		System.out.println(" ---------------------------------------------- ");	
		System.out.println(" " + angka + " Bilangan Genap : ");	

		int nilaiGenap = 2;
		int jumlahGenap = 0;
		for (int i = 0; i < angka; i++) {
			System.out.print(" " + nilaiGenap);
			jumlahGenap += nilaiGenap;
			nilaiGenap += 2;
		}
		System.out.println(" ");
		System.out.println(" Hasil Penjumlahan : " + jumlahGenap);
		System.out.println(" ");

		System.out.println(" " + angka + " Bilangan Ganjil : ");
		int nilaiGanjil = 1;
		int jumlahGanjil = 0;
		for (int i = 0; i < angka; i++) {
			System.out.print(" " + nilaiGanjil);
			jumlahGanjil += nilaiGanjil;
			nilaiGanjil += 2;			
		}		
		System.out.println(" Hasil Penjumlahan : " + jumlahGanjil);	
		System.out.println(" ");
		
		System.out.println(" " + angka + " Bilangan Fibonacci : ");
		int nilai1 = 0;
		int nilai2 = 1;
		int nilaiFibonaci = 1;
		int jumlahFibonaci = 0;
		for (int i = 0; i < angka; i++) {
			nilaiFibonaci = nilai1 + nilai2;
			System.out.print(" " + nilaiFibonaci);
			nilai1 = nilai2;
			nilai2 = nilaiFibonaci;
			jumlahFibonaci += nilaiFibonaci;
		}	
		System.out.println(" Hasil Penjumlahan : " + jumlahFibonaci);
		System.out.println(" ---------------------------------------------- ");			

	}
	//fungsi utama 
	public static void main(String[] args) {
		pengulangan();

		Scanner myScan = new Scanner(System.in);
		
		while (true){
			System.out.print(" Anda ingin mengulang ? [Y/T] ");	
			String ulang = myScan.nextLine();
			if (ulang.equals("T")||ulang.equals("t")) {
				break;
			}
			if (ulang.equals("Y")||ulang.equals("y")) {
				pengulangan();
			}
		}
		
	}
}
