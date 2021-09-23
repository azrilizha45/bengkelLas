class bengkel {
    String namaBengkel, alamatBengkel, nomorTelepon, biayaJasa ;
    int biayaLas, tukangLas;

    public bengkel(String namaBengkel, String alamatBengkel, String nomorTelepon, int tukangLas, int biayaLas){
        this.namaBengkel = namaBengkel;
        this.alamatBengkel = alamatBengkel;
        this.nomorTelepon = nomorTelepon;
        this.tukangLas = tukangLas;
        this.biayaLas = biayaLas;
    }
    String getNamaBengkel(){
        return "Nama Bengkel: " + namaBengkel;
    }
    String setAlamatBengkel(){
        return "Nama Pemilik: " +alamatBengkel;
    }
    String setNomerTelepon(){
        return "Nomor Telfon: " +nomorTelepon;
    }
    int getTukangLas(){
        return tukangLas;
    }
    int setBiayaLas(){
        return biayaLas;
    }
}

class pelanggan {
    String pesanan, nama, nomorTelepon;


    public pelanggan(String pesanan, String nama, String nomorTelepon){
        this.pesanan = pesanan;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }
    String getPesanan(){
        return "Pesanan : "+pesanan;
    }
    String getNamaPemesan(){
        return "Nama Pemesan: "+nama;
    }
    String setNomerTelepon(){
        return "Nomor Telepon: "+nomorTelepon;
    }
}

public class lasbengkel{
    public static void main(String[] args){
        bengkel BengkelLas = new bengkel("Agung Jaya", "Jl. PB. Sudirman No. 19B", "085112052001", 7, 250000);
        System.out.println("++++++++++++++++Bengkel Las++++++++++++++++");
        System.out.println(BengkelLas.getNamaBengkel());
        System.out.println(BengkelLas.setAlamatBengkel());
        System.out.println(BengkelLas.setNomerTelepon());
        System.out.println("Jumlah Tukang Las: "+BengkelLas.getTukangLas());
        System.out.println("Biaya Las : "+BengkelLas.setBiayaLas());
        System.out.println("------------------------------------");
        System.out.println("++++++++++++++++Pelanggan++++++++++++++++");
        pelanggan Pelanggan = new pelanggan("Tralis Jendela", "Soerya Pranadja", "085107012001");
        System.out.println(Pelanggan.getPesanan());
        System.out.println(Pelanggan.getNamaPemesan());
        System.out.println(Pelanggan.setNomerTelepon());
        System.out.println("------------------------------------");
    }
}