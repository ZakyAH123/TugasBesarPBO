import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


abstract class AciakCoree {
    private String cashier;
    private Scanner scan = new Scanner(System.in);

    AciakCoree(String cashier) {
        this.cashier = cashier;
    }

    public void displaySupermarketInfo() {
        System.out.println("-------ACIAK CORE-------");
        System.out.println("========================");
            Date tglSekarang = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MM yyyy");
            String tglFormat = sdf.format(tglSekarang);
        System.out.println("Tanggal     : "+tglFormat);
            Date waktu = new Date();
            SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
            String waktuFormat = sdf2.format(waktu);
        System.out.println("Waktu       : "+waktuFormat);
        System.out.print("Kasir       : ");
        cashier = scan.nextLine();
        System.out.println("========================");
    }
}