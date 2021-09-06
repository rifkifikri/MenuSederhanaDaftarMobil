import java.util.*;

public class Main extends Mobil{
	public static void main(String[] args) {
		int jenis,jenis2;
		Scanner input =new Scanner(System.in);
		Toyota toyota = new Toyota();
		Mobil toyo = toyota.inisialisasi_Toyota();
		Mobil vios =toyota.inisialisasi_vios();
		Mobil inova=toyota.inisialisasi_innova();
		
		Suzuki suzuki =new Suzuki();
		Mobil ertiga =suzuki.inisialisasi_Ertiga();
		Mobil eterna =suzuki.inisialisasi_Eterna();
		Mobil Apv =suzuki.inisialisasi_APV();
		
		Ford ford =new Ford();
		Mobil mustang =ford.inisialisasi_mustang();
		Mobil everest =ford.inisialisasi_Everest();
		Mobil peugot = ford.inisialisasi_Peugot();
		
		System.out.println("Jenis Mobil");
		System.out.println("1. Toyota");
		System.out.println("2. Suzuki");
		System.out.println("3. Ford");
		System.out.print("Pilih Jenis Mobil : ");
		jenis=input.nextInt();
		
		if(jenis==1) {
			System.out.println("Jenis Mobil Toyota");
			System.out.println("1. Alparth");
			System.out.println("2. Vios");
			System.out.println("3. Innova");
			System.out.print("Pilih Jenis Mobil Toyota : ");
			jenis2=input.nextInt();
			if(jenis2==1) {
				System.out.println("Merk :"+toyo.tipe);
				System.out.println("Berat :"+toyo.berat+" kg");
				System.out.println("Harga :Rp"+toyo.Harga+" ");
				System.out.println("Warna :"+toyo.warna);
			}else if(jenis2==2) {
				System.out.println("Merk :"+vios.tipe);
				System.out.println("Berat :"+vios.berat+" kg");
				System.out.println("Harga :Rp"+vios.Harga+" ");
				System.out.println("Warna :"+vios.warna);
			}else if(jenis2==3) {
				System.out.println("Merk :"+inova.tipe);
				System.out.println("Berat :"+inova.berat+" kg");
				System.out.println("Harga :Rp"+inova.Harga+" ");
				System.out.println("Warna :"+inova.warna);
			}
		}else if(jenis==2) {
			System.out.println("Jenis Mobil Suzuki");
			System.out.println("1. Ertiga");
			System.out.println("2. Eterna");
			System.out.println("3. APV");
			System.out.print("Pilih Jenis Mobil Toyota : ");
			jenis2=input.nextInt();
			if(jenis2==1) {
				System.out.println("Merk :"+ertiga.tipe);
				System.out.println("Berat :"+ertiga.berat+" kg");
				System.out.println("Harga :Rp"+ertiga.Harga+" ");
				System.out.println("Warna :"+ertiga.warna);
			}else if(jenis2==2) {
				System.out.println("Merk :"+eterna.tipe);
				System.out.println("Berat :"+eterna.berat+" kg");
				System.out.println("Harga :Rp"+eterna.Harga+" ");
				System.out.println("Warna :"+eterna.warna);
			}else if(jenis2==3) {
				System.out.println("Merk :"+Apv.tipe);
				System.out.println("Berat :"+Apv.berat+" kg");
				System.out.println("Harga :Rp"+Apv.Harga+" ");
				System.out.println("Warna :"+Apv.warna);
			}
		}else if(jenis==3) {
			System.out.println("Jenis Mobil Ford");
			System.out.println("1. Mustang");
			System.out.println("2. Everest");
			System.out.println("3. Peugot");
			System.out.print("Pilih Jenis Mobil Toyota : ");
			jenis2=input.nextInt();
			if(jenis2==1) {
				System.out.println("Merk :"+mustang.tipe);
				System.out.println("Berat :"+mustang.berat+" kg");
				System.out.println("Harga :Rp"+mustang.Harga+" ");
				System.out.println("Warna :"+mustang.warna);
			}else if(jenis2==2) {
				System.out.println("Merk :"+everest.tipe);
				System.out.println("Berat :"+everest.berat+" kg");
				System.out.println("Harga :Rp"+everest.Harga+" ");
				System.out.println("Warna :"+everest.warna);
			}else if(jenis2==3) {
				System.out.println("Merk :"+peugot.tipe);
				System.out.println("Berat :"+peugot.berat+" kg");
				System.out.println("Harga :Rp"+peugot.Harga+" ");
				System.out.println("Warna :"+peugot.warna);
			}
		}
	}
}
