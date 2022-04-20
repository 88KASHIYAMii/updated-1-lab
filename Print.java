import java.util.Collections;

public class Print{
    static int size = NodesArray.nodes.size();
    static public Integer adjMatrix[][] = new Integer[size][size];
    static Integer flag1;
    static Integer flag2;

    static void printIncidenceMatrix() {
        Collections.sort(NodesArray.nodes);
        ValuesFromConnection value = new ValuesFromConnection();

        System.out.print("\n");
        System.out.print("    ");
        for (int k = 0; k < size; k++) {
            System.out.print(NodesArray.nodes.get(k)._name + "  ");
        }
        System.out.print("\n");

        for (int i = 0; i < size; i++) {
            System.out.print(NodesArray.nodes.get(i)._name + ": ");
            for (int j = 0; j < size; j++){
                flag1 = value.findMeValue(i, j);
                if(flag1 == 0){
                    adjMatrix[i][j] = 0;
                    System.out.print(" " + adjMatrix[i][j] + " ");
                }
                else if(flag1 == 1){
                    adjMatrix[i][j] = 1;
                    System.out.print(" " + adjMatrix[i][j] + " ");
                }
            }
            System.out.println("\n");
        }
    }

    static void printAdjacencyMatrix(){
        Collections.sort(NodesArray.nodes);
        ValuesFromConnection value = new ValuesFromConnection();

        System.out.print("\n");
        System.out.print("    ");
        for (int k = 0; k < size; k++) {
            System.out.print(NodesArray.nodes.get(k)._name + "  ");
        }
        System.out.print("\n");

        for (int i = 0; i < size; i++) {
            System.out.print(NodesArray.nodes.get(i)._name + ": ");
            for (int j = 0; j < size; j++){
                flag2 = value.findMeValueFromPairs(i, j);
                if(flag2 == 0){
                    adjMatrix[i][j] = 0;
                    System.out.print(" " + adjMatrix[i][j] + " ");
                }
                else if(flag2 == 1){
                    adjMatrix[i][j] = 1;
                    System.out.print(" " + adjMatrix[i][j] + " ");
                }
            }
            System.out.println("\n");
        }
    }
}
