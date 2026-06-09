public class CuciMobil {
    private Mobil mobil;
    private Motor motor;
    public int biayaCuci(Kendaraan kendaraan){
        if(kendaraan instanceof Mobil){
            this.mobil=(Mobil)kendaraan;
            return 40000;
        }else if(kendaraan instanceof Motor){
            this.motor=(Motor)kendaraan;
            return 10000;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        CuciMobil samStream=new CuciMobil();
        Mobil avanza=new Mobil(4);
        Motor xRide=new Motor(2);
        int biayaMobil=samStream.biayaCuci(avanza);
        int biayaMotor=samStream.biayaCuci(xRide);
        Cash tunai1=new Cash(biayaMobil, 50000);
        Payment tunai2=new Cash(biayaMotor, 5000);
        System.out.println("Transaksi Tunai Pertama: "+((tunai1.authorized())?"Berhasil!":"Gagal!"));
        System.out.println("Transaksi Tunai Kedua: "+((tunai2.authorized())?"Berhasil!":"Gagal!"));
        Payment kredit1=new Credit(biayaMobil, "1234567890123456");
        Payment kredit2=new Credit(biayaMotor, "123456789");
        System.out.println("Transaksi Kredit Pertama: "+((kredit1.authorized())?"Berhasil!":"Gagal!"));
        System.out.println("Transaksi Kredit Kedua: "+((kredit2.authorized())?"Berhasil!":"Gagal!"));
    }
}
