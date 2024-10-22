package praktikum.soal3;

import praktikum.soal3.Pegawai;

public class Soal3Main {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
		 //Pada baris ini terjadi error karena kurangnya titik koma (;).
		 //p1.nama = "Roi"
		 p1.nama = "Roi";
		 p1.asal = "Kingdom of Orvel";
		 p1.setJabatan("Assasin");
		 p1.umur = 17;
		 
		 //Pada baris ini terjadi error karena kurangnya titik koma (;).
		 //System.out.println("Nama Pegawai: " + p1.getNama())
		 System.out.println("Nama Pegawai: " + p1.getNama());
		 System.out.println("Asal: " + p1.getAsal());
		 System.out.println("Jabatan: " + p1.jabatan);
		 //Pada baris ini terjadi ketidaksesuaian dengan output yang diinginkan karena kurang kata tahun setelah umur pada output.
		 //System.out.println("Umur: " + p1.umur);
		 System.out.println("Umur: " + p1.umur + " tahun");
	}
}