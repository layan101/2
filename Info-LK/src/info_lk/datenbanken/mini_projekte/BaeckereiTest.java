package info_lk.datenbanken.mini_projekte;

import abiturklassen.datenbanken.sqlite.DatabaseConnector;
import abiturklassen.datenbanken.sqlite.QueryResult;
import sun.awt.EventListenerAggregate;

import javax.management.Query;

public class BaeckereiTest {

    public static void main(String[] args) {

        DatabaseConnector databaseConnector = new DatabaseConnector(null, 0, "Bäckerei (Elisa).db", null, null);
        DatabaseConnector.executeStatement("SELECT+FROM Kuchen");
        QueryResult rs = databaseConnector.getCurrentQueryResult();

        String[] columnNames = rs.getColumnNames();
        for (int i = 0; i < columnNames.length; i++) {
            System.out.print(columnNames[i] + "/t");
        }

        String[][] data = rs.getData();
        for (int i = 0; i < data.length; i++) {
            int j = 0;

        }
        int i = 0;
        int j = 0;
        System.out.print(data[i][j] + "/t");
    }
}


