package praktikum.soal1;

public class Buah {
	String nama;
	double berat;
	double harga;
	double jumlah;
	double totalHarga;
	double diskon;
	double hargaAkhir;
	
	public void info() {
		System.out.println("Nama Buah: " +nama);
		System.out.println("Berat: " +berat);
		System.out.println("Harga: " +harga);
		System.out.println("Jumlah Beli: " +jumlah+ "kg");
		System.out.println("Harga Sebelum Diskon: Rp" +totalHarga);
		System.out.println("Total Diskon: Rp" +diskon);
		System.out.println("Harga Setelah Diskon: Rp" +hargaAkhir);
		System.out.println(" ");
	}
}