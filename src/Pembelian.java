import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Pembelian extends AciakCoree implements iDataPembelian {
    String productCode;
    String productName;
    double productPrice;
    int quantity;
    double totalPayment;
    boolean input = true;

    Pembelian(String cashier) {
        super(cashier);
    }

    @Override
    public void inputPurchaseData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kode Barang   : ");
        productCode = scanner.nextLine();

        // mengembalikan nama produk dan harga dari database
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "")) {
            String query = "SELECT productName, productPrice FROM products WHERE productCode = ?";
            PreparedStatement myStatement = connection.prepareStatement(query);
            myStatement.setString(1, productCode);
            ResultSet resultSet = myStatement.executeQuery();
                if (resultSet.next()) {
                    productName = resultSet.getString("productName");
                    productPrice = resultSet.getDouble("productPrice");
                } else {
                    System.out.println("Product not found in the database.");
                    return;
                }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Nama Barang   : " + productName);
        System.out.println("harga Barang   : "+ productPrice);

        System.out.print("Jumlah Beli   : ");
        quantity = scanner.nextInt();

        totalPayment = productPrice * quantity;
        scanner.close();
    }

    @Override
    public void displayPurchaseData() {
        System.out.println("------------------------");
        System.out.println("TOTAL BAYAR   : " + totalPayment);
        System.out.println("------------------------");
    }
}
