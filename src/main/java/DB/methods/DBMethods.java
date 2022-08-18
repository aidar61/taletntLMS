package DB.methods;

import DB.DBConnection;

public class DBMethods {
    public void createDB(String db) {
        try {
            DBConnection.query("Create Database" + db);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
