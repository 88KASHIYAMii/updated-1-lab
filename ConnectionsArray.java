import java.util.ArrayList;

public class ConnectionsArray {
    // список для матрицы инцидентности
    static ArrayList<Connection> connectionsList = new ArrayList<>();

    // список для матрицы смежности
    static ArrayList<Connection> connectionsPairsList = new ArrayList<>();

    public static void clearConnections(){
        connectionsList.removeAll(connectionsList);
        connectionsPairsList.removeAll(connectionsPairsList);
    }
}
