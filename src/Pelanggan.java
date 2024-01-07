import java.util.Scanner;

class Pelanggan extends AciakCoree implements iDataPelanggan {
    private String customerName;
    private String customerAddress;
    private Scanner scanner = new Scanner(System.in);

    Pelanggan(String name, String address, String cashier) {
        super(cashier);
        this.customerName = name;
        this.customerAddress = address;
    }

    @Override
    public void inputCustomerData() {
        System.out.print("Nama Pelanggan : ");
        customerName = scanner.nextLine();
        System.out.print("Alamat         : ");
        customerAddress = scanner.nextLine();
        System.out.println("========================");
    }
}