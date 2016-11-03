package sample.DAO;

import java.sql.*;

/**
 * Created by Olivi on 03-11-2016.
 */
public class DAOthing {
    public  static void connect() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql:127.0.0.1:3306/MySQL57";
        String user = "root";
        String passwordConnection = "olivia06";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            con = DriverManager.getConnection(url, user, passwordConnection);
            st = con.createStatement();
            String s = "SELECT username\n" +
                    "FROM `new_schema`.`userdata`;\n";
            rs = st.executeQuery(s);
            String stuff = "";
            if (rs.next()) {
                stuff = rs.getString(1);
            }
            System.out.println(stuff);

        } catch (SQLException ex) {
            ex.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {

            try {

                if (rs != null) {
                    rs.close();
                }

                if (st != null) {
                    st.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

            }
        }
    }
}
