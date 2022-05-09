import java.util.ArrayList;

abstract public class NodesArray{
    static ArrayList<Node> nodes = new ArrayList<>();

    public static void clearNodes(){
        nodes.removeAll(nodes);
    }
}
