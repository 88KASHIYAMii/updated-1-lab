public class Node extends NodeFactory implements Comparable<Node>{

    Integer _name;
    public Node(Integer name){
        this._name = name;
    }

    @Override
    void createNode(Node node){
        putNodeInToArray(node);
    }

    @Override
    public int compareTo(Node other){
        int compareName = this._name.compareTo(other._name);
        return compareName;
    }

    @Override
    void createConnection(Connection connector){
        //TODO
    }

    static public void putNodeInToArray(Node node){
        NodesArray.nodes.add(node);
    }
}