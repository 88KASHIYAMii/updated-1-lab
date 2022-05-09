import java.util.Scanner;

public class ClientClass {
    public static void main(String[] args){

        System.out.print("Сколько юзеров будет использовать приложение? ");
        Scanner scanner = new Scanner(System.in);
        Integer receiver = scanner.nextInt();


        for(int i = 0; i < receiver; i ++){

            PersonChoice person = new PersonChoice();
            Thread myThread = new Thread(person);
            myThread.start();

            try{
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}