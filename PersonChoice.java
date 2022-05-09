import java.util.Scanner;

public class PersonChoice implements Runnable{
    Listener listener = new Listener();

    @Override
    public void run(){
        System.out.println("Выберите действие");
        System.out.println("1   -   Создать узел");
        System.out.println("2   -   Создать связи");
        System.out.println("3   -   Вывод матриц");
        System.out.println("0   -   Выход");

        Scanner scanner = new Scanner(System.in);
        Integer receiver = scanner.nextInt();
        listener.makeChoise(receiver);
    }
}
