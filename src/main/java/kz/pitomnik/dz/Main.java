package kz.pitomnik.dz;

import kz.pitomnik.dz.Model.Actions;
import kz.pitomnik.dz.Model.Text;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Text text = new Text();
            Actions dog = new Actions();

            int choice = 0;
            Scanner scanner = new Scanner(System.in);

            while (choice != 4) {
                text.menu();
                System.out.print("Введите номер команды для дальнейших действий: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        dog.addDogs();
                        dog.displayList();
                        break;
                    case 2:
                        dog.updateDogAgeByName();
                        dog.displayList();
                        break;
                    case 3:
                        dog.removeByName();
                        dog.displayList();
                        break;
                    case 4:
                        System.out.println("Выход из программы");
                        break;
                    default:
                        System.out.println("Некорректный выбор");
                        break;
                }


                }


        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
