
import java.util.Scanner;
public class AciakCoreApp {
    public static void main(String[] args) {
        
        //update username dan password
        Scanner scanner = new Scanner(System.in);
        UpdateEmployee.updateEmployeeCredentials(scanner);
        System.out.println("");

        //membuat data pegawai baru
        Scanner scanNEW = new Scanner(System.in);
        CreateNewEmployee.insertEmployeeData(scanNEW);
        System.out.println("");

        //hapus pegawai
        DeleteEmployee.deleteEmployeeById();
        System.out.println("");
        
        //login employee (READ)
        new Captcha();
        
        //faktur pembelian
        Pelanggan customer = new Pelanggan("", "", " ");
        customer.displaySupermarketInfo();
        System.out.println("-----DATA PELANGGAN-----");
        customer.inputCustomerData();

        Pembelian purchase = new Pembelian("");
        System.out.println("--DATA PEMBELIAN BARANG-");
        purchase.inputPurchaseData();
        purchase.displayPurchaseData();


    }
}