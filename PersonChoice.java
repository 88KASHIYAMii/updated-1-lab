<<<<<<< HEAD
package PACKAGE_NAME;public class PersonChoice {
}
=======
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
>>>>>>> 3cc0cfa68197ade4e4f90f83d1f7360a62a0e842
