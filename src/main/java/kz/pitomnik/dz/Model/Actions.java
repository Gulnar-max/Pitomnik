package kz.pitomnik.dz.Model;

import java.util.*;

public class Actions {
    public static List<Dog> shelter = new ArrayList<>();

    public static void addDogs() {
        try {
            Scanner scannerName = new Scanner(System.in);
            Scanner scannerAge = new Scanner(System.in);
            Scanner scannerBreed = new Scanner(System.in);
            Dog dog = new Dog();

            System.out.println("Введите кличку собаки: ");
            dog.setName(scannerName.nextLine());

            System.out.println("Введите возраст собаки: ");
            dog.setAge(scannerAge.nextInt());

            System.out.println("Введите породу собаки: ");
            dog.setBreed(scannerBreed.nextLine());

            shelter.add(dog);
            System.out.println("Собака с данными " + dog.toString() + " успешно добавлена!");
        } catch (Exception exception) {
            System.out.println("Произошла ошибка при добавлении собаки: " + exception.getMessage());
        }


    }
    public void displayList() {
        System.out.println("Список животных в приюте: ");
        for (Dog dog : shelter) {
            System.out.println(dog.toString());
        }

    }
    public void updateDogAgeByName() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя собаки: ");
            String name = scanner.nextLine();

            boolean found = false;
            for (Dog dog : shelter) {
                if (dog.getName().equals(name)) {
                    System.out.print("Введите новый возраст собаки: ");
                    int newAge = scanner.nextInt();

                    dog.setAge(newAge);
                    found = true;
                    System.out.println("Возраст собаки " + name + " успешно изменен на " + newAge);
                    break;
                }
            }

            if (!found) {
                System.out.println("Собака с именем " + name + " не найдена в питомнике.");

            }
        }catch (Exception exception) {
            System.out.println("Произошла ошибка при обновлении возраста собаки: " + exception.getMessage());
        }
    }

    public void removeByName() {
        try {
            Scanner scannerRemove = new Scanner(System.in);
            System.out.println("Введите имя для удаления");
            String nameToRemove = scannerRemove.nextLine();
            boolean found1 = false;

            Iterator<Dog> iterator = shelter.listIterator();
            while (iterator.hasNext()) {
                Dog dog = iterator.next();
                if (dog.getName().equals(nameToRemove)) {
                    found1 = true;
                    System.out.println("Вы хотите удалить эту собаку " + dog.getName() + "?");
                    String confirmation = scannerRemove.nextLine();

                    if (confirmation.equalsIgnoreCase("да")) {
                        iterator.remove();
                        System.out.println("Собака удалена из базы данных.");
                    } else if (confirmation.equalsIgnoreCase("нет")) {
                        System.out.println("Удаление отменено.");
                    } else {
                        System.out.println("Некорректный ввод. Удаление отменено.");
                    }
                    break;

                }
            }

            if (!found1) {
                System.out.println("Собака с именем " + nameToRemove + "не найдена!");
            }
        } catch (Exception exception) {
            System.out.println("Произошла ошибка при удалении собаки из базы данных: " + exception.getMessage());
        }
        }
    }






