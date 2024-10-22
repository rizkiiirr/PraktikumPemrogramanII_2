package praktikum.soal2;

public class Kopi {
	String namaKopi;
	String ukuran;
	double harga;
	String pembeli;
	double pajak;
	
	public void info() {
		System.out.println("Nama Kopi: " + namaKopi);
		System.out.println("Ukuran: " + ukuran);
		System.out.println("Harga: Rp. " + harga);
	} 

	public void setPembeli(String p) {
		pembeli = p;
	}
	
	public String getPembeli() {
		return pembeli;
	}
	
	public double getPajak() { 
		return pajak = 0.11 * harga;
	}
}