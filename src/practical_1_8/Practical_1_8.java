package practical_1_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Practical_1_8 {
    
    public static void main(String[] args) {
        System.out.println ("Козлова Динара Артёмовна, РИБО-01-22, Вариант 2, ");
        List<Telephone> telephoneList = new ArrayList<>();
        telephoneList.add(new Telephone("Panasonic", "X35235ZMD", "white", false));
        telephoneList.add(new Telephone("Samsung S10", "XYZ123456789", "black", true));
        telephoneList.add(new Telephone("Iphone X", "ASIOS77777QWERTY", "black", true));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить телефон ");
            System.out.println("2. Удалить телефон по серийному номеру ");
            System.out.println("3. Удалить все телефонны ");
            System.out.println("4. Выйти из программы ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите модель: ");
                    String model = scanner.next();
                    System.out.println("Введите серийный номер: ");
                    String serialNumber = scanner.next();
                    System.out.println("Введите цвет: ");
                    String color = scanner.next();
                    System.out.println("Тип телефона (true - мобильный, false - не мобильный): ");
                    boolean isMobile = scanner.nextBoolean();

                    boolean exists = false;
                    for (Telephone telephone : telephoneList) {
                        if (telephone.getSerialNumber().equals(serialNumber)) {
                            System.out.println("Телефон с таким серийным номером уже существует.");
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        telephoneList.add(new Telephone(model, serialNumber, color, isMobile));
                    }
                    break;

                case 2:
                    System.out.println("Введите серийный номер телефонного аппарата для удаления: ");
                    String removeSerialNumber = scanner.next();

                    Iterator<Telephone> iterator = telephoneList.iterator();
                    while (iterator.hasNext()) {
                        Telephone telephone = iterator.next();
                        if (telephone.getSerialNumber().equals(removeSerialNumber)) {
                            iterator.remove();
                            break;
                        }
                    }
                    break;

                case 3:
                    telephoneList.clear();
                    System.out.println("Все телефонные аппараты успешно удалены из списка.");
                    break;

                case 4:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Некорректный выбор, попробуйте еще раз.");
                    break;
            }

            System.out.println("Текущее содержимое списка телефонов: ");
            for (Telephone telephone : telephoneList) {
                System.out.println(telephone);
            }
        }
    }
}
