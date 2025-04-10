package pkg27maret;

public class TestBank {
    public static void main(String[] args) {
        Tabungan tabunganDiddy = new Tabungan(1500);
        Tabungan tabunganBudi = new Tabungan(800);

        Nasabah diddy = new Nasabah("Diddy", "Conbuzer");
        Nasabah budi = new Nasabah("Budi", "Arie");

        diddy.setTabungan(tabunganDiddy);
        budi.setTabungan(tabunganBudi);

        System.out.println("Informasi Nasabah:");
        System.out.println(diddy);
        System.out.println(budi);

        System.out.println("\nSetelah Menyimpan Uang:");
        tabunganDiddy.simpanUang(500);
        System.out.println("Diddy: " + diddy);

        System.out.println("\nMengambil Uang 300 dari Tabungan Diddy:");
        boolean ambilBerhasil = tabunganDiddy.ambilUang(300);
        System.out.println("Hasil: " + (ambilBerhasil ? "Berhasil" : "Gagal"));
        System.out.println("Diddy: " + diddy);

        System.out.println("\nTransfer 200 dari Diddy ke Budi:");
        boolean transferBerhasil = tabunganDiddy.transfer(tabunganBudi, 200);
        System.out.println("Hasil: " + (transferBerhasil ? "Berhasil" : "Gagal"));
        System.out.println("Diddy: " + diddy);
        System.out.println("Budi: " + budi);

        System.out.println("\nMengambil Uang 1000 dari Tabungan Budi:");
        boolean ambilGagal = tabunganBudi.ambilUang(1000);
        System.out.println("Hasil: " + (ambilGagal ? "Berhasil" : "Gagal"));
        System.out.println("Budi: " + budi);
    }
}