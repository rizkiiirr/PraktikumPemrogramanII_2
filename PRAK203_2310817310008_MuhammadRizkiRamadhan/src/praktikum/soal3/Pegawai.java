package praktikum.soal3;

//Pada baris ini terjadi error karena terdapat perbedaan antara nama kelas dengan nama file.
//public class Employee {
public class Pegawai {
	 public String nama;
	 //Pada baris ini terjadi error karena terdapat kesalahan pada tipe data karena tidak sesuai dengan input.
	 //public char asal;
	 public String asal;
	 public String jabatan;
	 public int umur;
	 
	 public String getNama() {
		 return nama;
	 }
	 
	 public String getAsal() {
		 return asal;
	 }
	 
	 //Pada baris ini terjadi error karena kurangnya parameter pada method.
	 //public void setJabatan() {
	 public void setJabatan(String j) {
		 this.jabatan = j;
	 }
}