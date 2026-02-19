import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseSetup {
    public static void main(String[] args) {
        // 1. Database file ka path (Ye 'data' folder mein banegi)
        String url = "jdbc:sqlite:../data/mandi_mitra.db";

        // 2. SQL Query: Ek table banao 'inventory' naam ka
        String sql = "CREATE TABLE IF NOT EXISTS inventory ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " item_name TEXT NOT NULL,"
                + " quantity REAL NOT NULL,"
                + " cost_price REAL NOT NULL,"
                + " entry_date TEXT DEFAULT CURRENT_DATE"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {

            // Table create karo
            stmt.execute(sql);
            System.out.println("Radhe Radhe! Mandi-Mitra Database 'mandi_mitra.db' taiyar ho gaya hai.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}