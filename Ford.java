
public class Ford extends Mobil{
	public Mobil inisialisasi_Everest() {
		Mobil everst =new Mobil();
		everst.tipe="Everest";
		everst.Harga=450;
		everst.berat=250;
		everst.warna="Hitam doff";
		return everst;
	}
	
	public Mobil inisialisasi_mustang() {
		Mobil mustang =new Mobil();
		mustang.tipe="Mustang";
		mustang.Harga=100000;
		mustang.berat=450;
		mustang.warna="Silver";
		return mustang;
	}
	
	public Mobil inisialisasi_Peugot() {
		Mobil peugot=new Mobil();
		peugot.tipe="Peugot";
		peugot.Harga=78900;
		peugot.berat=250;
		peugot.warna="Hijau Metalik";
		return peugot;
	}
}
