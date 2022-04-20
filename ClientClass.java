import java.util.Scanner;

public class ClientClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие");
        System.out.println("1   -   Создать узел");
        System.out.println("2   -   Создать связи");
        System.out.println("3   -   Вывод матриц");
        System.out.println("0   -   Выход");

        Integer receiver = scanner.nextInt();

        Listener listen = new Listener();
        listen.makeChoise(receiver);
    }
}

