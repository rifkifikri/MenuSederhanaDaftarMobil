
public class Suzuki extends Mobil{
	public Mobil inisialisasi_Ertiga() {
		Mobil ertiga =new Mobil();
		ertiga.tipe="Ertiga";
		ertiga.Harga=250;
		ertiga.berat=250;
		ertiga.warna="Pink";
		return ertiga;
	}
	
	public Mobil inisialisasi_Eterna() {
		Mobil eterna=new Mobil();
		eterna.tipe="Eterna";
		eterna.Harga=300;
		eterna.berat=250;
		eterna.warna="Biru Tua";
		return eterna;
	}
	
	public Mobil inisialisasi_APV() {
		Mobil Apv=new Mobil();
		Apv.tipe="APV";
		Apv.Harga=400;
		Apv.berat=350;
		Apv.warna="Biru Doff";
		return Apv;
	}
}
