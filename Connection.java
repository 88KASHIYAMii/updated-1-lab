public class Connection extends NodeFactory{

    Integer _sender;
    Integer _receiver;

    public Connection(Integer first, Integer second){
        this._sender = first;
        this._receiver = second;
    }
    @Override
    void createConnection(Connection con){
        // для матрицы смежности
        Connection connector_pair = new Connection(con._sender, con._receiver);
        connector_pair._sender = con._receiver;
        connector_pair._receiver = con._sender;

        ConnectionsArray.connectionsList.add(con);

        ConnectionsArray.connectionsPairsList.add(con);
        ConnectionsArray.connectionsPairsList.add(connector_pair);
    }

    @Override
    void createNode(Node node){
        //TODO
    }
}