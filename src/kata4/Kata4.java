package kata4;

import java.sql.Connection;
import java.sql.DriverManager;

public class Kata4 {

    public static void main(String[] args){
        Connection connection= createConnection("people.bd");
    }

    private static Connection createConnection(String dbPath) {
        DriverManager.registerDriver(null);
    }
    
}
