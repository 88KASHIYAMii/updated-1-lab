
// в findMeValue отправляю индексы i и j
// смотрю по этим индексам значения в отсортированном nodes
// если эти значения есть парой в ConnectionsArray, то ставлю 1 в матрице
public class ValuesFromConnection{

    Integer senderValue = 0;
    Integer receiverValue = 0;

    public Integer findMeValue(Integer i, Integer j) {
        this.senderValue = NodesArray.nodes.get(i)._name;
        this.receiverValue = NodesArray.nodes.get(j)._name;

        for (Connection con : ConnectionsArray.connectionsList) {
            if (senderValue == con._sender && receiverValue == con._receiver) {
                return 1;
            }
        } return 0;
    }

    public Integer findMeValueFromPairs(Integer i, Integer j){
        this.senderValue = NodesArray.nodes.get(i)._name;
        this.receiverValue = NodesArray.nodes.get(j)._name;

        for (Connection con : ConnectionsArray.connectionsPairsList) {
            if (senderValue == con._sender && receiverValue == con._receiver) {
                return 1;
            }
        } return 0;
    }
}