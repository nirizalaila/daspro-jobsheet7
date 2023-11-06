import java.util.Scanner;
public class ModifWhileGaji24 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int jumlahKaryawan, jumlahJamLebur;
    double gajiLembur, totalGajiLembur;
    gajiLembur = 0;
    totalGajiLembur = 0;
    String jabatan;
    
    System.out.print("Masukkan jumlah karyawan: ");
    jumlahKaryawan = scan.nextInt();

    int i = 0;

    while (i < jumlahKaryawan) {
        System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
        jabatan = scan.next();
        System.out.print("Masukkan jumlah jam lembur: ");
        jumlahJamLebur = scan.nextInt();
        i++;

        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;  
        } else if (jabatan.equalsIgnoreCase("manajer")) {
            gajiLembur = jumlahJamLebur * 100000;
        } else if (jabatan.equalsIgnoreCase("karyawan")) {
            gajiLembur = jumlahJamLebur * 75000;
        } else {
            System.out.println("Jabatan invalid");
        }
        totalGajiLembur += gajiLembur;

        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
  }  
}
