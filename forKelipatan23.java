import java.util.Scanner;
public class forKelipatan23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan;
        int jumlah = 0;
        int counter = 0 ;
        double x = 0;
        System.out.print("masukan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();
        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i ;
                counter++ ;
                x = (double)jumlah/counter;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 - 50 adalah %d \n", kelipatan,counter );
        System.out.printf("Total kelipatan bilangan %d dari 1 - 50 adalah %d \n", kelipatan,jumlah );
        System.out.print("Rata rata Total kelipatan bilangan " + kelipatan + "dari 1 - 50 adalah " + x);
    }
}