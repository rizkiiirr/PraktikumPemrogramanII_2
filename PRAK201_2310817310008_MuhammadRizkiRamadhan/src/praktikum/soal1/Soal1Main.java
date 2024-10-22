package praktikum.soal1;

import praktikum.soal1.Buah;

public class Soal1Main {

	public static void main(String[] args) {
		Buah buah1 = new Buah();
		Buah buah2 = new Buah();
		Buah buah3 = new Buah();
		
		buah1.nama = "Apel";
		buah1.berat = 0.4;
		buah1.harga = 7000;
		buah1.jumlah = 40;
		buah1.totalHarga = 700000;
		buah1.diskon = 5600;
		buah1.hargaAkhir = 694400;
		
		buah2.nama = "mangga";
		buah2.berat = 0.2;
		buah2.harga = 3500;
		buah2.jumlah = 15;
		buah2.totalHarga = 262500;
		buah2.diskon = 840;
		buah2.hargaAkhir = 261660;
		
		buah3.nama = "alpukat";
		buah3.berat = 0.25;
		buah3.harga = 10000;
		buah3.jumlah = 12;
		buah3.totalHarga = 480000;
		buah3.diskon = 2400;
		buah3.hargaAkhir = 477600;
		
		buah1.info();
		buah2.info();
		buah3.info();
	}
}