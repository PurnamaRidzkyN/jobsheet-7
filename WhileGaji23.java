import java.util.Scanner;

public class WhileGaji23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan ;
        int jumlahJamLembur ;
        double gajiLembur  = 0;
        double totalGajiLembur = 0;
        String jabatan ;

        System.out.print("Masukan jumlah karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
        System.out.println("Pilihan jabatan - direktur, manajer, karyawan");
        System.out.print("Masukan jabatan karyawan ke-" + (i+1) + " : " );
        jabatan = scan.next();
        System.out.print("Masukan jumlah jam lembur: ");
        jumlahJamLembur = scan.nextInt();
        i++;

        if ( jabatan.equalsIgnoreCase("direktur")){
            continue;
        }else if ( jabatan.equalsIgnoreCase("manajer")){
            gajiLembur = jumlahJamLembur * 100000;
        }else if ( jabatan.equalsIgnoreCase("karyawan")){
            gajiLembur = jumlahJamLembur * 75000;
        }else {
            System.out.println("Jabatan invalid");
            i--;
        }
         totalGajiLembur += gajiLembur;  
        }
         System.out.println("Total Gaji Lembur : " + totalGajiLembur);

    }
}