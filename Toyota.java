
public class Toyota extends Mobil{
	public Mobil inisialisasi_Toyota() {
		Mobil alparth =new Mobil();
			alparth.tipe= "Alparth";
			alparth.berat=300;
			alparth.Harga= 900;
			alparth.warna="Putih";
		return alparth;
	}
	
	public Mobil inisialisasi_vios() {
		Mobil vios =new Mobil();
		vios.tipe= "Vios";
		vios.berat=250;
		vios.Harga= 500;
		vios.warna="Merah Metalik";
	return vios;
	}
	
	public Mobil inisialisasi_innova() {
		Mobil inova =new Mobil();
		inova.tipe= "Vios";
		inova.berat=300;
		inova.Harga= 800;
		inova.warna="Biru Metalik";
	return inova;
	}
}
