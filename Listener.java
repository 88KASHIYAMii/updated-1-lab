import java.util.Scanner;

public class Listener extends ClientClass{
    Integer _choise;
    static Scanner input = new Scanner(System.in);
    NodesArray na;

    // делаю метод выбора синхронизед
    // или мне нужно чтобы этот метод был ран
    // в отдельных классах создаю потоки и стартую этот метод ран
    public void makeChoise(Integer choise){

        this._choise = choise;
        while (_choise != 0){

            System.out.println("running from" + Thread.currentThread().getName());

            switch (_choise){

                case 1:{
                    System.out.println("Введи имя узла: ");
                    Integer nodeName = input.nextInt();

                    Node node = new Node(nodeName);
                    node.createNode(node);

                    System.out.println("Выберите действие");
                    System.out.println("1   -   Создать узел");
                    System.out.println("2   -   Создать связи");
                    System.out.println("3   -   Вывод матриц");
                    System.out.println("0   -   Выход");

                    break;
                }

                case 2:{

                    System.out.println("Созданные узлы");
                    for (int i = 0; i < NodesArray.nodes.size(); i++){
                        System.out.print(NodesArray.nodes.get(i)._name + " ");
                    }

                    System.out.println("Соединить узлы (Откуда [Пробел] Куда)");
                    Integer sender = input.nextInt();
                    Integer receiver = input.nextInt();

                    Connection connector = new Connection(sender, receiver);
                    connector.createConnection(connector);

                    System.out.println("Выберите действие");
                    System.out.println("1   -   Создать узел");
                    System.out.println("2   -   Создать связи");
                    System.out.println("3   -   Вывод матриц");
                    System.out.println("0   -   Выход");

                    break;
                }

                case 3:{
                    System.out.print("\n");
                    System.out.println("Вывод матрицы смежности");
                    Print.printAdjacencyMatrix();

                    System.out.print("\n");
                    System.out.println("Вывод матрицы инцидентности");
                    Print.printIncidenceMatrix();

                    System.out.println("Выберите действие");
                    System.out.println("1   -   Создать узел");
                    System.out.println("2   -   Создать связи");
                    System.out.println("3   -   Вывод матриц");
                    System.out.println("0   -   Выход");

                    break;
                }
            }
            _choise = input.nextInt();
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " завершил свою работу!");

        NodesArray.clearNodes();
        ConnectionsArray.clearConnections();
    }
}

