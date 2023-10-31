import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihanMakanan;
        double totaltagihanmakanan = 0.0;
        double uangdibayar = 0.0;

        do {
            System.out.println("1. Marlong(22.000)");
            System.out.println("2.Surya(25.000)");
            System.out.println("3. Gudang Garam(25.000)");
            System.out.println("4. Camel (17.000)");
            System.out.println("5. Selesai dan Hitung");
            System.out.println("Pilih Menu: ");
            pilihanMakanan = input.nextInt();

            switch (pilihanMakanan) {
                case 1:
                    totaltagihanmakanan += 22000;
                    break;
                case 2:
                    totaltagihanmakanan += 25000;
                    break;
                case 3:
                    totaltagihanmakanan += 25000;
                    break;
                case 4:
                    totaltagihanmakanan += 17000;
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Gak ada menu");
            }
        } while (pilihanMakanan != 5);

        System.out.println("Total Tagihan: " + totaltagihanmakanan);

        System.out.println("Masukan Uang Yang Dibayar: ");
        uangdibayar = input.nextDouble();

        if (uangdibayar > totaltagihanmakanan) {
            double uangkembalian = uangdibayar - totaltagihanmakanan;
            System.out.println("Uang Kembalian: " + uangkembalian);
        } else if (uangdibayar == totaltagihanmakanan) {
            System.out.println("Uang Pas");
        } else if (uangdibayar < totaltagihanmakanan) {
            double uangkurang = totaltagihanmakanan - uangdibayar;
            System.out.println("Uang Kurang: " + uangkurang);
            System.out.println("Masukan Tambahan: ");
            double uangtambahan = input.nextDouble();
        }

    }
}
